package edu.senai.a11.listas;

public class Animal {
	private String nome;
	private int idade;
	private String raca;
	private double peso;

	public Animal() {
		this("Sem nome", 0, "SRD", 0);
	}

	public Animal(String nome, int idade, String raca, double peso) {
		setNome(nome);
		setIdade(idade);
		setRaca(raca);
		setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nome\t: " + getNome() + "\nIdade\t: " + getIdade() + "\nRaça\t: " + getRaca() + "\nPeso\t: "
				+ getPeso();
	}

}
