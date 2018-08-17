package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosCollection {

	
	public List<String> exercicioCores(){
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Preto");
		cores.add("Verde");
		return cores;
	}
	public Integer tamanhoCollection(List<String> nomes){
		return nomes.size();
	}
	
	public List<String> nomeParentes(){
		List<String> parentes = new ArrayList<String>();
		parentes.add("Gildasio");
		parentes.add("Rosalia");
		parentes.add("Julia");
		parentes.add("João");
		parentes.remove(0);
		parentes.remove(0);
		return parentes;
	}
	
	public List<String> cidadesBahia(){
		List<String> cidades = new ArrayList<String>();
		cidades.add("Luis Eduardo Magalhães");
		cidades.add("Teixeira de Freitas");
		cidades.add("Salvador");
		cidades.remove(1);
		return cidades;
	}
}
