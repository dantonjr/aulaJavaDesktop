package edu.senai.a9.interfaces;

import edu.senai.a5.heranca.Veiculo;

public class SuperCalculadoraDeTudo {
	private double valorTotal = 0;

	public double getValorTotal() {
		return valorTotal;
	}

	public void acumulaTotal(Veiculo veiculo) {
		valorTotal += veiculo.getImpostoPadrao();
	}
	
	public void acumulaTotal(ICalculavel conta) {
		valorTotal += conta.calculaConta();
	}
}
