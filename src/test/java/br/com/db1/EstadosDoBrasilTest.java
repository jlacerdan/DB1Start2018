package br.com.db1;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.db1.type.EstadosDoBrasil;

public class EstadosDoBrasilTest {

	@Test
	public void estadosRegiaoSulTest(){
		assertTrue(EstadosDoBrasil.estadosRegiaoSul().contains(EstadosDoBrasil.PARANA.nomeEstado()));
		assertTrue(EstadosDoBrasil.estadosRegiaoSul().contains(EstadosDoBrasil.SANTA_CATARINA.nomeEstado()));
		assertFalse(EstadosDoBrasil.estadosRegiaoSul().contains(EstadosDoBrasil.SAO_PAULO.nomeEstado()));
	}
	@Test
	public void estadosRegiaoSudesteTest(){
		assertTrue(EstadosDoBrasil.estadosRegiaoSudeste().contains(EstadosDoBrasil.SAO_PAULO.nomeEstado()));
		assertTrue(EstadosDoBrasil.estadosRegiaoSudeste().contains(EstadosDoBrasil.ESPIRITO_SANTO.nomeEstado()));
		assertFalse(EstadosDoBrasil.estadosRegiaoSudeste().contains(EstadosDoBrasil.BAHIA.nomeEstado()));
	}
	@Test
	public void estadosRegiaoCentroOesteTest(){
		assertTrue(EstadosDoBrasil.estadosRegiaoCentroOeste().contains(EstadosDoBrasil.DISTRITO_FEDERAL.nomeEstado()));
		assertTrue(EstadosDoBrasil.estadosRegiaoCentroOeste().contains(EstadosDoBrasil.MATO_GROSSO.nomeEstado()));
		assertFalse(EstadosDoBrasil.estadosRegiaoCentroOeste().contains(EstadosDoBrasil.BAHIA.nomeEstado()));
	}
	@Test
	public void estadosRegiaoNorteTest(){
		assertTrue(EstadosDoBrasil.estadosRegiaoNorte().contains(EstadosDoBrasil.AMAPA.nomeEstado()));
		assertTrue(EstadosDoBrasil.estadosRegiaoNorte().contains(EstadosDoBrasil.AMAZONAS.nomeEstado()));
		assertFalse(EstadosDoBrasil.estadosRegiaoNorte().contains(EstadosDoBrasil.BAHIA.nomeEstado()));
	}
	@Test
	public void estadosRegiaoNordesteTest(){
		assertTrue(EstadosDoBrasil.estadosRegiaoNordeste().contains(EstadosDoBrasil.BAHIA.nomeEstado()));
		assertTrue(EstadosDoBrasil.estadosRegiaoNordeste().contains(EstadosDoBrasil.MARANHAO.nomeEstado()));
		assertFalse(EstadosDoBrasil.estadosRegiaoNordeste().contains(EstadosDoBrasil.SAO_PAULO.nomeEstado()));
	}
}