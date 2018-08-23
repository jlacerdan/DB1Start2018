package br.com.db1.oo;

import org.junit.Test;

public class PessoaTest {
	
	@Test
	public void pessoaTest(){
		Pessoa p = new Pessoa();
		Telefone tel = new Telefone();
		tel.setDdd(47);
		tel.setNumero(997511761);
		tel.setTipo(TipoTelefone.CELULAR);
		Telefone tel2 = new Telefone();
		tel2.setDdd(44);
		tel2.setNumero(997258440);
		tel2.setTipo(TipoTelefone.CELULAR);
		p.addTelefones(tel);
		p.addTelefones(tel2);
		System.out.println(p.getTelefones());
		
	}
}
