package classes;

public abstract class Veiculo {
	
	private String placa;
	private String modelo;
	private Integer ano;
	private String cor;
	private Boolean alugado;
	private Tipo tipo;
	
	public enum Tipo {
		PEQUENO(100f), MEDIO(150f), SUV(200f); // R$ 100, R$ 150, R$ 200
		
		public Float valorTipo;
		
		Tipo(Float valor) {
			valorTipo = valor;
		}
	}
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, String modelo, Integer ano, String cor) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.alugado = false;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Boolean getAlugado() {
		return alugado;
	}
	public void setAlugado(Boolean alugado) {
		this.alugado = alugado;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String alugado;
		if(getAlugado() == true) {
			alugado = "Sim";
		} else {
			alugado = "N�o";
		}
		return "Ve�culo [Placa=" + getPlaca() + ", Modelo=" + getModelo() + ", Ano=" + getAno()
				+ ", Cor=" + getCor() + ", Alugado=" + alugado + ", Tipo=" + getTipo() + "]\n";
	}
	
}
