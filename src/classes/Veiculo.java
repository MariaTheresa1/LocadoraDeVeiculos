package classes;

public interface Veiculo {
	
	String getPlaca();
	void setPlaca(String placa);
	String getModelo();
	void setModelo(String modelo);
	Integer getAno();
	void setAno(Integer ano);
	String getCor();
	void setCor(String cor);

	public enum Tipo{
		PEQUENO, MEDIO, SUV; // 100, 150, 200
	}
	
	void cadastrarVeiculo();
	void alterarVeiculo();
	void buscarVeiculo();

}
