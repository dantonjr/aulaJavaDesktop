package edu.senai.a5.heranca;

public abstract class Veiculo {
	private String placa;
	private ECor cor;
	private double peso;
	private double impostoPadrao = 100.0;

	public void setImpostoPadrao(double impostoPadrao) {
		this.impostoPadrao = impostoPadrao;
	}
	
	public double getImpostoPadrao() {
		return impostoPadrao;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public ECor getCor() {
		return cor;
	}

	public void setCor(ECor cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPesoTonelada() {
		return (getPeso() / 1000) + " Ton.";
	}
	
	@Override
	public String toString() {
		return "Placa.........: " + getPlaca() +
			 "\nCor...........: " + getCor().getCorBR() +
			 "\nPeso..........: " + getPeso();
	}
}
