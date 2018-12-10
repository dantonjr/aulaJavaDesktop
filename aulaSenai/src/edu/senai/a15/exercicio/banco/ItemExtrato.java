package edu.senai.a15.exercicio.banco;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemExtrato implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date data;
	private EHistorico historico;
	private double valor;

	public ItemExtrato(EHistorico historico, double valor) {
		this.data = new Date();
		this.historico = historico;
		this.valor = valor;
	}
	
	public Date getData() {
		return data;
	}

	public EHistorico getHistorico() {
		return historico;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		return sdf.format(getData())
				+ "\t" + getHistorico().getDescricao()
				+ String.format("%15s", df.format(getValor()))
				+ " " + getHistorico().getTipo();
	}
}