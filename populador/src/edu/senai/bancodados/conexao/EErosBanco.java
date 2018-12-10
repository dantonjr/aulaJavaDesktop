package edu.senai.bancodados.conexao;

public enum EErosBanco {
	OPEN_CONEXAO ("Erro ao abrir conexão com banco de dados."),
	CLOSE_CONEXAO ("Erro ao fechar a conexão com o banco de dados."),
	CRIA_TABELA ("Erro ao criar a tabela."),
	EXCLUI_TABELA ("Erro ao excluir a tabela."),
	INSERE_DADO ("Erro ao inserir dados na tabela."),
	ROLLBACK ("Erro ao efetuar RollBack na base."),
	CONSULTA_DADO ("Erro ao consultar dados na tabela."),
	EXCLUI_DADO ("Erro ao excluir dados da tabela."),
	ATUALIZA_DADO ("Erro ao atualizar os dados da tabela.") ;
	
	private final String erro;

	public String getErro() {
		return erro;
	}
	
	private EErosBanco(String erro) {
		this.erro = erro;
	}
}
