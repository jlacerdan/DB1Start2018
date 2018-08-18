package br.com.db1.type;

public enum EstadosDoBrasil {
	ACRE("Norte"), ALAGOAS("Nordeste"), AMAPA("Norte"), AMAZONAS("Norte"), BAHIA("Nordeste"), CEARA("Nordeste"), 
	DISTRITO_FEDERAL("Centro Oeste"),ESPIRITO_SANTO("Sudeste"), GOIAS("Centro Oeste"), MARANHAO("Nordeste"), MATO_GROSSO("Centro Oeste"),
	MATO_GROSSO_DO_SUL("Centro Oeste"),	MINAS_GERAIS("Sudeste"), PARA("Norte"), PARAIBA("Nordeste"), PARANA("Sul"), PERNAMBUCO("Nordeste"),
	PIAUI("Nordeste"), RIO_DE_JANEIRO("Sudeste"), RIO_GRANDE_DO_NORTE("Nordeste"), RIO_GRANDE_DO_SUL("Sul"), RONDONIA("Norte"),
	RORAIMA("Norte"),SANTA_CATARINA("Sul"), SAO_PAULO("Sudeste"), SERGIPE("Nordeste"), TOCANTINS("Norte");
	
	private String regiao;
	
	EstadosDoBrasil(String regiao){
		this.regiao = regiao;
	}
	
	public String regiao(){
		return regiao;
	}
	
	EstadosDoBrasil[] estados = EstadosDoBrasil.values();
	
	public void estadosRegiaoSul(){		
		
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Sul"){
				System.out.println(estado + " é da região sul");
			}
		}
		System.out.println();
	}
		
	public void estadosRegiaoSudeste(){
		for (EstadosDoBrasil estado : estados){
			if(estado.regiao() == "Sudeste"){
				System.out.println(estado + " é da região sudeste");
			}
		}
		System.out.println();
		
	}
		
		public void estadosRegiaoCentroOeste(){
			for (EstadosDoBrasil estado : estados){
				if(estado.regiao() == "Centro Oeste"){
					System.out.println(estado + " é da região Centro Oeste");
				}
			}
			System.out.println();
		}
		
		public void estadosRegiaoNorte(){
			for (EstadosDoBrasil estado : estados){
				if(estado.regiao() == "Norte"){
					System.out.println(estado + " é da região Norte");
				}
			}
			System.out.println();
		}
		public void estadosRegiaoNordeste(){
			for (EstadosDoBrasil estado : estados){
				if(estado.regiao() == "Nordeste"){
					System.out.println(estado + " é da região Nordeste");

					}
		}
	}
	
	
}
