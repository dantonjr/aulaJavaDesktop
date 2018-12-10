package edu.senai.a15.exercicio.banco;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class Agencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private String numeroAg;
	private Map<Integer, ContaCorrente> contas;
	private int contaConta;

	public Agencia() throws AgenciaException {
		this("Sem número");
	}

	public Agencia(String numeroAg) throws AgenciaException {
		this.contaConta = 1;
		this.contas = new HashMap<Integer, ContaCorrente>();
		setNumeroAg(numeroAg);
	}

	public String getNumeroAg() {
		return numeroAg;
	}

	public void setNumeroAg(String numeroAg) throws AgenciaException {
		ValidacoesAgencia.validaNuloVazio(numeroAg, EMensagensErro.AGENCIA_INVALIDA);
		this.numeroAg = numeroAg;
	}

	private void adicionaConta(ContaCorrente conta) throws AgenciaException {
		if (this.contas.containsKey(conta.getNumero())) {
			throw new AgenciaException(EMensagensErro.CONTA_EXISTENTE);
		}
		this.contas.put(new Integer(conta.getNumero()), conta);
	}

	public int criaConta(String titular, String senha, double saldo) throws AgenciaException {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setNumero(contaConta);
		contaCorrente.setTitular(titular);
		contaCorrente.setSenha(senha);
		contaCorrente.setSaldo(saldo);
		contaCorrente.criaMovimentacao(EHistorico.CRIAR, saldo);
		this.adicionaConta(contaCorrente);
		return contaConta++;
	}

	public Map<Integer, ContaCorrente> getContas() {
		return Collections.unmodifiableMap(contas);
	}

	public boolean deposita(int numeroCta, double valor) throws AgenciaException {
		ContaCorrente conta = Regras.validaConta(numeroCta, this.contas);
		Regras.validaValor(valor, EMensagensErro.VALOR_INVALIDO);
		conta.setSaldo(conta.getSaldo() + valor);
		conta.criaMovimentacao(EHistorico.DEPOSITAR, valor);
		return true;
	}

	public boolean saca(int numeroCta, String senha, double valor) throws AgenciaException {
		ContaCorrente conta = Regras.validaConta(numeroCta, this.contas);
		Regras.validaSenha(conta, senha);
		Regras.validaSaldo(conta, valor);
		conta.setSaldo(conta.getSaldo() - valor);
		conta.criaMovimentacao(EHistorico.SACAR, valor);
		return true;
	}

	public double saldo(int numeroCta, String senha) throws AgenciaException {
		ContaCorrente conta = Regras.validaConta(numeroCta, this.contas);
		Regras.validaSenha(conta, senha);
		conta.criaMovimentacao(EHistorico.SALDO, conta.getSaldo());
		return conta.getSaldo();
	}

	public boolean trocaSenha(int numeroCta, String senha, String novaSenha, String validaNovaSenha)
			throws AgenciaException {
		ContaCorrente conta = Regras.validaConta(numeroCta, this.contas);
		Regras.validaSenha(conta, senha);
		Regras.validaSenhaNova(novaSenha, validaNovaSenha);
		conta.setSenha(novaSenha);
		conta.criaMovimentacao(EHistorico.TROCA_SENHA, 0);
		return true;
	}

	public boolean transfere(int numeroCtaOrigem, String senha, double valor, int numeroCtaDestino)
			throws AgenciaException {
		ContaCorrente contaOrigem = Regras.validaConta(numeroCtaOrigem, this.contas,
				EMensagensErro.CONTA_ORIGEM_INEXISTENTE);
		ContaCorrente contaDestino = Regras.validaConta(numeroCtaDestino, this.contas,
				EMensagensErro.CONTA_DESTINO_INEXISTENTE);
		Regras.validaSenha(contaOrigem, senha);
		Regras.validaSaldo(contaOrigem, valor);
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
		contaOrigem.criaMovimentacao(EHistorico.MOVIMENTACAO_ORIGEM, valor);
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		contaDestino.criaMovimentacao(EHistorico.MOVIMENTACAO_DESTINO, valor);
		return true;
	}

	public String extrato(int numeroCta, String senha) throws AgenciaException {
		ContaCorrente conta = Regras.validaConta(numeroCta, this.contas);
		Regras.validaSenha(conta, senha);
		conta.criaMovimentacao(EHistorico.EXTRATO, 0);
		return conta.toString();
	}

	public double getSomaDepositos() {
		return this.contas.values().stream().mapToDouble(ContaCorrente::getSaldo).sum();
	}

	public double getSaldoMedio() {
		OptionalDouble valor = this.contas.values().stream().mapToDouble(ContaCorrente::getSaldo).average(); 
		return valor.isPresent() ? valor.getAsDouble() : 0;
	}

	public double getMaiorSaldo() {
		OptionalDouble valor = this.contas.values().stream().mapToDouble(ContaCorrente::getSaldo).max();
		return valor.isPresent() ? valor.getAsDouble() : 0;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		return "Agência número: " + getNumeroAg() + "\n\tTotal de contas abertas\t: " + this.contas.size()
				+ "\n\tSaldo total da agência\t: " + df.format(getSomaDepositos());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroAg == null) ? 0 : numeroAg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object agencia) {
		if (agencia instanceof Agencia) {
			return getNumeroAg().equalsIgnoreCase(((Agencia) agencia).getNumeroAg());
		}
		return false;
	}

}
