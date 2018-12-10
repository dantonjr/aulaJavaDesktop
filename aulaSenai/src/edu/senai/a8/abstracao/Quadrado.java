package edu.senai.a8.abstracao;

import edu.senai.a5.heranca.ECor;

public class Quadrado extends FiguraGeometrica {
	private double lado;

	public Quadrado() {
		super();
		setLado(10);
	}

	public Quadrado(double lado, ECor cor) {
		super(cor);
		setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return Math.pow(getLado(), 2);
	}

	@Override
	public double getPerimetro() {
		return 4 * getLado();
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tLado\t\t: " + getLado();
	}
}
