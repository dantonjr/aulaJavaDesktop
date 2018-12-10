package edu.senai.a26.dp.chainofresponsibility;

public class Poupanca extends ImportanciaDaAplicacao {

	@Override
	protected int prazo() {
		return 31;
	}

	@Override
	protected double valor() {
		return 150;
	}

	@Override
	protected String qualAplicacao() {
		return "Poupança";
	}

}
