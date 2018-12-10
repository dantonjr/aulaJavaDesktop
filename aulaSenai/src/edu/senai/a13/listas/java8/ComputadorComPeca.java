package edu.senai.a13.listas.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputadorComPeca implements Comparable<ComputadorComPeca> {
	private int frenquencia;
	private String fabricante;
	private double preco;
	private List<Peca> pecas = new ArrayList<Peca>();

	public ComputadorComPeca() {
		this(0, "Sem dados", 0);
	}

	public ComputadorComPeca(int frenquencia, String fabricante, double preco) {
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

	public List<Peca> getPecas() {
		return Collections.unmodifiableList(pecas);
	}

	public void adiciona(Peca peca) {
		this.pecas.add(peca);
	}
	
	@Override
	public String toString() {
		return "Computador [getFrenquencia()=" + getFrenquencia() + ", getFabricante()=" + getFabricante()
				+ ", getPreco()=" + getPreco() + "]";
	}

	@Override
	public int compareTo(ComputadorComPeca computador) {
		return Double.compare(this.getPreco(), computador.getPreco());
	}

}
