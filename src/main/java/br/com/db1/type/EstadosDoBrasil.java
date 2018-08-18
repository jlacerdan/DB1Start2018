package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasil {
	ACRE("Norte", "Acre"), ALAGOAS("Nordeste", "Alagoas"), AMAPA("Norte",
			"Amap�"), AMAZONAS("Norte", "Amazonas"), BAHIA("Nordeste", "Bahia"), CEARA(
			"Nordeste", "Cear�"), DISTRITO_FEDERAL("Centro Oeste",
			"Distrito Federal"), ESPIRITO_SANTO("Sudeste", "Esp�rito Santo"), GOIAS(
			"Centro Oeste", "Goi�s"), MARANHAO("Nordeste", "Maranh�o"), MATO_GROSSO(
			"Centro Oeste", "Mato Grosso"), MATO_GROSSO_DO_SUL("Centro Oeste",
			"Mato Grosso do Sul"), MINAS_GERAIS("Sudeste", "Minas Gerais"), PARA(
			"Norte", "Par�"), PARAIBA("Nordeste", "Para�ba"), PARANA("Sul",
			"Paran�"), PERNAMBUCO("Nordeste", "Pernambuco"), PIAUI("Nordeste",
			"Piau�"), RIO_DE_JANEIRO("Sudeste", "Rio De Janeiro"), RIO_GRANDE_DO_NORTE(
			"Nordeste", "Rio Grande do Norte"), RIO_GRANDE_DO_SUL("Sul",
			"Rio Grande do Sul"), RONDONIA("Norte", "Rond�nia"), RORAIMA(
			"Norte", "Roraima"), SANTA_CATARINA("Sul", "Santa Catarina"), SAO_PAULO(
			"Sudeste", "S�o Paulo"), SERGIPE("Nordeste", "Sergipe"), TOCANTINS(
			"Norte", "Tocantins");

	private String regiao;
	private String nomeEstado;

	EstadosDoBrasil(String regiao, String nomeEstado) {
		this.regiao = regiao;
		this.nomeEstado = nomeEstado;
	}

	public String regiao() {
		return regiao;
	}

	public String nomeEstado() {
		return nomeEstado;
	}

	static EstadosDoBrasil[] estados = EstadosDoBrasil.values();

	public static List<String> estadosRegiaoSul() {

		List<String> lista = new ArrayList<String>();
		for (EstadosDoBrasil estado : estados) {
			if (estado.regiao() == "Sul") {
				lista.add(estado.nomeEstado);
			}
		}
		System.out.println();
		return lista;
	}

	public static List<String> estadosRegiaoSudeste() {
		List<String> lista = new ArrayList<String>();
		for (EstadosDoBrasil estado : estados) {
			if (estado.regiao() == "Sudeste") {
				lista.add(estado.nomeEstado);
			}
		}
		System.out.println();
		return lista;

	}

	public static List<String> estadosRegiaoCentroOeste() {
		List<String> lista = new ArrayList<String>();
		for (EstadosDoBrasil estado : estados) {
			if (estado.regiao() == "Centro Oeste") {
				lista.add(estado.nomeEstado);
			}
		}
		System.out.println();
		return lista;
	}

	public static List<String> estadosRegiaoNorte() {
		List<String> lista = new ArrayList<String>();
		for (EstadosDoBrasil estado : estados) {
			if (estado.regiao() == "Norte") {
				lista.add(estado.nomeEstado);
			}
		}
		System.out.println();
		return lista;
	}

	public static List<String> estadosRegiaoNordeste() {
		List<String> lista = new ArrayList<String>();
		for (EstadosDoBrasil estado : estados) {
			if (estado.regiao() == "Nordeste") {
				lista.add(estado.nomeEstado);

			}
		}
		return lista;
	}

}
