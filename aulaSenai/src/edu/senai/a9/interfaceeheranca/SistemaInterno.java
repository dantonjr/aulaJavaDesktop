package edu.senai.a9.interfaceeheranca;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(IAutenticavel pessoa) {
		if (pessoa.autentica(this.senha)) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}
