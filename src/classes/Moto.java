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

}
