package edu.senai.a27.dp.memento;

public class FuncionarioMemento {
	private String endereco;
	private float salario;
	private String telefone;

	public FuncionarioMemento(String endereco, float salario, String telefone) {
		setEndereco(endereco);
		setSalario(salario);
		setTelefone(telefone);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
