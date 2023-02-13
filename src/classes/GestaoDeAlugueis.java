package classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoDeAlugueis {

	ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
	Scanner scanner = new Scanner(System.in);

	void alugarVeiculo(ArrayList<PessoaFisica> clientesPF, ArrayList<PessoaJuridica> clientesPJ,
			ArrayList<Veiculo> veiculos, ArrayList<Aluguel> alugueis) {

		Integer opcao;
		Integer indiceCliente = -1;
		Integer indiceVeiculo = -1;		
		Cliente cliente = null;
		
		do {
			System.out.println("Alugar veículo para:");
			System.out.println("1- Pessoa Física");
			System.out.println("2- Pessoa Jurídica");
			System.out.println("0- Cancelar");
			System.out.print("Digite a opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Informe o CPF do cliente: ");
				String cpf = scanner.next();
				for (Integer i = 0; i < clientesPF.size(); i++) {
					if (clientesPF.get(i).getCpf().equals(cpf)) {
						indiceCliente = i;
						cliente = (Cliente)clientesPF.get(i);
						opcao = 0;
						break;
					}
				}
				if (indiceCliente == -1) {
					System.out.println("CPF de cliente não encontrado.");
					break;
				}
				
				break;
				
				
			case 2:
				System.out.print("Informe o CNPJ do cliente: ");
				String cnpj = scanner.next();
				for (Integer i = 0; i < clientesPJ.size(); i++) {
					if (clientesPJ.get(i).getCnpj().equals(cnpj)) {
						indiceCliente = i;
						cliente = (Cliente)clientesPJ.get(i);
						opcao = 0;
						break;
					}
				}
				if (indiceCliente == -1) {
					System.out.println("CNPJ de cliente não encontrado.");
					break;
				} else {
					break;
				}
				
			case 0:
				return;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);

		do {			
			System.out.print("Informe a placa do veículo: ");
			String placa = scanner.next();
			for (Integer i = 0; i < veiculos.size(); i++) {
				if (veiculos.get(i).getPlaca().equals(placa)) {
					indiceVeiculo = i;
					opcao = 0;
					break;
				}
			}
			if (indiceVeiculo == -1) {
				System.out.println("Placa de veículo não encontrada.");
				System.out.println("Tentar novamente?\n1- Sim\n0- Não");
				System.out.print("Escolha a opção: ");
				opcao = scanner.nextInt();
				if (opcao == 0)
					return;
			} else {
				break;
			}
			
		} while (opcao != 0);
		
		System.out.print("Informe o local: ");
		String local = scanner.next();
		LocalDateTime dataHoraAtual = LocalDateTime.now();

		Aluguel aluguel = new Aluguel(local, dataHoraAtual, veiculos.get(indiceVeiculo), cliente);
		
		alugueis.add(aluguel);
		veiculos.get(indiceVeiculo).setAlugado(true);
		
		System.out.println("Veículo alugado com sucesso.");
		System.out.println(aluguel + "\n");
	}

	void devolverVeiculo(ArrayList<Aluguel> alugueis) {

		System.out.println("Informe a placa do veículo:");
		String placa = scanner.next();
		Float divida;

		for (Integer i = 0; i < alugueis.size(); i++) {
			if (alugueis.get(i).getVeiculo().getPlaca().equals(placa)) {
				if (alugueis.get(i).getVeiculo().getAlugado() == true) {

					LocalDateTime dataAluguel = alugueis.get(i).getData();
					LocalDateTime dataHoraAtual = LocalDateTime.now();

					Duration duracao = Duration.between(dataAluguel, dataHoraAtual);
					long diferencaEmDias = duracao.toDays();

					divida = diferencaEmDias * alugueis.get(i).getVeiculo().getTipo().valorTipo;

					// Regras de desconto
					if (alugueis.get(i).getCliente() instanceof PessoaFisica && diferencaEmDias > 5) {

						divida -= divida * 0.05f;

					} else {
						if (alugueis.get(i).getCliente() instanceof PessoaJuridica && diferencaEmDias > 3) {

							divida -= divida * 0.1f;

						}
					}

					alugueis.get(i).getCliente()
							.setSaldoDevedor(alugueis.get(i).getCliente().getSaldoDevedor() + divida);
					alugueis.get(i).getVeiculo().setAlugado(false);

					System.out.println("Veículo devolvido com sucesso.");
					System.out.println("Placa do veículo: " + alugueis.get(i).getVeiculo().getPlaca());
					if (alugueis.get(i).getCliente() instanceof PessoaFisica) {
						PessoaFisica pessoaFisica = (PessoaFisica) alugueis.get(i).getCliente();
						System.out.println("CPF do Cliente: " + pessoaFisica.getCpf());
					} else {
						PessoaJuridica pessoaJuridica = (PessoaJuridica) alugueis.get(i).getCliente();
						System.out.println("CNPJ do Cliente: " + pessoaJuridica.getCnpj());
					}
					System.out.println("Saldo devedor: " + alugueis.get(i).getCliente().getSaldoDevedor() + "\n");

					return;
				} else {
					System.out.println("Este veículo não está alugado.");
					return;
				}
			}
		}
		System.out.println("Placa do veículo não encontrada.");
	}
}
