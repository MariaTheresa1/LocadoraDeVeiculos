package classes;

public interface Cliente {
	
	String getNome();
	void setNome(String nome);
	String getEndereco();
	void setEndereco(String endereco);
	String getTelefone();
	void setTelefone(String telefone);
	String getEmail();
	void setEmail(String email);
	
	void cadastrarCliente();
	void alterarCliente();
	void alugarVeiculo();
	void devolverVeiculo();

}
