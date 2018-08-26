package br.com.db1.composicao;

public class Feijoada {
	private Feijao feijao;
	
	

	public Feijoada(Feijao feijaoParamentro){
		System.out.println("Passou");
	    this.feijao = feijaoParamentro;
	}
	
	public Feijao getFeijao() {
		return feijao;
	}

	public void setFeijao(Feijao feijao) {
		this.feijao = feijao;
	}
}
