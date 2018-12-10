package edu.senai.a15.exercicio.banco;

public enum EHistorico {
	CRIAR ("Abertura de conta corrente", 'C'),
	DEPOSITAR ("Dep�sito efetuado", 'C'),
	SACAR ("Saque efetuado", 'D'),
	SALDO ("Verifica��o de saldo em conta", '-'),
	TROCA_SENHA ("Troca de senha", '-'),
	MOVIMENTACAO_ORIGEM ("Transfer�ncia efetuada", 'D'),
	MOVIMENTACAO_DESTINO ("Transfer�ncia recebida", 'C'),
	EXTRATO ("Extrato de conta emitido", '-');
	
	private final String descricao;
	private final char tipo;
	
	public String getDescricao() {
		return String.format("%-65s", descricao);
	}
	
	public char getTipo() {
		return tipo;
	}
	
	private EHistorico(String historico, char tipo) {
		this.descricao = historico;
		this.tipo = tipo;
	}
}
