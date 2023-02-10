package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoDeClientes {
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
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
	
	void alterarCliente() {
		
	}
	
	void alugarVeiculo() {
		
	}
	
	void devolverVeiculo() {
		
	}
	
}
