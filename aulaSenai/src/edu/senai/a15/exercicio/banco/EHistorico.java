package edu.senai.a15.exercicio.banco;

public enum EHistorico {
	CRIAR ("Abertura de conta corrente", 'C'),
	DEPOSITAR ("Depósito efetuado", 'C'),
	SACAR ("Saque efetuado", 'D'),
	SALDO ("Verificação de saldo em conta", '-'),
	TROCA_SENHA ("Troca de senha", '-'),
	MOVIMENTACAO_ORIGEM ("Transferência efetuada", 'D'),
	MOVIMENTACAO_DESTINO ("Transferência recebida", 'C'),
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
