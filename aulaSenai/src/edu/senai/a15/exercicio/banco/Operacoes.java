package edu.senai.a15.exercicio.banco;

import java.util.Map;

public class Operacoes {
	public boolean criaBanco(Map<Integer, Banco> bancos) throws AgenciaException {
		System.out.print("Informe número do banco: ");
		int numeroBanco = UtilsLeitura.leInteiro(1, Integer.MAX_VALUE);
		if (bancos.keySet().contains(Integer.valueOf(numeroBanco))) {
			throw new AgenciaException(EMensagensErro.BANCO_EXISTENTE);
		}
		System.out.print("Informe nome do banco..: ");
		String nomeBanco = UtilsLeitura.leString();
		bancos.put(Integer.valueOf(numeroBanco), new Banco(numeroBanco, nomeBanco));
		return true;
	}

	public Banco buscaBanco(Map<Integer, Banco> bancos, String mensagem) throws AgenciaException {
		System.out.print(mensagem instanceof String ? mensagem : "Informe número do banco: ");
		int numeroBanco = UtilsLeitura.leInteiro(1, Integer.MAX_VALUE);
		if (bancos.keySet().contains(Integer.valueOf(numeroBanco))) {
			return bancos.get(Integer.valueOf(numeroBanco));
		}
		throw new AgenciaException(EMensagensErro.BANCO_INEXISTENTE);
	}

	public boolean criarAgencia(Banco banco) throws AgenciaException {
		System.out.println("Informe número da agência: ");
		String numeroAgencia = UtilsLeitura.leString();
		if (banco.getAgencias().containsKey(numeroAgencia)) {
			throw new AgenciaException(EMensagensErro.AGENCIA_EXISTENTE);
		}
		banco.criaAgencia(numeroAgencia);
		return true;
	}

	public Agencia buscaAgencia(Banco banco, String mensagem) throws AgenciaException {
		System.out.println(mensagem instanceof String ? mensagem : "Informe número da agência: ");
		String numeroAgencia = UtilsLeitura.leString();
		if (banco.getAgencias().containsKey(numeroAgencia)) {
			return banco.getAgencia(numeroAgencia);
		}
		throw new AgenciaException(EMensagensErro.AGENCIA_INEXISTENTE);
	}

	private double leValor() {
		System.out.println("Informe valor do depósito/saque/transferência: ");
		return UtilsLeitura.leDouble();
	}

	private String leSenha(String mensagem) {
		System.out.println(mensagem instanceof String ? mensagem : "Informe a senha: ");
		return UtilsLeitura.leString();
	}

	private int leConta(String mensagem) {
		System.out.println(mensagem instanceof String ? mensagem : "Informe o número da conta: ");
		return UtilsLeitura.leInteiro(1, Integer.MAX_VALUE);
	}

	public String emiteExtrato(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, null);
		int numeroCta = leConta(null);
		String senha = leSenha(null);
		return agencia.extrato(numeroCta, senha);
	}

	public int abrirConta(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, null);
		System.out.println("Informe nome do titular: ");
		String titular = UtilsLeitura.leString();
		double saldo = leValor();
		String senha = leSenha(null);
		return agencia.criaConta(titular, senha, saldo);
	}

	public boolean depositar(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, null);
		int numeroCta = leConta(null);
		double valor = leValor();
		return agencia.deposita(numeroCta, valor);
	}

	public boolean sacar(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, null);
		int numeroCta = leConta(null);
		String senha = leSenha(null);
		double valor = leValor();
		return agencia.saca(numeroCta, senha, valor);
	}

	public double saldo(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, null);
		int numeroCta = leConta(null);
		String senha = leSenha(null);
		return agencia.saldo(numeroCta, senha);
	}

	public boolean transfereMesmoBancoMesmaAgencia(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, "Informe agência de origem/destino: ");
		int contaOrigem = leConta("Informe o número da conta de origem: ");
		int contaDestino = leConta("Informe o número da conta de destino: ");
		String senha = leSenha(null);
		double valor = leValor();
		return agencia.transfere(contaOrigem, senha, valor, contaDestino);
	}

	public boolean transfereMesmoBancoAgenciaDiferente(Banco banco) throws AgenciaException {
		Agencia agenciaOrigem = buscaAgencia(banco, "Informe agência de origem: ");
		int numeroContaOrigem = leConta("Informe o número da conta de origem: ");
		Agencia agenciaDestino = buscaAgencia(banco, "Informe agência de destino: ");
		int numeroContaDestino = leConta("Informe o número da conta de destino: ");
		String senha = leSenha(null);
		double valor = leValor();
		return banco.transfereEntreAgencias(agenciaOrigem.getNumeroAg(), numeroContaOrigem, senha, valor,
				agenciaDestino.getNumeroAg(), numeroContaDestino);
	}

	public boolean transfereBancos(Banco bancoOrigem, Banco bancoDestino) throws AgenciaException {
		Agencia agenciaOrigem = buscaAgencia(bancoOrigem, "Informe agência de origem: ");
		int numeroContaOrigem = leConta("Informe o número da conta de origem: ");
		Agencia agenciaDestino = buscaAgencia(bancoDestino, "Informe agência de destino: ");
		int numeroContaDestino = leConta("Informe o número da conta de destino: ");
		String senha = leSenha(null);
		double valor = leValor();

		ContaCorrente contaOrigem = Regras.validaConta(numeroContaOrigem, agenciaOrigem.getContas(),
				EMensagensErro.CONTA_ORIGEM_INEXISTENTE);
		ContaCorrente contaDestino = Regras.validaConta(numeroContaDestino, agenciaDestino.getContas(),
				EMensagensErro.CONTA_DESTINO_INEXISTENTE);
		Regras.validaSenha(contaOrigem, senha);
		Regras.validaSaldo(contaOrigem, valor);
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
		contaOrigem.criaMovimentacao(EHistorico.MOVIMENTACAO_ORIGEM, valor);
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		contaDestino.criaMovimentacao(EHistorico.MOVIMENTACAO_DESTINO, valor);
		return true;
	}

	public boolean transfereBancosDiferentes(Banco bancoOrigem, Map<Integer, Banco> bancos)
			throws AgenciaException {
		Banco bancoDestino = buscaBanco(bancos, "Informe número do banco destino: ");
		return transfereBancos(bancoOrigem, bancoDestino);
	}

	public boolean trocaSenha(Banco banco) throws AgenciaException {
		Agencia agencia = buscaAgencia(banco, null);
		int numeroCta = leConta(null);
		String senha = leSenha(null);
		String novaSenha = leSenha("Informe nova senha: ");
		String validaNovaSenha = leSenha("Repita nova senha: ");
		return agencia.trocaSenha(numeroCta, senha, novaSenha, validaNovaSenha);
	}

}
