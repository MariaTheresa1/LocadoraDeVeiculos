package classes;

public class Aluguel {
	
	private String local;
	private String data;
	private String horario;
	private Veiculo veiculo;
	private Cliente cliente;
	
	public Aluguel() {
		
	}
	
	public Aluguel(String local, String data, String horario, Veiculo veiculo, Cliente cliente) {
		this.local = local;
		this.data = data;
		this.horario = horario;
		this.veiculo = veiculo;
		this.cliente = cliente;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
