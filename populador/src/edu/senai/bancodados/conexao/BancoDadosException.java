package edu.senai.bancodados.conexao;

public class BancoDadosException extends Exception {

	private static final long serialVersionUID = 1L;

	public BancoDadosException(EErosBanco erro, String msg) {
		super(erro.getErro() + "\n" + msg);
	}
}
