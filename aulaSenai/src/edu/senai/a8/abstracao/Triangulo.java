package edu.senai.a8.abstracao;

import edu.senai.a5.heranca.ECor;

public class Triangulo extends FiguraGeometrica {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo() {
		super();
		setLadoA(10);
		setLadoB(11);
		setLadoC(12);
	}

	public Triangulo(double ladoA, double ladoB, double ladoC, ECor cor) {
		super(cor);
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public boolean isTriangulo() {
		double a = getLadoA();
		double b = getLadoB();
		double c = getLadoC();
		if ((a == 0) || (b == 0) || (c == 0)) {
			return false;
		} else if ((a > b + c) || (b > c + a) || (c > a + b)) {
			return false;
		}
		return true;
	}

	public String getTipoTriangulo() {
		double a = getLadoA();
		double b = getLadoB();
		double c = getLadoC();
		if (!isTriangulo()) {
			return "Não é triangulo";
		}
		if ((a == b) && (b == c)) {
			return "Equilátero";
		} else if ((a != b) && (b != c) && (c != a)) {
			return "Escaleno";
		}
		return "Isósceles";
	}

	public double getSemiperimetro() {
		return getPerimetro() / 2;
	}

	@Override
	public double getArea() {
		double sp = getSemiperimetro();
		return Math.sqrt(sp * (sp - getLadoA()) * (sp - getLadoB()) * (sp - getLadoC()));
	}

	@Override
	public double getPerimetro() {
		return getLadoA() + getLadoB() + getLadoC();
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tLado A\t\t: " + getLadoA() + "\n\tLado B\t\t: " + getLadoB() + "\n\tLado C\t\t: "
				+ getLadoC() + "\n\tSemiperímetro\t: " + getSemiperimetro() + "\n\tTipo\t\t: " + getTipoTriangulo();
	}
}
