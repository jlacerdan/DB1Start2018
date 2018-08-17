package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class ExerciciosCollection {

	 
	public List<Integer> pares = new ArrayList<Integer>();
	public List<Integer> impares = new ArrayList<Integer>();
	
	
	public List<String> exercicioCores(){
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		return cores;
	}
	
	public List<String> exercicioCoresFavoritas(){
		List<String> coresFavoritas = new ArrayList<String>();
		coresFavoritas.add("Preto");
		coresFavoritas.add("Verde");
		coresFavoritas.add("Azul");
		System.out.println("Cores Favoritas: " + coresFavoritas);
		return coresFavoritas;
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
		parentes.remove("Gildasio");
		parentes.remove("Rosalia");
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
	
	public List<String> ordenarCores(){
		ExerciciosCollection exer = new ExerciciosCollection();
		List<String> cores = new ArrayList<String>();
		cores = exer.exercicioCores();
		Collections.sort(cores);
		System.out.println("Cores ordenadas " + cores);
		return cores;
	}
	
	public List<String> removerCor(){
		ExerciciosCollection exer = new ExerciciosCollection();
		List<String> cores = new ArrayList<String>();
		cores = exer.exercicioCores();
		cores.remove("Preto");
		System.out.println("Cores -1: " + cores);
		return cores;
	}
	
	public List<String> parentesOrdenado(){
		List<String> parentes = new ArrayList<String>();
		parentes.add("Gildasio");
		parentes.add("Rosalia");
		parentes.add("João");
		parentes.add("Julia");
		Collections.sort(parentes, Collections.reverseOrder());
		return parentes;
	}
	
	public void numerosAteVinte(){
		for (Integer i = 1; i <= 20; i++){
			if (i %2 == 0){
				pares.add(i);
			} else {
				impares.add(i);
			}
		}
		System.out.println(pares);
		System.out.println(impares); 
	}
	
	public Integer nomesOrdenados(){
		
		HashSet<String> nomes = new HashSet<String>();
		nomes.add("ANA");
		nomes.add("ANA LAURA");
		nomes.add("JOSE");
		nomes.add("WAGNER");
		nomes.add("RODOLFO");
		nomes.add("ROBERVAL");
		nomes.add("RODOLPHO");
		nomes.add("VAGNER");
		nomes.add("JOSÉ");
		nomes.add("JOALDO");
		nomes.add("CLECIO");
		nomes.add("JOSÈ");
		nomes.add("MARIA");
		nomes.add("MARCOS");
		List<String> nomesOrdenados = new ArrayList<String>(nomes);
		Collections.sort(nomesOrdenados);
		System.out.println("Nomes ordenados: " + nomesOrdenados);
		return nomesOrdenados.size();
	}
	
}
