package edu.senai.a26.dp.chainofresponsibility;

public class SolicitacaoDeAplicacao {
	private double valor;
	private String descricao;
	private int prazo;

	public SolicitacaoDeAplicacao(double valor, String descricao, int prazo) {
		setValor(valor);
		setDescricao(descricao);
		setPrazo(prazo);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

}
