package classes;

public class PessoaFisica implements Cliente {
	
	private String cpf;
	private String dataDeNascimento;

	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String cpf, String dataDeNascimento) {
		super();
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
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
