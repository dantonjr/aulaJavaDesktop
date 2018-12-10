package edu.senai.a9.interfaces;

public class ContaAgua implements ICalculavel {
	private int M3;
	private float valorM3;


	public ContaAgua() {
		this(10, (float) 5.98);
	}

	public ContaAgua(int M3, float valorM3) {
		setM3(M3);
		setValorM3(valorM3);
	}
	
	public int getM3() {
		return M3;
	}

	public void setM3(int m3) {
		M3 = m3;
	}

	public float getValorM3() {
		return valorM3;
	}

	public void setValorM3(float valorM3) {
		this.valorM3 = valorM3;
	}

	@Override
	public double calculaConta() {
		return getValorM3() * getM3();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n\tM3\t: " + getM3() + "\n\t$ M3\t: " + getValorM3()
				+ "\n\t$ Conta\t: " + calculaConta();
	}

}
