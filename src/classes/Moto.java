package classes;

public class Moto extends Veiculo {
	
	private String tipoDeCarenagem;
	
	public Moto() {
		
	}
	
	public Moto(String tipoDeCarenagem) {
		super();
		this.tipoDeCarenagem = tipoDeCarenagem;
	}

	public String getTipoDeCarenagem() {
		return tipoDeCarenagem;
	}

	public void setTipoDeCarenagem(String tipoDeCarenagem) {
		this.tipoDeCarenagem = tipoDeCarenagem;
	}

	@Override
	public String toString() {
		String alugado;
		if(getAlugado() == true) {
			alugado = "Sim";
		} else {
			alugado = "Não";
		}
		return "Moto [Placa=" + getPlaca() + ", Modelo=" + getModelo() +
				", Ano=" +	getAno() + ", Cor=" + getCor() + ", Alugado=" +
				alugado + ", Tipo de carenagem=" + getTipoDeCarenagem() + "]\n";
	}
	
}
