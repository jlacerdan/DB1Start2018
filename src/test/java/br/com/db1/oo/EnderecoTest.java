package br.com.db1.oo;

import static org.junit.Assert.*;
import org.junit.Test;

public class EnderecoTest {
	
	@Test
	public void testarFormataCep(){
		Endereco test = new Endereco();
		String cepEsperado = "87050-713";
		assertEquals(cepEsperado, test.formataCep(87050713));
	}
}
