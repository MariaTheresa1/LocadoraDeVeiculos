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
		return "Pessoa Jurídica [CNPJ=" + getCnpj() + ", Nome=" + getNome() + ", Endereço="
				+ getEndereco() + ", Telefone=" + getTelefone() + ", E-mail=" + getEmail() + "]\n";
	}
	
}
