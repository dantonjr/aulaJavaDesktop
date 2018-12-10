package edu.senai.a15.exercicio.banco;

public class Menus {
	public static void montaMenuPrincipal() {
		System.out.println("*** MENU PRINCIPAL ***");
		System.out.println("1 - Criar banco");
		System.out.println("2 - Entrar no banco");
		System.out.println("3 - Finalizar sistema");
		System.out.print("Entre com sua opção: ");
	}

	public static void montaMenuBanco() {
		System.out.println("*** MENU DO BANCO ***");
		System.out.println("1 - Criar uma agência");
		System.out.println("2 - Abrir uma conta");
		System.out.println("3 - Depositar");
		System.out.println("4 - Sacar");
		System.out.println("5 - Verificar saldo");
		System.out.println("6 - Transfere entre mesmo banco e agência");
		System.out.println("7 - Transfere entre mesmo banco e agências diferentes");
		System.out.println("8 - Transfere entre bancos diferentes (DOC/TED)");
		System.out.println("9 - Emite extrato");
		System.out.println("10 - Troca senha");
		System.out.println("0 - Sair do banco");
		System.out.print("Entre com sua opção: ");
	}
}
