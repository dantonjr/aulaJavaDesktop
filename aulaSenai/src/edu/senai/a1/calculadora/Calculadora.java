package edu.senai.a1.calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
	public static void main(String[] args) throws NumberFormatException, IOException {
		float valor1 = 0;
		float valor2 = 0;

		if (args.length >= 2) {
			valor1 = Float.parseFloat(args[0]);
			valor2 = Float.parseFloat(args[1]);
		} else {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Valor 1...: ");
			valor1 = Float.parseFloat(teclado.readLine());
			System.out.print("Valor 2...: ");
			valor2 = Float.parseFloat(teclado.readLine());
		}
		System.out.println("A soma é: " + (valor1 + valor2));
	}
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print((args.length >=2 ? "" : "valor 1 "));
//		float valor1 = (args.length >= 2 ? Float.parseFloat(args[0]) : Float.parseFloat(teclado.readLine()));
//		System.out.print((args.length >=2 ? "" : "valor 2 "));
//		float valor2 = (args.length >= 2 ? Float.parseFloat(args[1]) : Float.parseFloat(teclado.readLine()));
//		System.out.println("A soma é: " + (valor1 + valor2));
//	}

}
