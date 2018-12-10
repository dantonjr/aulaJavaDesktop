package edu.senai.a15.exercicio.banco;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaCorrente implements Comparable<ContaCorrente>, Serializable {
	private static final long serialVersionUID = 1L;
	private int numero;
	private String titular;
	private String senha;
	private double saldo;
	private List<ItemExtrato> movimentacoes;

	public ContaCorrente() throws AgenciaException {
		this(Integer.MAX_VALUE, "Não informado", "123", 0);
	}

	public ContaCorrente(int numero, String titular, String senha, double saldo) throws AgenciaException {
		this.movimentacoes = new ArrayList<ItemExtrato>();
		setNumero(numero);
		setTitular(titular);
		setSenha(senha);
		setSaldo(saldo);
	}

	private void adicionaMovimentacao(ItemExtrato item) {
		this.movimentacoes.add(item);
	}
	
	public void criaMovimentacao(EHistorico historico, double valor) {
		adicionaMovimentacao(new ItemExtrato(historico, valor));
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) throws AgenciaException {
		if (numero <= 0)
			throw new AgenciaException(EMensagensErro.CONTA_INVALIDA);
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) throws AgenciaException {
		ValidacoesAgencia.validaNuloVazio(titular, EMensagensErro.TITULAR_INVALIDO);
		this.titular = titular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws AgenciaException {
		ValidacoesAgencia.validaNuloVazio(senha, EMensagensErro.SENHA_INVALIDA);
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String separador = String.format("%100s", "").replaceAll(" ", "-") + "\n";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy (E) - HH:mm:ss");
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		StringBuffer extrato = new StringBuffer("\t**** EXTRATO PARA SIMPLES CONFERÊNCIA ***\n");
		extrato.append("Data: " + sdf.format(new Date()) + "\n");
		extrato.append("Conta: " + getNumero() + "\n");
		extrato.append("Titular: " + getTitular() + "\n");
		extrato.append(separador);
		extrato.append("Data\t\tHistórico\t\t\t\t\t\t\t\tValor\tTipo\n");
		extrato.append(separador);
		for (ItemExtrato itemExtrato : movimentacoes) {
			extrato.append(itemExtrato.toString() + "\n");
		}
		extrato.append(separador);
		extrato.append(String.format("%100s", ("Saldo Atual: " + df.format(getSaldo()))));
		return extrato.toString();
	}

	@Override
	public boolean equals(Object outraConta) {
		return this.getNumero() == ((ContaCorrente) outraConta).getNumero();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.getNumero();
		return result;
	}

	@Override
	public int compareTo(ContaCorrente outraConta) {
		return Integer.compare(this.getNumero(), outraConta.getNumero());
	}
}
