package edu.senai.a7.construtores;

public class Pessoa {
	private String nome;
	private String endereco;

	public static final int ATRIBUTO_ENDERECO = 1;
	public static final int ATRIBUTO_NOME = 2;

	public Pessoa() {
		this("Sem nome", "Sem endereço");
//		setNome("Sem nome");
//		setEndereco("Sem endereço");
	}

	public Pessoa(String valor, int tipoAtributo) {
		this("sem dado", "sem dado");
		if (tipoAtributo == Pessoa.ATRIBUTO_ENDERECO) {
			setEndereco(valor);
		} else {
			setNome(valor);
		}

	}

	public Pessoa(String nome) {
		this(nome, "Sem endereço");
	}

	public Pessoa(String nome, String endereco) {
		setNome(nome instanceof String ? nome : "-");
		setEndereco(endereco instanceof String ? endereco : "-");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Dados da Pessoa:\n\tNome\t: " + getNome() + "\n\tEnd.\t: " + getEndereco();
	}
}
