package edu.senai.a15.exercicio.banco;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;
	private int numeroBanco;
	private String nomeBanco;
	private Map<String, Agencia> agencias;

	public Banco(int numeroBanco, String nomeBanco) throws AgenciaException {
		this.agencias = new HashMap<String, Agencia>();
		setNumeroBanco(numeroBanco);
		setNomeBanco(nomeBanco);
	}

	public int getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(int numeroBanco) throws AgenciaException {
		Regras.validaValor(numeroBanco, EMensagensErro.NUMERO_INVALIDO);
		this.numeroBanco = numeroBanco;
	}

	public Map<String, Agencia> getAgencias() {
		return Collections.unmodifiableMap(agencias);
	}

	private void adicionaAgencia(Agencia agencia) throws AgenciaException {
		if (this.agencias.containsKey(agencia.getNumeroAg())) {
			throw new AgenciaException(EMensagensErro.AGENCIA_EXISTENTE);
		}
		this.agencias.put(agencia.getNumeroAg(), agencia);
	}

	public boolean criaAgencia(String numeroAgencia) throws AgenciaException {
		adicionaAgencia(new Agencia(numeroAgencia));
		return true;
	}
	
	public Agencia getAgencia(String numeroAgencia) throws AgenciaException {
		Agencia agencia = this.agencias.get(numeroAgencia);
		if (agencia instanceof Agencia) {
			return agencia;
		}
		throw new AgenciaException(EMensagensErro.AGENCIA_INEXISTENTE);
	}
	
	public boolean transfereEntreAgencias(String numeroAgenciaOrigem, int numeroContaOrigem, String senha, double valor, String numeroAgenciaDestino, int numeroContaDestino) throws AgenciaException {
		Agencia agenciaOrigem = getAgencia(numeroAgenciaOrigem);
		Agencia agenciaDestino = getAgencia(numeroAgenciaDestino);
		ContaCorrente contaOrigem = Regras.validaConta(numeroContaOrigem, agenciaOrigem.getContas(), EMensagensErro.CONTA_ORIGEM_INEXISTENTE);
		ContaCorrente contaDestino = Regras.validaConta(numeroContaDestino, agenciaDestino.getContas(), EMensagensErro.CONTA_DESTINO_INEXISTENTE);
		Regras.validaSenha(contaOrigem, senha);
		Regras.validaSaldo(contaOrigem, valor);
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
		contaOrigem.criaMovimentacao(EHistorico.MOVIMENTACAO_ORIGEM, valor);
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		contaDestino.criaMovimentacao(EHistorico.MOVIMENTACAO_DESTINO, valor);
		return true;
	}
	
	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) throws AgenciaException {
		ValidacoesAgencia.validaNuloVazio(nomeBanco, EMensagensErro.BANCO_INVALIDO);
		this.nomeBanco = nomeBanco;
	}

	public void setAgencias(Map<String, Agencia> agencias) {
		this.agencias = agencias;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		StringBuffer relatorioAgencias = new StringBuffer("*** RELATÓRIO DE AGÊNCIAS ***\n");
		relatorioAgencias.append("Banco: " + getNomeBanco() + "\nTotal de agências: " + agencias.size() + "\n");
		agencias.values().forEach(agencia -> relatorioAgencias.append(agencia.toString() + "\n\tSaldo médio: "
				+ df.format(agencia.getSaldoMedio()) + "\n\tMaior saldo: " + df.format(agencia.getMaiorSaldo()) + "\n"));
		return relatorioAgencias.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroBanco;
		return result;
	}

	@Override
	public boolean equals(Object banco) {
		if (banco instanceof Banco) {
			return this.getNumeroBanco() == ((Banco) banco).getNumeroBanco();
		}
		return false;
	}

}
