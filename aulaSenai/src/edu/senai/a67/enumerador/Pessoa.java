package edu.senai.a67.enumerador;

public class Pessoa {
	private String nome;
	private ESexo sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ESexo getSexo() {
		return sexo;
	}

	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nSexo: " + getSexo().getSigla();
	}
}
