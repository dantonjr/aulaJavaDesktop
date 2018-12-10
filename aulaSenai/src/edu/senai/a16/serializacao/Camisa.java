package edu.senai.a16.serializacao;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Camisa implements Serializable {

	private static final long serialVersionUID = 1L;
	private double preco;
	private String cor;
	private int tamanho;


	public Camisa() {
		this(10.50, "Branco", 50);
	}

	public Camisa(double preco, String cor, int tamanho) {
		setPreco(preco);
		setCor(cor);
		setTamanho(tamanho);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		return "Preço: " + df.format(getPreco()) + "\nCor.: " + getCor() + "\nTamanho: " + getTamanho();
	}
}
