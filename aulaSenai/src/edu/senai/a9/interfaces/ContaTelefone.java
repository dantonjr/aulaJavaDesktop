package edu.senai.a9.interfaces;

public class ContaTelefone implements ICalculavel {
	private int totalMinutos;
	private float valorMinuto;
	private float valorAssinatura;

	public ContaTelefone() {
		this(100, (float) .05, (float) 59.9);
	}

	public ContaTelefone(int totalMinutos, float valorMinuto, float valorAssinatura) {
		setTotalMinutos(totalMinutos);
		setValorMinuto(valorMinuto);
		setValorAssinatura(valorAssinatura);
	}

	public int getTotalMinutos() {
		return totalMinutos;
	}

	public void setTotalMinutos(int totalMinutos) {
		this.totalMinutos = totalMinutos;
	}

	public float getValorMinuto() {
		return valorMinuto;
	}

	public void setValorMinuto(float valorMinuto) {
		this.valorMinuto = valorMinuto;
	}

	public float getValorAssinatura() {
		return valorAssinatura;
	}

	public void setValorAssinatura(float valorAssinatura) {
		this.valorAssinatura = valorAssinatura;
	}

	@Override
	public double calculaConta() {
		return getValorAssinatura() + (getValorMinuto() * getTotalMinutos());
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n\tTot Min\t: " + getTotalMinutos() + "\n\t$ Min\t: " + getValorMinuto()
		+ "\n\t$ Ass.\t: " + getValorAssinatura() + "\n\t$ Conta\t: " + calculaConta();
	}
}
