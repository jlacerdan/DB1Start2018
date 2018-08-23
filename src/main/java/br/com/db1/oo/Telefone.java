package br.com.db1.oo;

public class Telefone {
	private Integer ddd;
	private Integer numero;
	private TipoTelefone tipo;

	
	public String formataTelefone() {
		return "(" + ddd + ")" + numero;
	}
	
	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	
}
