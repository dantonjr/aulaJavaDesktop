package edu.senai.a18.bancodados.conexao;

import edu.senai.a18.bancodados.log.GeraLog;

public class ConexaoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ConexaoException(EErrosConexao erro, String mensagem) {
		super(erro.getMensagem() + "#" + mensagem);
		GeraLog log = new GeraLog();
		log.escreveLogArquivo(erro, mensagem);
	}
}
