package edu.senai.a67.enumerador;

import javax.swing.ImageIcon;

public enum ESexo {
	MASCULINO("Masculino", "Mas", 'M'),
	FEMININO("Feminino", "Fem", 'F');

	private final String descricao;
	private final String abreviatura;
	private final char sigla;
	private final ImageIcon imagem;

	public String getDescricao() {
		return descricao;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public ImageIcon getImagem() {
		return imagem;
	}
	public char getSigla() {
		return sigla;
	}

	private ESexo(String descricao, String abreviatura, char sigla) {
		this.descricao = descricao;
		this.abreviatura = abreviatura;
		this.sigla = sigla;
		this.imagem = new ImageIcon(System.getProperty("user.dir") + "/imagens/" + getSigla() + ".jpg");
	}
	
}
