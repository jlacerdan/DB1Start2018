package br.com.db1;

import org.junit.Test;

import br.com.db1.type.EstadosDoBrasil;

public class EstadosDoBrasilTest {

	@Test
	public void estadosRegiaoNorte(){		
		EstadosDoBrasil[] estados = EstadosDoBrasil.values();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Sul"){
				System.out.println(estado + " é da região sul");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Sudeste"){
				System.out.println(estado + " é da região sudeste");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Centro Oeste"){
				System.out.println(estado + " é da região Centro Oeste");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Norte"){
				System.out.println(estado + " é da região Norte");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Nordeste"){
				System.out.println(estado + " é da região Nordeste");
			}
		}
	}
}
