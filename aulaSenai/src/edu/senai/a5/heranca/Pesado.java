package edu.senai.a5.heranca;

public class Pesado extends Veiculo {
	private double capacidadeCarga;
	private byte qtdEixos;

	public double getImpostoPadrao() {
		System.out.println("Imposto Pesado");
		return super.getImpostoPadrao() + 1000.0;
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public byte getQtdEixos() {
		return qtdEixos;
	}

	public void setQtdEixos(byte qtdEixos) {
		this.qtdEixos = qtdEixos;
	}

	public double getPesoEixo() {
		return getCapacidadeCarga() / getQtdEixos();
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nCap. Carga....: " + getCapacidadeCarga() +
				"\nQtd. Eixos....: " + getQtdEixos() +
				"\nPeso Eixo.....: " + getPesoEixo();
	}
}
