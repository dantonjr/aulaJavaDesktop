package edu.senai.a23.dp.builder.sem;

import java.util.Date;

public class Funcionario {
	private int codigo;
	private String nome;
	private Date nascimento;
	private String endereco;
	private String email;
	private double salario;

	public Funcionario() {
		setCodigo(0);
		setNome("Sem nome");
	}	
	
	public Funcionario(int codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}

	public Funcionario(int codigo, String nome, String email) {
		this(codigo, nome);
		setEmail(email);
	}

	public Funcionario(int codigo, String nome, Date nascimento) {
		this(codigo, nome);
		setNascimento(nascimento);
	}

	public Funcionario(int codigo, String nome, String email, String endereco) {
		this(codigo, nome, email);
		setEndereco(endereco);
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + "\nnome=" + nome + "\nnascimento=" + nascimento + "\nendereco="
				+ endereco + "\nemail=" + email + "\nsalario=" + salario + "]";
	}

}
