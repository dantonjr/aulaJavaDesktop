package edu.senai.a15.exercicio.banco;

public class TestaBanco {
	public static void main(String[] args) {
		System.out.print("Entre inteiro: ");
		System.out.println(UtilsLeitura.leInteiro(2, 90));
		try {
			Agencia ag = new Agencia("centro");
			System.out.println("Seu numero é: "+ ag.criaConta("Danton", "123", 900));
			System.out.println("Seu numero é: "+ ag.criaConta("Maria", "123", 1000));
			ag.deposita(1, 340);
			ag.deposita(2, 5000);
			ag.saca(1, "123", 56.90);
			ag.trocaSenha(1, "123", "111", "111");
			ag.saldo(1, "111");
			ag.transfere(2, "123", 2000, 1);
			System.out.println(ag.extrato(1, "111"));
			System.out.println("\n\n");
			System.out.println(ag.extrato(2, "123"));
		} catch (AgenciaException e) {
			System.out.println(e.getMessage());
		}
	}
}
