package classes;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Veiculo.Tipo;

public class GestaoDeVeiculos {

	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	Scanner scanner = new Scanner(System.in);
	Integer tipo;
	Tipo tipoDeVeiculo;
	
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
		
		do {
			System.out.print("Informe o tipo:\n");
			System.out.println("1- Pequeno");
			System.out.println("2- M�dio");
			System.out.println("3- SUV");
			tipo = scanner.nextInt();
			
			switch (tipo) {
			case 1: {
				tipoDeVeiculo = Tipo.PEQUENO;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			case 2: {
				tipoDeVeiculo = Tipo.MEDIO;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			case 3: {
				tipoDeVeiculo = Tipo.SUV;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			default:
				System.out.println("Op��o inv�lida, tente novamente.");
			}
		} while (tipo <= 0 || tipo > 3);
		
		System.out.print("Quantidade de portas: ");
		veiculo.setQuantidadeDePortas(scanner.nextInt());
		
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
		
		do {
			System.out.print("Informe o tipo:\n");
			System.out.println("1- Pequeno");
			System.out.println("2- M�dio");
			System.out.println("3- SUV");
			tipo = scanner.nextInt();
			
			switch (tipo) {
			case 1: {
				tipoDeVeiculo = Tipo.PEQUENO;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			case 2: {
				tipoDeVeiculo = Tipo.MEDIO;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			case 3: {
				tipoDeVeiculo = Tipo.SUV;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			default:
				System.out.println("Op��o inv�lida, tente novamente.");
			}
		} while (tipo <= 0 || tipo > 3);
		
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
		
		do {
			System.out.print("Informe o tipo:\n");
			System.out.println("1- Pequeno");
			System.out.println("2- M�dio");
			System.out.println("3- SUV");
			tipo = scanner.nextInt();
			
			switch (tipo) {
			case 1: {
				tipoDeVeiculo = Tipo.PEQUENO;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			case 2: {
				tipoDeVeiculo = Tipo.MEDIO;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			case 3: {
				tipoDeVeiculo = Tipo.SUV;
				veiculo.setTipo(tipoDeVeiculo);
				break;
			}
			default:
				System.out.println("Op��o inv�lida, tente novamente.");
				break;
			}
		} while (tipo <= 0 || tipo > 3);
		
		System.out.print("Informe a carga m�xima suportada: ");
		veiculo.setCargaMaxima(scanner.nextFloat());
		
		return veiculo;
	}
	
	void alterarVeiculo(ArrayList<Veiculo> veiculos) {
		
		System.out.print("Informe a placa do ve�culo a ser alterado: ");
		String placa = scanner.next();
		
		for(Veiculo veiculo: veiculos) {
			if(veiculo.getPlaca().equals(placa)) {
				
				System.out.println("Qual campo voc� deseja alterar?");
				System.out.println("1- Placa");
				System.out.println("2- Modelo");
				System.out.println("3- Ano");
				System.out.println("4- Cor");
				System.out.println("5- Tipo");

				if (veiculo instanceof Carro) {
					System.out.println("6- Quantidade de portas");
				} else {
					if (veiculo instanceof Moto) {
						System.out.println("6- Tipo de carenagem");
					} else { // Caminh�o
						System.out.println("6- Capacidade m�xima de carga");
					}
				}
				
				System.out.println("0- Cancelar altera��o");
				System.out.print("Digite a op��o: ");
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
					do {
						System.out.print("Informe o tipo: ");
						System.out.println("1- Pequeno");
						System.out.println("2- M�dio");
						System.out.println("3- SUV");
						tipo = scanner.nextInt();
						
						switch (tipo) {
						case 1: {
							tipoDeVeiculo = Tipo.PEQUENO;
							veiculo.setTipo(tipoDeVeiculo);
							System.out.println("Dado alterado com sucesso.");
							break;
						}
						case 2: {
							tipoDeVeiculo = Tipo.MEDIO;
							veiculo.setTipo(tipoDeVeiculo);
							System.out.println("Dado alterado com sucesso.");
							break;
						}
						case 3: {
							tipoDeVeiculo = Tipo.SUV;
							veiculo.setTipo(tipoDeVeiculo);
							System.out.println("Dado alterado com sucesso.");
							break;
						}
						default:
							System.out.println("Op��o inv�lida, tente novamente.");
							break;
						}
					} while (tipo <= 0 || tipo > 3);					

					break;
				
				case 6:					
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
						} else { // Caminh�o
							Caminhao caminhao = (Caminhao)veiculo;
							
							System.out.print("Informe a nova carga m�xima: ");
							caminhao.setCargaMaxima(scanner.nextFloat());
							System.out.println("Dado alterado com sucesso.");
							break;
						}
					}		
					
				case 0:
					break;
					
				default:
					System.out.println("Op��o inv�lida.");
					break;
				}
				return;
			} 			
		}
		System.out.println("N�mero da placa n�o encontrado.");
	}
	
	void buscarVeiculo(ArrayList<Veiculo> veiculos) {
		System.out.print("Informe a placa do ve�culo que deseja buscar: ");
		String placa = scanner.next();
		
		for(Veiculo veiculo: veiculos) {
			if(veiculo.getPlaca().equals(placa)) {
				
				System.out.println("Ve�culo encontrado.");
				
				if (veiculo instanceof Carro) {		
					
					Carro carro = (Carro)veiculo;
					System.out.println(carro);
					
				} else {
					if (veiculo instanceof Moto) {	
						
						Moto moto = (Moto)veiculo;
						System.out.println(moto);
						
					} else { // Caminh�o			
						
						Caminhao caminhao = (Caminhao)veiculo;
						System.out.println(caminhao);				
					}
				}				
				return;
			}
		}
		System.out.println("N�mero da placa n�o encontrado.");
	}
}
