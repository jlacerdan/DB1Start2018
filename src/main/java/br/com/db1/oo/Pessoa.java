package br.com.db1.oo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones;
	
	public Pessoa(){
		this.telefones = new ArrayList<Telefone>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void addTelefones(Telefone telefone) {
		telefones.add(telefone);
	}

	
}
