package edu.senai.a23.dp.builder.com;

import java.util.Date;

public final class Funcionario {
	private final int codigo;
	private final String nome;
	private final Date nascimento;
	private final String endereco;
	private final String email;
	private final double salario;

	protected Funcionario(FuncionarioBuild build) {
		this.codigo = build.getCodigo();
		this.nome = build.getNome();
		this.nascimento = build.getNascimento();
		this.endereco = build.getEndereco();
		this.email = build.getEmail();
		this.salario = build.getSalario();
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + "\nnome=" + nome + "\nnascimento=" + nascimento + "\nendereco="
				+ endereco + "\nemail=" + email + "\nsalario=" + salario + "]";
	}

}
