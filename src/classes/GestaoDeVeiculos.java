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
	
	void alterarVeiculo() {
		
	}
	
	void buscarVeiculo(Integer placa) {
		
	}
}
