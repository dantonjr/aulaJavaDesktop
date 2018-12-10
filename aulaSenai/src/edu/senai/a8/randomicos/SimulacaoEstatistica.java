package edu.senai.a8.randomicos;

import java.util.Random;

public class SimulacaoEstatistica {
	public static final int TOTAL_FIGURAS = 14;

	public static void main(String[] args) {
		Random aleatorio = new Random();
		boolean achou = false; 
		long total = 0;
		while (!achou) {
			achou = true;
			for (int i = 0; i < TOTAL_FIGURAS; i++) {
				if (aleatorio.nextInt(4) + 1 != 1) {
					achou = false;
					break;
				}
			}
			total++;
		}
		System.out.println(total);
	}
}