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
		String alugado;
		if(getAlugado() == true) {
			alugado = "Sim";
		} else {
			alugado = "N�o";
		}
		return "Caminh�o [Placa=" + getPlaca() + ", Modelo=" + getModelo() +
				", Ano=" + getAno() + ", Cor=" + getCor() + ", Alugado=" + 
				alugado + ", Carga M�xima=" + getCargaMaxima() + "]\n";
	}
	
}
