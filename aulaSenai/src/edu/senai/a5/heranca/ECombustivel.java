package edu.senai.a5.heranca;

public enum ECombustivel {
	GASOLINA ("Gasolina", "Gas"),
	ETANOL ("Etanol", "Alc"),
	GNV ("Gás Natural Veicular", "GNV"),
	DIESEL ("DIESEL", "DIE");
	
	private final String descricao;
	private final String sigla;
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	private ECombustivel(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}
}
