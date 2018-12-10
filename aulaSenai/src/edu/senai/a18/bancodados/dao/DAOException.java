package edu.senai.a18.bancodados.dao;

import edu.senai.a18.bancodados.log.GeraLog;

public class DAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public DAOException(EErrosDAO erro, String mensagem, Class<?> classe) {
		super(erro.getMensagem() + classe.getName() + "#" + mensagem);
		GeraLog log = new GeraLog();
		log.escreveLogArquivo(erro, classe.getName(), mensagem);
	}
}
