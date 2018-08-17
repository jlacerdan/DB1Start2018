package br.com.db1;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExerciciosCollectionTest {
	
	ExerciciosCollection chamMetodo = new ExerciciosCollection();
	
	@Test
	public void exercicioCoresTest(){
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Preto");
		cores.add("Verde");
		assertEquals(cores, chamMetodo.exercicioCores());
		
	}
	
	@Test
	public void tamanhoCollectionTest(){
		assertEquals(3, chamMetodo.tamanhoCollection(), 0);
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
}
