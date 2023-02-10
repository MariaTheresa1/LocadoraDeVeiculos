package classes;

public class PessoaFisica extends Cliente{
	
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
	public String toString() {
		return "Pessoa Física [CPF=" + getCpf() + ", Data de nascimento=" + getDataDeNascimento()
				+ ", Nome=" + getNome() + ", Endereço=" + getEndereco() + ", Telefone=" + getTelefone()
				+ ", E-mail=" + getEmail() + "]\n";
	}
	
}
