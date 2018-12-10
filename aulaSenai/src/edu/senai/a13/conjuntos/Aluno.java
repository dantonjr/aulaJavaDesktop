package edu.senai.a13.conjuntos;

public class Aluno implements Comparable<Aluno> {
	private int codigo;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;

	public Aluno() {
		this(0, "Sem nome", 0, 0, 0);
	}

	public Aluno(int codigo, String nome, double nota1, double nota2, double nota3) {
		setCodigo(codigo);
		setNome(nome);
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return (getNota1() + getNota2() + getNota3()) / 3;
	}

	@Override
	public String toString() {
		return "Aluno [Código: " + getCodigo() + ", Nome: " + getNome() + ", Nota1: " + getNota1() + ", Nota2: "
				+ getNota2() + ", Nota3: " + getNota3() + ", Média: " + getMedia() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		return Double.compare(this.getMedia(), outroAluno.getMedia());
	}


	
//	@Override
//	public boolean equals(Object outroAluno) {
//		
//		return getNome().equals(((Aluno) outroAluno).getNome()) && (getCodigo() == ((Aluno) outroAluno).getCodigo());

//		if (!getNome().equals(((Aluno) outroAluno).getNome())) {
//			return false;
//		}
//		if (getCodigo() != ((Aluno) outroAluno).getCodigo()) {
//			return false;
//		}
//	}
}
