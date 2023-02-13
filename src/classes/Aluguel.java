package classes;

import java.time.LocalDateTime;

public class Aluguel {
	
	private String local;
	private LocalDateTime data;
	private Veiculo veiculo;
	private Cliente cliente;
	
	public Aluguel() {
		
	}
	
	public Aluguel(String local, LocalDateTime data, Veiculo veiculo, Cliente cliente) {
		this.local = local;
		this.data = data;
		this.veiculo = veiculo;
		this.cliente = cliente;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
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

	@Override
	public String toString() {
		return "Aluguel [Veículo=" + getVeiculo() + ", Cliente=" + getCliente() +
				"Local=" + getLocal() + ", Data=" + getData() + "]";
	}
	
}
