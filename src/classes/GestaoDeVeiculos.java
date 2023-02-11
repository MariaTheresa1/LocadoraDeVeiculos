package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoDeVeiculos {

	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	Scanner scanner = new Scanner(System.in);
	
	Carro cadastrarCarro() {
		
		Carro veiculo = new Carro();
		
		System.out.print("Informe a placa: ");
		veiculo.setPlaca(scanner.next());
		
		System.out.print("Informe o modelo: ");
		veiculo.setModelo(scanner.next());
		
		System.out.print("Informe o ano: ");
		veiculo.setAno(scanner.nextInt());
		
		System.out.print("Informe a cor: ");
		veiculo.setCor(scanner.next());
		
		System.out.print("Quantidade de portas: ");
		veiculo.setAno(scanner.nextInt());
		
		return veiculo;
	}
	
	Moto cadastrarMoto() {
		
		Moto veiculo = new Moto();
		
		System.out.print("Informe a placa: ");
		veiculo.setPlaca(scanner.next());
		
		System.out.print("Informe o modelo: ");
		veiculo.setModelo(scanner.next());
		
		System.out.print("Informe o ano: ");
		veiculo.setAno(scanner.nextInt());
		
		System.out.print("Informe a cor: ");
		veiculo.setCor(scanner.next());
		
		System.out.print("Informe o tipo de carenagem: ");
		veiculo.setTipoDeCarenagem(scanner.next());
		
		return veiculo;
	}
	
	Caminhao cadastrarCaminhao() {
		
		Caminhao veiculo = new Caminhao();
		
		System.out.print("Informe a placa: ");
		veiculo.setPlaca(scanner.next());
		
		System.out.print("Informe o modelo: ");
		veiculo.setModelo(scanner.next());
		
		System.out.print("Informe o ano: ");
		veiculo.setAno(scanner.nextInt());
		
		System.out.print("Informe a cor: ");
		veiculo.setCor(scanner.next());
		
		System.out.print("Informe a carga máxima suportada: ");
		veiculo.setCargaMaxima(scanner.nextFloat());
		
		return veiculo;
	}
	
	void alterarVeiculo(ArrayList<Veiculo> veiculos) {
		
		System.out.print("Informe a placa do veículo a ser alterado: ");
		String placa = scanner.next();
		
		for(Veiculo veiculo: veiculos) {
			if(veiculo.getPlaca().equals(placa)) {
				
				System.out.println("Qual campo você deseja alterar?");
				System.out.println("1- Placa");
				System.out.println("2- Modelo");
				System.out.println("3- Ano");
				System.out.println("4- Cor");
				
				if (veiculo instanceof Carro) {
					System.out.println("5- Quantidade de portas");
				} else {
					if (veiculo instanceof Moto) {
						System.out.println("5- Tipo de carenagem");
					} else { // Caminhão
						System.out.println("5- Capacidade máxima de carga");
					}
				}
				
				System.out.println("0- Cancelar alteração");
				System.out.print("Digite a opção: ");
				Integer opcao = scanner.nextInt();
				
				switch (opcao) {
				case 1:
					System.out.print("Informe a nova placa: ");
					veiculo.setPlaca(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 2:
					System.out.print("Informe o novo modelo: ");
					veiculo.setModelo(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 3:
					System.out.print("Informe o novo ano: ");
					veiculo.setAno(scanner.nextInt());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 4:
					System.out.print("Informe a nova cor: ");
					veiculo.setCor(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;
				
				case 5:					
					if (veiculo instanceof Carro) {
						Carro carro = (Carro)veiculo;

						System.out.print("Informe a nova quantidade de portas: ");
						carro.setQuantidadeDePortas(scanner.nextInt());
						System.out.println("Dado alterado com sucesso.");
						break;
						
					} else {
						if (veiculo instanceof Moto) {
							Moto moto = (Moto)veiculo;
							
							System.out.print("Informe o novo tipo de carenagem: ");
							moto.setTipoDeCarenagem(scanner.next());
							System.out.println("Dado alterado com sucesso.");
							break;
						} else { // Caminhão
							Caminhao caminhao = (Caminhao)veiculo;
							
							System.out.print("Informe a nova carga máxima: ");
							caminhao.setCargaMaxima(scanner.nextFloat());
							System.out.println("Dado alterado com sucesso.");
							break;
						}
					}		
					
				case 0:
					break;
					
				default:
					System.out.println("Opção inválida.");
					break;
				}
				return;
			} 			
		}
		System.out.print("Número da placa não encontrado.");
	}
	
	void buscarVeiculo(Integer placa) {
		
	}
}
