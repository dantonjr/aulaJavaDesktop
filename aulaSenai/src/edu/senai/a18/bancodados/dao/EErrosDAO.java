package edu.senai.a18.bancodados.dao;

public enum EErrosDAO {
	CRIA_TABELA ("Erro ao criar a tabela especificada: "),
	EXCLUI_TABELA ("Erro ao excluir a tabela especificada: "),
	INSERE_DADO ("Erro ao inserir o dado na tabela especificada: "),
	CONSULTA_DADO ("Erro ao consultar dados na tabela especificada: "),
	EXCLUI_DADO ("Erro ao excluir dados na tabela especificada: "),
	ALTERA_DADO ("Erro ao alterar dados na tabela especificada: "),
	ROLLBACK ("Erro ao efetuar o roolback na tabela especificada: ");
	
	private final String mensagem;

	public String getMensagem() {
		return mensagem;
	}
	
	private EErrosDAO(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String toString() {
		return getMensagem();
	}
}
