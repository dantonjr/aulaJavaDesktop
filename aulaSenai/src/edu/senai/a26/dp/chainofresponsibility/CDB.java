package edu.senai.a26.dp.chainofresponsibility;

public class CDB extends ImportanciaDaAplicacao {

	@Override
	protected int prazo() {
		return 181;
	}

	@Override
	protected double valor() {
		return 2000;
	}

	@Override
	protected String qualAplicacao() {
		return "CDB - Certificado de Depósito Bancário";
	}

}
