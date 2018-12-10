package edu.senai.a7.naomutavel;

public class PessoaNaoMutavel {
	private final int idade;
	private final String nome;

	public PessoaNaoMutavel(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade();
	}
}
