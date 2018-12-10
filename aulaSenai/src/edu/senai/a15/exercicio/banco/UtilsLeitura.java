package edu.senai.a15.exercicio.banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtilsLeitura {
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	public static int leInteiro(int inicio, int fim) {
		while (true) {
			int valor = leInteiro();
			if (valor >= inicio && valor <= fim) {
				return valor;
			}
			System.out.println("Entre um n�mero entre: " + inicio + " e " + fim);
		}
	}

	public static int leInteiro() {
		while (true) {
			try {
				return Integer.parseInt(teclado.readLine());
			} catch (Exception e) {
				System.out.println("Entre com um n�mero inteiro v�lido!!!");
			}
		}
	}

	public static String leString() {
		while (true) {
			try {
				return teclado.readLine();
			} catch (IOException e) {
				System.out.println("Entre com uma String v�lida!!!");
			}
		}
	}
	
	public static double leDouble() {
		while (true) {
			try {
				return Double.parseDouble(teclado.readLine());
			} catch (Exception e) {
				System.out.println("Entre com um n�mero double v�lido!!!");
			}
		}
	}
}
