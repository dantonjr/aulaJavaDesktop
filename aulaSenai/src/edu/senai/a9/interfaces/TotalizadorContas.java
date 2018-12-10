package edu.senai.a9.interfaces;

public class TotalizadorContas {

	private double total = 0;

	public TotalizadorContas(ICalculavel ... contas) {
		for (ICalculavel conta : contas) {
			total += conta.calculaConta();
		}
	}
	
	public double getTotal() {
		return total;
	}
	
	public void acumulaTotal(ICalculavel conta) {
		total += conta.calculaConta();
	}
}
