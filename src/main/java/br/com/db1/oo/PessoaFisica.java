package br.com.db1.oo;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public Boolean validarCpf(){
		return Boolean.TRUE;
	}
}
