package edu.senai.a15.exercicio.banco;

public class ValidacoesAgencia {
	public static void validaNuloVazio(String valor, EMensagensErro erro) throws AgenciaException {
		if (valor == null)
			throw new AgenciaException(erro);
		if (valor.trim().isEmpty())
			throw new AgenciaException(erro);
	}
}
