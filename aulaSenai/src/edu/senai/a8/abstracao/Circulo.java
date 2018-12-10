package edu.senai.a8.abstracao;

import edu.senai.a5.heranca.ECor;

public class Circulo extends FiguraGeometrica {
	private double raio;

	public Circulo() {
		super();
		setRaio(19);
	}

	public Circulo(double raio, ECor cor) {
		super(cor);
		setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI + Math.pow(getRaio(), 2);
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * getRaio();
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tRaio\t\t: " + getRaio();
	}
}
