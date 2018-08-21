package br.com.db1.type;
import static org.junit.Assert.*;

import org.junit.Test;

public class ExemploEnumTest {
	
	@Test
	public void descricaoLogradouroTest(){
		assertTrue("Avenida".equals(TipoLogradouro.AVENIDA.getDescricaoLogradouro()));
		assertTrue("Rua".equals(TipoLogradouro.RUA.getDescricaoLogradouro()));
		assertTrue("Fazenda".equals(TipoLogradouro.FAZENDA.getDescricaoLogradouro()));
		assertTrue("Praça".equals(TipoLogradouro.PRACA.getDescricaoLogradouro()));
	}
	
	@Test
	public void siglaLogradouroTest(){
		assertTrue("Av".equals(TipoLogradouro.AVENIDA.getSiglaLogradouro()));
		assertTrue("R".equals(TipoLogradouro.RUA.getSiglaLogradouro()));
		assertTrue("Fz".equals(TipoLogradouro.FAZENDA.getSiglaLogradouro()));
		assertTrue("Pc".equals(TipoLogradouro.PRACA.getSiglaLogradouro()));	
	}
}
