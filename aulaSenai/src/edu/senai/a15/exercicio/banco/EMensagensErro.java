package edu.senai.a15.exercicio.banco;

public enum EMensagensErro {
	CONTA_INVALIDA ("Conta Inválida: Número de conta não pode ser zero ou negativo."),
	TITULAR_INVALIDO ("Titular Inválido: Nome do titular não pode ser nulo ou vazio."),
	SENHA_INVALIDA  ("Senha Inválida: Senha não pode ser nula ou vazia."),
	AGENCIA_INVALIDA ("Agência Inválida: Número da agência não pode ser nulo ou vazio."),
	CONTA_INEXISTENTE ("Conta Inexistente: Conta não encontrada na agência."),
	VALOR_INVALIDO ("Valor Inválido: O valor não pode ser zero ou negativo."),
	SENHA_INCORRETA ("Senha Incorreta: A senha não confere com a senha da conta corrente."),
	SALDO_INSUFICIENTE ("Saldo Insuficiente: O saldo em conta é insuficiente para a operação."),
	VALIDACAO_SENHA_INCORRETA ("Validação de Senha Incorreta: A nova senha deve ser digitada igualmente duas vezes."),
	CONTA_ORIGEM_INEXISTENTE ("Conta Origem Inexistente: Conta de origem não encontrada na agência."),
	CONTA_DESTINO_INEXISTENTE ("Conta Destino Inexistente: Conta de destino não encontrada na agência."),
	NUMERO_INVALIDO ("Número Inválido: O número não pode ser zero ou negativo."),
	AGENCIA_EXISTENTE ("Agência Inválida: O número da agência já existe no banco."),
	CONTA_EXISTENTE ("Conta Inválida: A conta informada já existe na agência."),
	AGENCIA_INEXISTENTE ("Agência Inexistente: A agência não existe no banco informado."),
	BANCO_INVALIDO ("Banco Inválido: O nome do banco não pode ser nulo ou vazio."),
	BANCO_EXISTENTE ("Banco Inválido: O número do banco já existe no sistema."),
	BANCO_INEXISTENTE ("Banco Inválido: O banco informado não existe no sistema.");
	
	private final String descricao;

	public String getDescricao() {
		return descricao;
	}
	
	private EMensagensErro(String descricao) {
		this.descricao = descricao;
	}
}
