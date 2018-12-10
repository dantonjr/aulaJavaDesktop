package edu.senai.a18.bancodados.conexao;

public enum EErrosConexao {
	ABRE_CONEXAO ("Erro de Conexão: Não foi possível estabelecer conexão com o Banco de Dados."),
	FECHA_CONEXAO ("Erro de Conexão: Não foi possível fechar a conexão com o Banco de Dados.");
	
	private final String mensagem;

	public String getMensagem() {
		return mensagem;
	}
	
	private EErrosConexao(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String toString() {
		return getMensagem();
	}
}
