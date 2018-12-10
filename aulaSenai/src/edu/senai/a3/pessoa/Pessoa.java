package edu.senai.a3.pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private float salario;
	private boolean ativo;
	private String endereco;

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
		this.idade = idade < 0 ? 0 : idade > 150 ? 150 : idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = Character.toUpperCase(sexo) == 'M' ? 'M' : 'F';
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome:\t\t" + getNome() +
			   "\nAtivo:\t\t" + (isAtivo() ? "Sim" : "Não") +
			   "\nEndereço:\t" + getEndereco() +
			   "\nIdade:\t\t" + getIdade() +
			   "\nSalário:\t" + getSalario() +
			   "\nSexo:\t\t" + (getSexo() == 'M' ? "Masculino" : "Feminino");
	}
}
