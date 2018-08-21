package br.com.db1.type;

public enum TipoLogradouro {
	RUA("Rua", "R"),
	FAZENDA("Fazenda", "Fz"),
	PRACA("Praça", "Pc"),
	AVENIDA("Avenida", "Av");
	
	String descricaoLogradouro;
	String siglaLogradouro;
	
	TipoLogradouro(String descricao, String sigla) {
		descricaoLogradouro = descricao;
		siglaLogradouro = sigla;
	}
	
	public String getDescricaoLogradouro(){
		return descricaoLogradouro;
	}
	
	public String getSiglaLogradouro(){
		return siglaLogradouro;
	}
	
}
