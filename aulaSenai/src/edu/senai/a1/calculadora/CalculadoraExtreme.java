package edu.senai.a1.calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraExtreme {
	public static void main(String[] args) throws NumberFormatException, IOException {
		float v1 = 0;
		float v2 = 0;
		char operador = ' ';
		
		if (args.length == 3) {
			v1 = Float.parseFloat(args[0]);
			v2 = Float.parseFloat(args[1]);
			operador = args[2].charAt(0);
		} else {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Valor 1....: ");
			v1 = Float.parseFloat(teclado.readLine());
			System.out.print("Valor 2....: ");
			v2 = Float.parseFloat(teclado.readLine());
			System.out.print("Operador...: ");
			operador = teclado.readLine().charAt(0);
		}
		
		switch (operador) {
		default:
			System.out.println("A adição é: " + (v1 + v2));
			break;
		case '-':
			System.out.println("A subtração é: " + (v1 - v2));
			break;
		case '/':
			System.out.println("A divisão é: " + (v1 / v2));
			break;
		case 'X':
		case 'x':
			System.out.println("A multiplicação é: " + (v1 * v2));
			break;
		}
		
	}
}
