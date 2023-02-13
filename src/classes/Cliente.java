package classes;

public abstract class Cliente {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private Float saldoDevedor;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String endereco, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.saldoDevedor = 0f;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Float getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(Float saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}
	
}
