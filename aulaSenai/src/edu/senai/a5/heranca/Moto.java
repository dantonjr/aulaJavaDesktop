package edu.senai.a5.heranca;

public final class Moto extends Veiculo {
	private int cilindradas;

	public double getImpostoPadrao() {
		System.out.println("Imposto Moto");
		return super.getImpostoPadrao() / 2;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nCilindradas...: " + getCilindradas();
	}
}
