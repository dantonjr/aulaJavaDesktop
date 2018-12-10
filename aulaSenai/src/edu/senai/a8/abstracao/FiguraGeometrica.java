package edu.senai.a8.abstracao;

import edu.senai.a5.heranca.ECor;

public abstract class FiguraGeometrica {
	private ECor cor;

	public abstract double getArea();

	public abstract double getPerimetro();

	public FiguraGeometrica() {
		this(ECor.PRETO);
	}

	public FiguraGeometrica(ECor cor) {
		setCor(cor);
	}

	public ECor getCor() {
		return cor;
	}

	public void setCor(ECor cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		String area = "\n\tÁrea\t\t: " + getArea();
//		return getClass().getSimpleName() + "\n\tCor\t\t: " + getCor().getCorBR() + "\n\tPerímetro\t: " + getPerimetro()
//		+ (((Double)getArea()).isNaN() ? "" : "\n\tÁrea\t\t: " + getArea());

		return getClass().getSimpleName() + "\n\tCor\t\t: " + getCor().getCorBR() + "\n\tPerímetro\t: " + getPerimetro()
				+ (this instanceof Triangulo ? ((Triangulo) this).isTriangulo() ? area : "" : area);
	}
}
