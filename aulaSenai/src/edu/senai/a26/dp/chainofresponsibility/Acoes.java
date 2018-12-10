package edu.senai.a26.dp.chainofresponsibility;

public class Acoes extends ImportanciaDaAplicacao{

	@Override
	protected int prazo() {
		return 2000;
	}

	@Override
	protected double valor() {
		return 100000;
	}

	@Override
	protected String qualAplicacao() {
		return "Ações";
	}

}
