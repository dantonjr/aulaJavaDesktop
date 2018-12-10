package edu.senai.a23.dp.builder.com;

import java.util.Date;

public class FuncionarioBuild {
	private final int codigo;
	private final String nome;
	private Date nascimento;
	private String endereco;
	private String email;
	private double salario;
	
	public FuncionarioBuild(int codigo, String nome) {
		if (codigo < 0 || nome == null) {
			throw new IllegalArgumentException("Código e nome precisam ser válidos...");
		}
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public FuncionarioBuild nascidoEm(Date nascimento) {
		this.nascimento = nascimento;
		return this;
	}
	
	public FuncionarioBuild moraEm(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public FuncionarioBuild comContato(String email) {
		this.email = email;
		return this;
	}
	
	public FuncionarioBuild recebendo(double salario) {
		this.salario = salario;
		return this;
	}

	public Funcionario cria() {
		return new Funcionario(this);
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

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
}
