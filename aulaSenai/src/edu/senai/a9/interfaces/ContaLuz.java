package edu.senai.a9.interfaces;

public class ContaLuz implements ICalculavel {

	private int KWh;
	private float valorKHh;

	public ContaLuz() {
		this(30, (float) .0567);
	}

	public ContaLuz(int KWh, float valorKHh) {
		setKWh(KWh);
		setValorKHh(valorKHh);
	}

	public int getKWh() {
		return KWh;
	}

	public void setKWh(int kWh) {
		KWh = kWh;
	}

	public float getValorKHh() {
		return valorKHh;
	}

	public void setValorKHh(float valorKHh) {
		this.valorKHh = valorKHh;
	}

	@Override
	public double calculaConta() {
		return getValorKHh() * getKWh();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n\tKW/h\t: " + getKWh() + "\n\t$ KW/h\t: " + getValorKHh()
				+ "\n\t$ Conta\t: " + calculaConta();
	}
}
