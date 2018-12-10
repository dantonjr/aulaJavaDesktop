package edu.senai.a24.dp.singleton;

public class AlgoSingleton {
	private static AlgoSingleton instance = null;
	private static int contaAcesso = 0;
	private String mensagem;

	private AlgoSingleton() {
		System.out.println("Objeto foi Criado...");
	}

	public static AlgoSingleton getInstance() {
		if (instance == null) {
			instance = new AlgoSingleton();
		}
		contaAcesso++;
		return instance;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getContaAcesso() {
		return contaAcesso;
	}

}
