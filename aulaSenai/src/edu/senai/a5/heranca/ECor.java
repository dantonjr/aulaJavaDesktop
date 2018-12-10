package edu.senai.a5.heranca;

public enum ECor {
	PRETO ("Preto", "Black", "#000000"),
	BRANCO ("Branco", "White", "#ffffff"),
	VERMELHO ("Vermelho", "Red", "#ff0000"),
	AZUL ("Azul", "Blue", "#0000ff"),
	VERDE ("Verde", "Green", "#00ff00"),
	LARANJA ("Laranja", "Orange", "#ffcc00");
	
	private final String corBR;
	private final String corEN;
	private final String corHTML;
	
	public String getCorBR() {
		return corBR;
	}
	
	public String getCorEN() {
		return corEN;
	}
	
	public String getCorHTML() {
		return corHTML;
	}
	
	private ECor(String corBR, String corEN, String corHTML) {
		this.corBR = corBR;
		this.corEN = corEN;
		this.corHTML = corHTML;
	}
	
}
