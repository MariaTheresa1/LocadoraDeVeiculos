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
		GestaoDeVeiculos gestaoDeVeiculos = new GestaoDeVeiculos();
		GestaoDeAlugueis gestaoDeAlugueis = new GestaoDeAlugueis();
		
		do {			
			opcao = exibirMenu();			
			
			switch(opcao) {
			
				// 2- Alterar Ve�culo
				case 2:
					gestaoDeVeiculos.alterarVeiculo(gestaoDeVeiculos.veiculos);
					break;
					
				// 3- Buscar Ve�culo
				case 3:
					gestaoDeVeiculos.buscarVeiculo(gestaoDeVeiculos.veiculos);
					break;
				
				// 7- Alugar Ve�culo
				case 6:
					gestaoDeAlugueis.alugarVeiculo(gestaoDeClientes.clientesPF, gestaoDeClientes.clientesPJ, gestaoDeVeiculos.veiculos, gestaoDeAlugueis.alugueis);
					break;
					
				// 7- Devolver Ve�culo
				case 7:
					gestaoDeAlugueis.devolverVeiculo(gestaoDeAlugueis.alugueis);
					break;
					
				// 8- Cadastrar Carro
				case 8:					
					gestaoDeVeiculos.veiculos.add(gestaoDeVeiculos.cadastrarCarro());
					break;
					
				// 9- Cadastrar Moto
				case 9:
					gestaoDeVeiculos.veiculos.add(gestaoDeVeiculos.cadastrarMoto());
					break;
					
				// 10- Cadastrar Caminh�o
				case 10:
					gestaoDeVeiculos.veiculos.add(gestaoDeVeiculos.cadastrarCaminhao());
					break;
					
				// 11- Cadastrar Pessoa F�sica
				case 11:
					gestaoDeClientes.clientesPF.add(gestaoDeClientes.cadastrarClientePessoaFisica());
					break;
					
				// 12- Cadastrar Pessoa Jur�dica
				case 12:
					gestaoDeClientes.clientesPJ.add(gestaoDeClientes.cadastrarClientePessoaJuridica());
					break;
					
				// 13- Alterar Pessoa F�sica
				case 13:
					gestaoDeClientes.alterarClientePessoaFisica(gestaoDeClientes.clientesPF);
					break;
					
				// 14- Alterar Pessoa Jur�dica					
				case 14:
					gestaoDeClientes.alterarClientePessoaJuridica(gestaoDeClientes.clientesPJ);
					break;
					
				case -1:
					break;					
				
				default:
					System.out.println("Op��o inv�lida.\n");
					break;				
			}
			
		} while (opcao != -1);
		
		System.out.println("Clientes Pessoa F�sica:\n" + gestaoDeClientes.clientesPF);
		System.out.println("Clientes Pessoa Jur�dica:\n" + gestaoDeClientes.clientesPJ);

		System.out.println("Ve�culos:\n" + gestaoDeVeiculos.veiculos);

	}
}
