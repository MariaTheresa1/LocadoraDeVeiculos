package classes;

import java.util.Scanner;

public class Main {

	public static Integer exibirMenu() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("****** MENU ******\n");

		System.out.println("----- VEÍCULOS -----");
		System.out.println("1- Cadastrar Veículo");
		System.out.println("2- Alterar Veículo");
		System.out.println("3- Buscar Veículo\n");
		
		System.out.println("----- CLIENTES -----");
		System.out.println("4- Cadastrar Cliente");
		System.out.println("5- Alterar Cliente\n");
		
		System.out.println("----- ALUGUEL -----");
		System.out.println("6- Alugar Veículo");
		System.out.println("7- Devolver Veículo\n");
		
		System.out.println("Para sair digite -1.\n");
		
		System.out.print("Digite a opcao desejada: ");
		Integer opcao = scanner.nextInt();			
		
		switch(opcao) {
		
			case 1:				
				do {
					System.out.println("----- VEÍCULOS -----");
					System.out.println("8- Cadastrar Carro");
					System.out.println("9- Cadastrar Moto");
					System.out.println("10- Cadastrar Caminhão");
					System.out.println("0- Voltar\n");
					opcao = scanner.nextInt();	
					
					switch(opcao) {
						case 8:		
							return opcao;
						case 9:
							return opcao;
						case 10:
							return opcao;
						case 0:
							break;
						default:
							System.out.println("Opção inválida.\n");
							break;
					}
					
				} while (opcao != 0);
				
				return opcao;
				
			case 2:				
				return opcao;
				
			case 3:							
				return opcao;
				
			case 4:				
				do {
					System.out.println("----- CLIENTES -----");
					System.out.println("11- Cadastrar Pessoa Física");
					System.out.println("12- Cadastrar Pessoa Jurídica");
					System.out.println("0- Voltar\n");
					opcao = scanner.nextInt();	
					
					switch(opcao) {
						case 11:
							return opcao;		
						case 12:
							return opcao;				
						case 0:
							break;
						default:
							System.out.println("Opção inválida.\n");
							break;
					}
					
				} while (opcao != 0);
				
				return opcao;
				
			case 5:				
				do {
					System.out.println("----- CLIENTES -----");
					System.out.println("13- Alterar Pessoa Física");
					System.out.println("14- Alterar Pessoa Jurídica");
					System.out.println("0- Voltar\n");
					opcao = scanner.nextInt();	
					
					switch(opcao) {
						case 13:
							return opcao;				
						case 14:
							return opcao;			
						case 0:
							break;
						default:
							System.out.println("Opção inválida.\n");
							break;
					}
					
				} while (opcao != 0);
				
				return opcao;
				
			case 6:
				do {
					System.out.println("----- ALUGUEL -----");
					System.out.println("15- Alugar Veículo para Pessoa Física");
					System.out.println("16- Alugar Veículo para Pessoa Jurídica");
					System.out.println("0- Voltar\n");
					opcao = scanner.nextInt();	
					
					switch(opcao) {
						case 15:
							return opcao;				
						case 16:
							return opcao;				
						case 0:
							break;
						default:
							System.out.println("Opção inválida.\n");
							break;
					}
					
				} while (opcao != 0);				
				
				return opcao;
				
			case 7:
				return opcao;
				
			case -1:
				break;				
				
			default:
				System.out.println("Opção inválida.\n");
				break;
		}
		
		return opcao;

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		Integer opcao;
		
		GestaoDeClientes gestaoDeClientes = new GestaoDeClientes();
		
		do {			
			opcao = exibirMenu();			
			
			switch(opcao) {
			
				// 2- Alterar Veículo
				case 2:
					break;
					
				// 3- Buscar Veículo
				case 3:
					break;
				
				// 7- Devolver Veículo
				case 7:
					break;
					
				// 8- Cadastrar Carro
				case 8:
					break;
					
				// 9- Cadastrar Moto
				case 9:
					break;
					
				// 10- Cadastrar Caminhão
				case 10:
					break;
				// 11- Cadastrar Pessoa Física
				case 11:
					PessoaFisica clientePF = gestaoDeClientes.cadastrarClientePessoaFisica();
					gestaoDeClientes.clientes.add(clientePF);
					break;
					
				// 12- Cadastrar Pessoa Jurídica
				case 12:					
					PessoaJuridica clientePJ = gestaoDeClientes.cadastrarClientePessoaJuridica();
					gestaoDeClientes.clientes.add(clientePJ);
					break;
					
				// 13- Alterar Pessoa Física
				case 13:
					break;
					
				// 14- Alterar Pessoa Jurídica					
				case 14:
					break;
					
				// 15- Alugar Veículo para Pessoa Física
				case 15:
					break;
					
				// 16- Alugar Veículo para Pessoa Jurídica
				case 16:
					break;					
				
				case -1:
					break;					
				
				default:
					System.out.println("Opção inválida.\n");
					break;				
			}
			
		} while (opcao != -1);
		
		System.out.println(gestaoDeClientes.clientes);
	}
}
