package edu.senai.a15.exercicio.banco;

public class AgenciaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AgenciaException(EMensagensErro erro) {
		super(erro.getDescricao());
	}

}
