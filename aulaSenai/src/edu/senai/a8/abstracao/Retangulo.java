package edu.senai.a8.abstracao;

import edu.senai.a5.heranca.ECor;

public class Retangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Retangulo() {
		super();
		setBase(10);
		setAltura(15);
	}

	public Retangulo(double base, double altura, ECor cor) {
		super(cor);
		setBase(base);
		setAltura(altura);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return getBase() * getAltura();
	}

	@Override
	public double getPerimetro() {
		return (2 * getBase()) + (2 * getAltura());
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tBase\t\t: " + getBase() + "\n\tAltura\t\t: " + getAltura();
	}
}
