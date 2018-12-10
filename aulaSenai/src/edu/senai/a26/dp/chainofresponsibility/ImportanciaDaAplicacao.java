package edu.senai.a26.dp.chainofresponsibility;

public abstract class ImportanciaDaAplicacao {
	protected ImportanciaDaAplicacao proximaAplicacao;

	protected abstract int prazo();

	protected abstract double valor();

	protected abstract String qualAplicacao();

	public void setProximaAplicacao(ImportanciaDaAplicacao aplicacao) {
		this.proximaAplicacao = aplicacao;
	}

	public String solicitaAplicacao(SolicitacaoDeAplicacao aplicacao) {

		if (aplicacao.getPrazo() < this.prazo() && aplicacao.getValor() < this.valor()) {
			return "Apliquei em " + this.qualAplicacao() + " o valor de: " + aplicacao.getValor() + " - "
					+ aplicacao.getDescricao();
		} else if (proximaAplicacao != null) {
			return proximaAplicacao.solicitaAplicacao(aplicacao);
		}
		return "Não há aplicação válida para esses valores... " + aplicacao.getDescricao();
	}
}
