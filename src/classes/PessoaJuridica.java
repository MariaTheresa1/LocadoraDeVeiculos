package classes;

public class PessoaJuridica implements Cliente {
	
	private String cnpj;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alugarVeiculo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolverVeiculo() {
		// TODO Auto-generated method stub
		
	}
	
}
