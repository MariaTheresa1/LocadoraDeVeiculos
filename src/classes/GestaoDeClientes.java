package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoDeClientes {

	ArrayList<PessoaFisica> clientesPF = new ArrayList<PessoaFisica>();
	ArrayList<PessoaJuridica> clientesPJ = new ArrayList<PessoaJuridica>();

	Scanner scanner = new Scanner(System.in);

	PessoaFisica cadastrarClientePessoaFisica() {

		PessoaFisica cliente = new PessoaFisica();

		System.out.print("Informe o CPF: ");
		cliente.setCpf(scanner.next());

		System.out.print("Informe o nome: ");
		cliente.setNome(scanner.next());

		System.out.print("Informe a data de nascimento: ");
		cliente.setDataDeNascimento(scanner.next());

		System.out.print("Informe o endereço: ");
		cliente.setEndereco(scanner.next());

		System.out.print("Informe o telefone: ");
		cliente.setTelefone(scanner.next());

		System.out.print("Informe o e-mail: ");
		cliente.setEmail(scanner.next());

		return cliente;
	}

	PessoaJuridica cadastrarClientePessoaJuridica() {

		PessoaJuridica cliente = new PessoaJuridica();

		System.out.print("Informe o CNPJ: ");
		cliente.setCnpj(scanner.next());

		System.out.print("Informe o nome: ");
		cliente.setNome(scanner.next());

		System.out.print("Informe o endereço: ");
		cliente.setEndereco(scanner.next());

		System.out.print("Informe o telefone: ");
		cliente.setTelefone(scanner.next());

		System.out.print("Informe o e-mail: ");
		cliente.setEmail(scanner.next());

		return cliente;
	}

	void alterarClientePessoaFisica(ArrayList<PessoaFisica> clientes) {

		System.out.print("Informe o CPF do cliente a ser alterado: ");
		String cpf = scanner.next();
		
		for (PessoaFisica cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {

				System.out.println("Qual campo você deseja alterar?");
				System.out.println("1- CPF");
				System.out.println("2- Nome");
				System.out.println("3- Data de nascimento");
				System.out.println("4- Endereço");
				System.out.println("5- Telefone");
				System.out.println("6- Email");
				System.out.println("0- Cancelar alteração");
				System.out.print("Digite a opção: ");
				Integer opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					System.out.print("Informe o novo CPF: ");
					cliente.setCpf(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 2:
					System.out.print("Informe o novo nome: ");
					cliente.setNome(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 3:
					System.out.print("Informe a nova data de nascimento: ");
					cliente.setDataDeNascimento(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 4:
					System.out.print("Informe o novo endereço: ");
					cliente.setEndereco(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 5:
					System.out.print("Informe o novo telefone: ");
					cliente.setTelefone(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;

				case 6:
					System.out.print("Informe o novo e-mail: ");
					cliente.setEmail(scanner.next());
					System.out.println("Dado alterado com sucesso.");
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Opção inválida.");
					break;
				}

			} else {
				System.out.println("CPF de cliente não encontrado.");
			}
		}

	}

	void alugarVeiculo() {

	}

	void devolverVeiculo() {

	}

}
