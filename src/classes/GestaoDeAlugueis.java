package classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoDeAlugueis {
	
	ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
	Scanner scanner = new Scanner (System.in);
	
	void alugarVeiculo(ArrayList<PessoaFisica> clientesPF, ArrayList<PessoaJuridica> clientesPJ, ArrayList<Veiculo> veiculos) {
		
		Integer opcao;
		Integer indiceCliente = -1;
		Integer indiceVeiculo = -1;
		
		do {			
			System.out.println("Alugar ve�culo para:");
			System.out.println("1- Pessoa F�sica");
			System.out.println("2- Pessoa Jur�dica");	
			System.out.println("0- Cancelar");
			System.out.print("Digite a op��o: ");
			opcao = scanner.nextInt();			
			
			switch(opcao) {
			case 1:
				System.out.println("Informe o CPF do cliente:");
				String cpf = scanner.next();
				for(Integer i = 0 ; i < clientesPF.size(); i++) {
					if(clientesPF.get(i).getCpf().equals(cpf)) {
						indiceCliente = i;
						break;
					}
				}
				if(indiceCliente == -1)
					System.out.println("CPF de cliente n�o encontrado.");

				break;
			case 2:
				System.out.println("Informe o CNPJ do cliente:");
				String cnpj = scanner.next();
				for(Integer i = 0 ; i < clientesPJ.size(); i++) {
					if(clientesPJ.get(i).getCnpj().equals(cnpj)) {
						indiceCliente = i;
						break;
					}
				}
				if(indiceCliente == -1)
					System.out.println("CNPJ de cliente n�o encontrado.");
				
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;				
			}
			
		} while (opcao != 0);
		
		do {
			if(indiceCliente != -1) {
				System.out.println("Informe a placa do ve�culo:");
				String placa = scanner.next();
				for(Integer i = 0 ; i < veiculos.size(); i++) {
					if(veiculos.get(i).getPlaca().equals(placa)) {
						indiceVeiculo = i;
					}
				}
				if(indiceVeiculo == -1) {
					System.out.println("Placa de ve�culo n�o encontrada.");
					System.out.println("Tentar novamente?\n1- Sim\n0- N�o");
					System.out.print("Escolha a op��o: ");
					opcao = scanner.nextInt();			
				}
			}
		} while (opcao != 0);
			
		if (indiceVeiculo != 1) {
			
			System.out.println("Informe o local:");
			String local = scanner.next();
			
	        LocalDateTime dataHoraAtual = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

			alugueis.add(new Aluguel(local, dataHoraAtual, veiculos.get(indiceVeiculo), (Cliente)clientesPF.get(indiceCliente)));
			
			System.out.println("Ve�culo alugado com sucesso.");
			System.out.println("Local: " + local);
			System.out.println("Data e hor�rio: " + dataHoraAtual.format(formatter));
			System.out.println(clientesPF.get(indiceCliente));
			System.out.println(veiculos.get(indiceVeiculo));
			
			veiculos.get(indiceVeiculo).setAlugado(true);
			
		} else {
			System.out.println("Opera��o cancelada.");
		}
	}

	void devolverVeiculo(ArrayList<Aluguel> alugueis) {
		
		System.out.println("Informe a placa do ve�culo:");
		String placa = scanner.next();
		Float divida;
		
		for(int i = 0; i < alugueis.size(); i++) {
			if (alugueis.get(i).getVeiculo().getPlaca().equals(placa)) {
				if(alugueis.get(i).getVeiculo().getAlugado() == true) {

					LocalDateTime dataAluguel = alugueis.get(i).getData();
			        LocalDateTime dataHoraAtual = LocalDateTime.now();
			        
			        Duration duracao = Duration.between(dataAluguel, dataHoraAtual);
			        long diferencaEmDias = duracao.toDays();
			        
			        divida = diferencaEmDias * alugueis.get(i).getVeiculo().getTipo().valorTipo;
			      
			        // Regras de desconto
			        if(alugueis.get(i).getCliente() instanceof PessoaFisica && diferencaEmDias > 5) {
			        	
			        	divida -= divida * 0.05f; 
			        	
			        } else {			        	
			        	if (alugueis.get(i).getCliente() instanceof PessoaJuridica && diferencaEmDias > 3) {
			        		
				        	divida -= divida * 0.1f; 

			        	}
			        }
			        
			        alugueis.get(i).getCliente().setSaldoDevedor(alugueis.get(i).getCliente().getSaldoDevedor() + divida);
			        alugueis.get(i).getVeiculo().setAlugado(false);

			        System.out.println("Ve�culo devolvido com sucesso.");
			        System.out.println("Placa do ve�culo: " +  alugueis.get(i).getVeiculo().getPlaca());
			        if(alugueis.get(i).getCliente() instanceof PessoaFisica) {
			        	PessoaFisica pessoaFisica = (PessoaFisica)alugueis.get(i).getCliente();
			        	System.out.println("CPF do Cliente: " + pessoaFisica.getCpf());
			        	} else {
				        	PessoaJuridica pessoaJuridica = (PessoaJuridica)alugueis.get(i).getCliente();
				        	System.out.println("CNPJ do Cliente: " + pessoaJuridica.getCnpj());
			        	}
			        System.out.println("Saldo devedor: " + alugueis.get(i).getCliente().getSaldoDevedor());

			        return;
				} else {
					System.out.println("Este ve�culo n�o est� alugado.");
			        return;
				}
			}
		}
		System.out.println("Placa do ve�culo n�o encontrada.");     
	}
}
