package edu.senai.a15.exercicio.banco;

public enum EMensagensErro {
	CONTA_INVALIDA ("Conta Inv�lida: N�mero de conta n�o pode ser zero ou negativo."),
	TITULAR_INVALIDO ("Titular Inv�lido: Nome do titular n�o pode ser nulo ou vazio."),
	SENHA_INVALIDA  ("Senha Inv�lida: Senha n�o pode ser nula ou vazia."),
	AGENCIA_INVALIDA ("Ag�ncia Inv�lida: N�mero da ag�ncia n�o pode ser nulo ou vazio."),
	CONTA_INEXISTENTE ("Conta Inexistente: Conta n�o encontrada na ag�ncia."),
	VALOR_INVALIDO ("Valor Inv�lido: O valor n�o pode ser zero ou negativo."),
	SENHA_INCORRETA ("Senha Incorreta: A senha n�o confere com a senha da conta corrente."),
	SALDO_INSUFICIENTE ("Saldo Insuficiente: O saldo em conta � insuficiente para a opera��o."),
	VALIDACAO_SENHA_INCORRETA ("Valida��o de Senha Incorreta: A nova senha deve ser digitada igualmente duas vezes."),
	CONTA_ORIGEM_INEXISTENTE ("Conta Origem Inexistente: Conta de origem n�o encontrada na ag�ncia."),
	CONTA_DESTINO_INEXISTENTE ("Conta Destino Inexistente: Conta de destino n�o encontrada na ag�ncia."),
	NUMERO_INVALIDO ("N�mero Inv�lido: O n�mero n�o pode ser zero ou negativo."),
	AGENCIA_EXISTENTE ("Ag�ncia Inv�lida: O n�mero da ag�ncia j� existe no banco."),
	CONTA_EXISTENTE ("Conta Inv�lida: A conta informada j� existe na ag�ncia."),
	AGENCIA_INEXISTENTE ("Ag�ncia Inexistente: A ag�ncia n�o existe no banco informado."),
	BANCO_INVALIDO ("Banco Inv�lido: O nome do banco n�o pode ser nulo ou vazio."),
	BANCO_EXISTENTE ("Banco Inv�lido: O n�mero do banco j� existe no sistema."),
	BANCO_INEXISTENTE ("Banco Inv�lido: O banco informado n�o existe no sistema.");
	
	private final String descricao;

	public String getDescricao() {
		return descricao;
	}
	
	private EMensagensErro(String descricao) {
		this.descricao = descricao;
	}
}
