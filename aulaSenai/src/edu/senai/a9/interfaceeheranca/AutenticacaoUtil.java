package edu.senai.a9.interfaceeheranca;

public class AutenticacaoUtil {
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}
