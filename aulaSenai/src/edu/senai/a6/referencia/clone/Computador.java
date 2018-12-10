package edu.senai.a6.referencia.clone;

public class Computador implements Cloneable {
	private int frequencia;
	private String fabricante;

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Frequência: " + getFrequencia() + "\nFabricante: " + getFabricante();
	}
}
