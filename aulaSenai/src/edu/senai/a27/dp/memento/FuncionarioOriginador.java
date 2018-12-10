package edu.senai.a27.dp.memento;

public class FuncionarioOriginador implements IFuncionarioMemento {
	private String nome;
	private String endereco;
	private float salario;
	private String telefone;

	public FuncionarioOriginador(String nome, String endereco, float salario, String telefone) {
		setNome(nome);
		setEndereco(endereco);
		setSalario(salario);
		setTelefone(telefone);
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

	@Override
	public FuncionarioMemento salvaMemento() {
		System.out.println("Salvando estado...");
		return new FuncionarioMemento(getEndereco(), getSalario(), getTelefone());
	}

	@Override
	public void recuperaMemento(FuncionarioMemento memento) {
		if (memento == null) return;
		System.out.println("Restaurando estado...");
		setEndereco(memento.getEndereco());
		setSalario(memento.getSalario());
		setTelefone(memento.getTelefone());
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + 
			    "\tEndereço: " + getEndereco() +
			    "\tSalário: " + getSalario() +
			    "\tFone: " + getTelefone();
	}
}
