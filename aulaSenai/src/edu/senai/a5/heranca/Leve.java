package edu.senai.a5.heranca;

public class Leve extends Veiculo {
	private byte numeroPortas;
	private ECombustivel combustivel;
	private float consumo;
	private int capacidadeTanque;

	public double getImpostoPadrao() {
		System.out.println("Imposto Leve");
		return super.getImpostoPadrao() + (super.getImpostoPadrao() * 0.20);
	}

	public byte getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(byte numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public ECombustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(ECombustivel combustivel) {
		this.combustivel = combustivel;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public float getAutonomia() {
		return getCapacidadeTanque() * getConsumo(); 
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n# Portas......: " + getNumeroPortas() +
				"\nCombustível...: " + getCombustivel().getSigla() +
				"\nConsumo.......: " + getConsumo() +
				"\nCap. Tanque...: " + getCapacidadeTanque() +
				"\nAutonomia.....: " + getAutonomia();
	}
}
