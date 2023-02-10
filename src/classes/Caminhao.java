package classes;

public class Caminhao extends Veiculo {
	
	private Float cargaMaxima;
	
	public Caminhao() {
		
	}
	
	public Caminhao(Float cargaMaxima) {
		super();
		this.cargaMaxima = cargaMaxima;
	}

	public Float getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Float cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String toString() {
		return "Caminh�o [Placa=" + getPlaca() + ", Modelo=" + getModelo() + ", Ano="
				+ getAno() +", Cor=" + getCor() + ", Carga M�xima=" + getCargaMaxima() + "]\n";
	}
	
}
