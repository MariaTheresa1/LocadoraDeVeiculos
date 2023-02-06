package classes;

public class Moto implements Veiculo {
	
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
	public String getPlaca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlaca(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setModelo(String modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getAno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAno(Integer ano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCor(String cor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarVeiculo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarVeiculo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarVeiculo() {
		// TODO Auto-generated method stub
		
	}
	
}
