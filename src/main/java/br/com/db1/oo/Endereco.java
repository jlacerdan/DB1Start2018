package br.com.db1.oo;

import br.com.db1.type.TipoLogradouro;

public class Endereco {
	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private String numero;
	private String bairro;
	private Integer cep;
	private Cidade cidade;

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String formataCep(Integer cep) {
		String temp = Integer.toString(cep);
		return temp.substring(0, 5) + "-" + temp.substring(5);

	}
}
