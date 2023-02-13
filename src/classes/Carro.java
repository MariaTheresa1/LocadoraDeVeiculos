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
		String alugado;
		if(getAlugado() == true) {
			alugado = "Sim";
		} else {
			alugado = "Não";
		}
		return "Carro [Placa=" + getPlaca() + ", Modelo=" + getModelo() +
				", Ano=" + getAno() + ", Cor=" + getCor() + ", Alugado=" +
				alugado + ", Quantidade de portas=" + getQuantidadeDePortas() + "]\n";
	}
	
}
