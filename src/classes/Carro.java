package classes;

public class Carro extends Veiculo {
	
	private Integer quantidadeDePortas;
	
	public Carro() {
		
	}

	public Carro(Integer quantidadeDePortas) {
		super();
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public Integer getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(Integer quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

	@Override
	public String toString() {
		return "Carro [Placa=" + getPlaca() + ", Modelo=" + getModelo() + ", Ano=" + getAno() + 
				", Cor=" + getCor() + ", Quantidade de portas=" + getQuantidadeDePortas() + "]\n";
	}
	
}
