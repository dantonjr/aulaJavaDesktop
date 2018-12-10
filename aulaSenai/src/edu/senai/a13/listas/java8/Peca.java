package edu.senai.a13.listas.java8;

public class Peca {
	private int codigo;
	private String descricao;

	public Peca() {
		this(0, "sem descri��o");
	}

	public Peca(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Pe�a [C�digo: " + getCodigo() + ", Descri��o: " + getDescricao() + "]";
	}

}
