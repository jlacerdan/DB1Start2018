package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExerciciosCollectionTest {
	
	ExerciciosCollection chamMetodo = new ExerciciosCollection();
	
	@Test
	public void exercicioCoresFavoritasTest(){
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		assertEquals(cores, chamMetodo.exercicioCoresFavoritas());
		
		
	}
	
	@Test
	public void tamanhoCollectionTest(){
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		assertEquals(3, chamMetodo.tamanhoCollection(cores), 0);
	}
	
	@Test
	public void nomeParentesTest(){
		List<String> parentesEsperado = new ArrayList<String>();
		parentesEsperado.add("Julia");
		parentesEsperado.add("João");
		assertEquals(parentesEsperado, chamMetodo.nomeParentes());
	}
	
	@Test
	public void cidadesBahiaTest(){
		List<String> cidadesEsperado = new ArrayList<String>();
		cidadesEsperado.add("Luis Eduardo Magalhães");
		cidadesEsperado.add("Salvador");
		assertEquals(cidadesEsperado, chamMetodo.cidadesBahia());
	}
	
	@Test
	public void ordenarCores(){
		List<String> coresEsperado = new ArrayList<String>();
		coresEsperado.add("Azul");
		coresEsperado.add("Preto");
		coresEsperado.add("Verde");
		assertEquals(coresEsperado, chamMetodo.ordenarCores());
	}
	@Test
	public void removerCor(){
		List<String> coresEsperado = new ArrayList<String>();
		coresEsperado.add("Verde");
		coresEsperado.add("Azul");
		assertEquals(coresEsperado, chamMetodo.removerCor());
	}
	
	@Test
	public void parentesDescrescente(){
		List<String> parentesEsperado = new ArrayList<String>();
		parentesEsperado.add("Rosalia");
		parentesEsperado.add("Julia");
		parentesEsperado.add("João");
		parentesEsperado.add("Gildasio");
		assertEquals(parentesEsperado, chamMetodo.parentesOrdenado());
	}
	
	@Test
	public void numerosAteVinteTest(){
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
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
	
	@Test
	public void nomesDistintosOrdenados(){
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
		System.out.println(nomesOrdenados);
		
		
		
	}
	
	
	
}
