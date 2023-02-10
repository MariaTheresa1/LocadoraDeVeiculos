package classes;

import java.util.Scanner;

public class Main {

	public static Integer exibirMenu() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("****** MENU ******\n");

		System.out.println("----- VE�CULOS -----");
		System.out.println("1- Cadastrar Ve�culo");
		System.out.println("2- Alterar Ve�culo");
		System.out.println("3- Buscar Ve�culo\n");
		
		System.out.println("----- CLIENTES -----");
		System.out.println("4- Cadastrar Cliente");
		System.out.println("5- Alterar Cliente\n");
		
		System.out.println("----- ALUGUEL -----");
		System.out.println("6- Alugar Ve�culo");
		System.out.println("7- Devolver Ve�culo\n");
		
		System.out.println("Para sair digite -1.\n");
		
		System.out.print("Digite a opcao desejada: ");
		Integer opcao = scanner.nextInt();			
		
		switch(opcao) {
		
			case 1:				
				do {
					System.out.println("----- VE�CULOS -----");
					System.out.println("8- Cadastrar Carro");
					System.out.println("9- Cadastrar Moto");
					System.out.println("10- Cadastrar Caminh�o");
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
							System.out.println("Op��o inv�lida.\n");
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
					System.out.println("11- Cadastrar Pessoa F�sica");
					System.out.println("12- Cadastrar Pessoa Jur�dica");
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
							System.out.println("Op��o inv�lida.\n");
							break;
					}
					
				} while (opcao != 0);
				
				return opcao;
				
			case 5:				
				do {
					System.out.println("----- CLIENTES -----");
					System.out.println("13- Alterar Pessoa F�sica");
					System.out.println("14- Alterar Pessoa Jur�dica");
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
							System.out.println("Op��o inv�lida.\n");
							break;
					}
					
				} while (opcao != 0);
				
				return opcao;
				
			case 6:
				do {
					System.out.println("----- ALUGUEL -----");
					System.out.println("15- Alugar Ve�culo para Pessoa F�sica");
					System.out.println("16- Alugar Ve�culo para Pessoa Jur�dica");
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
							System.out.println("Op��o inv�lida.\n");
							break;
					}
					
				} while (opcao != 0);				
				
				return opcao;
				
			case 7:
				return opcao;
				
			case -1:
				break;				
				
			default:
				System.out.println("Op��o inv�lida.\n");
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
			
				// 2- Alterar Ve�culo
				case 2:
					break;
					
				// 3- Buscar Ve�culo
				case 3:
					break;
				
				// 7- Devolver Ve�culo
				case 7:
					break;
					
				// 8- Cadastrar Carro
				case 8:
					break;
					
				// 9- Cadastrar Moto
				case 9:
					break;
					
				// 10- Cadastrar Caminh�o
				case 10:
					break;
				// 11- Cadastrar Pessoa F�sica
				case 11:
					PessoaFisica clientePF = gestaoDeClientes.cadastrarClientePessoaFisica();
					gestaoDeClientes.clientes.add(clientePF);
					break;
					
				// 12- Cadastrar Pessoa Jur�dica
				case 12:					
					PessoaJuridica clientePJ = gestaoDeClientes.cadastrarClientePessoaJuridica();
					gestaoDeClientes.clientes.add(clientePJ);
					break;
					
				// 13- Alterar Pessoa F�sica
				case 13:
					break;
					
				// 14- Alterar Pessoa Jur�dica					
				case 14:
					break;
					
				// 15- Alugar Ve�culo para Pessoa F�sica
				case 15:
					break;
					
				// 16- Alugar Ve�culo para Pessoa Jur�dica
				case 16:
					break;					
				
				case -1:
					break;					
				
				default:
					System.out.println("Op��o inv�lida.\n");
					break;				
			}
			
		} while (opcao != -1);
		
		System.out.println(gestaoDeClientes.clientes);
	}
}
