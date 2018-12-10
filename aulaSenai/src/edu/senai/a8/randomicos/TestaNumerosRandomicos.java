package edu.senai.a8.randomicos;

public class TestaNumerosRandomicos {
	public static void main(String[] args) {
//		Random sorteio = new Random(100);
//		for (int i = 0; i < 10; i++) {
//			System.out.println(sorteio.nextInt(20));
////			System.out.println(sorteio.nextDouble());
//		}
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 3));
			
		}
	}
}
