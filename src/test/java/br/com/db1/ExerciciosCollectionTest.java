package br.com.db1;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;
public class ExerciciosCollectionTest {

	ExerciciosCollection chamMetodo = new ExerciciosCollection();

	@Test
	public void exercicioCoresFavoritasTest() {
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		assertEquals(cores, chamMetodo.exercicioCoresFavoritas());

	}

	@Test
	public void tamanhoCollectionTest() {
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		assertEquals(3, chamMetodo.tamanhoCollection(cores), 0);
	}

	@Test
	public void nomeParentesTest() {
		List<String> parentesEsperado = new ArrayList<String>();
		parentesEsperado.add("Julia");
		parentesEsperado.add("João");
		assertEquals(parentesEsperado, chamMetodo.nomeParentes());
	}

	@Test
	public void cidadesBahiaTest() {
		List<String> cidadesEsperado = new ArrayList<String>();
		cidadesEsperado.add("Luis Eduardo Magalhães");
		cidadesEsperado.add("Salvador");
		assertEquals(cidadesEsperado, chamMetodo.cidadesBahia());
	}

	@Test
	public void ordenarCores() {
		List<String> coresEsperado = new ArrayList<String>();
		coresEsperado.add("Azul");
		coresEsperado.add("Preto");
		coresEsperado.add("Verde");
		assertEquals(coresEsperado, chamMetodo.ordenarCores());
	}

	@Test
	public void removerCor() {
		List<String> coresEsperado = new ArrayList<String>();
		coresEsperado.add("Verde");
		coresEsperado.add("Azul");
		assertEquals(coresEsperado, chamMetodo.removerCor());
	}

	@Test
	public void parentesDescrescente() {
		List<String> parentesEsperado = new ArrayList<String>();
		parentesEsperado.add("Rosalia");
		parentesEsperado.add("Julia");
		parentesEsperado.add("João");
		parentesEsperado.add("Gildasio");
		assertEquals(parentesEsperado, chamMetodo.parentesOrdenado());
	}

	@Test
	public void numerosAteVinteTest() {
		chamMetodo.numerosAteVinte();
		assertEquals(10, chamMetodo.pares.size(), 0);
		assertEquals(10, chamMetodo.impares.size(), 0);

	}

	@Test
	public void nomesDistintosOrdenados() {
		assertEquals(13, chamMetodo.nomesOrdenados(), 0);
	}

}
