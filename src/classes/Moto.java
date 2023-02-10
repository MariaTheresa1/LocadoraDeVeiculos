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
		return "Moto [Placa=" + getPlaca() + ", Modelo=" + getModelo() + ", Ano=" +	getAno() + 
				", Cor=" + getCor() + ", Tipo de carenagem=" + getTipoDeCarenagem() + "]\n";
	}
	
}
