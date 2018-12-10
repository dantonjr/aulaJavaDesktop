package edu.senai.a9.interfaceeheranca;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

	public Funcionario() {
		this("Sem nome", "000.000.000-00", 0);
	}

	public Funcionario(String nome, String cpf, double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}

	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome\t: " + getNome() + "\nCPF\t: " + getCpf() + "\nSalário\t: " + getSalario();
	}
}
