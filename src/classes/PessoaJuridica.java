package classes;

public class PessoaJuridica extends Cliente {
	
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
	public String toString() {
		return "Pessoa Jur�dica [CNPJ=" + getCnpj() + ", Nome=" + getNome() + ", Endere�o="
				+ getEndereco() + ", Telefone=" + getTelefone() + ", E-mail=" + getEmail() + "]\n";
	}
	
}
