package edu.senai.a5.heranca;

public class CalculaImpostoVeiculos {
	private double total;

	public void registraImposto(Veiculo veiculo) {
		total += veiculo.getImpostoPadrao();
	}
	
	public double getTotal() {
		return total;
	}
}
