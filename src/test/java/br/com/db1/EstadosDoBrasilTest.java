package br.com.db1;

import org.junit.Test;

import br.com.db1.type.EstadosDoBrasil;

public class EstadosDoBrasilTest {

	@Test
	public void estadosRegiaoNorte(){		
		EstadosDoBrasil[] estados = EstadosDoBrasil.values();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Sul"){
				System.out.println(estado + " � da regi�o sul");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Sudeste"){
				System.out.println(estado + " � da regi�o sudeste");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Centro Oeste"){
				System.out.println(estado + " � da regi�o Centro Oeste");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Norte"){
				System.out.println(estado + " � da regi�o Norte");
			}
		}
		System.out.println();
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Nordeste"){
				System.out.println(estado + " � da regi�o Nordeste");
			}
		}
	}
}
