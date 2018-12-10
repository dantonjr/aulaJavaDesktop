package edu.senai.a24.dp.singleton;

public class TestaSingleton {
	public static void main(String[] args) {
		AlgoSingleton m1 = AlgoSingleton.getInstance();
		System.out.println("Acessos: " + m1.getContaAcesso());
		m1.setMensagem("Boa noite");
		System.out.println("M1: " + m1.getMensagem());
		
		AlgoSingleton m2 = AlgoSingleton.getInstance();
		m2.setMensagem("Alagando a sala");
		System.out.println("M2: " + m2.getMensagem());
		
		System.out.println("M1: " + m1.getMensagem());
		System.out.println("Acessos: " + m1.getContaAcesso());
		m2 = AlgoSingleton.getInstance();
		m2 = AlgoSingleton.getInstance();
		m2 = AlgoSingleton.getInstance();
		m2 = AlgoSingleton.getInstance();
		m2 = AlgoSingleton.getInstance();
		m2 = AlgoSingleton.getInstance();
		System.out.println("Acessos: " + m1.getContaAcesso());
	}
}
