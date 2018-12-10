package edu.senai.a26.dp.chainofresponsibility;

public class LCI extends ImportanciaDaAplicacao {

	@Override
	protected int prazo() {
		return 500;
	}

	@Override
	protected double valor() {
		return 6000;
	}

	@Override
	protected String qualAplicacao() {
		return "LCI - Letra de Crédito Imobiliário";
	}

}
