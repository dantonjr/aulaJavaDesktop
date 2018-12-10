package edu.senai.a12.listas.ordenadas;

public class Computador implements Comparable<Computador> {
	private int frenquencia;
	private String fabricante;
	private double preco;

	public Computador() {
		this(0, "Sem dados", 0);
	}

	public Computador(int frenquencia, String fabricante, double preco) {
		super();
		this.frenquencia = frenquencia;
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public int getFrenquencia() {
		return frenquencia;
	}

	public void setFrenquencia(int frenquencia) {
		this.frenquencia = frenquencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Computador [getFrenquencia()=" + getFrenquencia() + ", getFabricante()=" + getFabricante()
				+ ", getPreco()=" + getPreco() + "]";
	}

	@Override
	public int compareTo(Computador computador) {
		return Double.compare(this.getPreco(), computador.getPreco()); 
	}

}
