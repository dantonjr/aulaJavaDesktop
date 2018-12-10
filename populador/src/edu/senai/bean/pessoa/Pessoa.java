package edu.senai.bean.pessoa;

public class Pessoa {
	private int codigo;
	private String nome;
	private char sexo;
	private float salario;

	public Pessoa() {
		setCodigo(0);
		setNome("Sem nome");
		setSexo('X');
		setSalario(0);
	}

	public Pessoa(int codigo, String nome, char sexo, float salario) {
		setCodigo(codigo);
		setNome(nome);
		setSexo(sexo);
		setSalario(salario);
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String toStringBD(String separador) {
		return getCodigo() + separador +  
			   getNome() + separador +
			   getSexo() + separador +
			   getSalario();
	}
	
	@Override
	public String toString() {
		return "Codigo= " + getCodigo() + 
			   "\nNome= " + getNome() +
			   "\nSexo= " + getSexo() +
			   "\nSalário= " + getSalario();
	}

}
