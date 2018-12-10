package edu.senai.a1.calculadora;

public class Calc {
	public float soma(float a, float b) {
		return a + b;
	}
	
	public int soma(int a, int b) {
		return a+ b;
	}
	
	public static int soma(int a) {
		return a + a;
	}
	
	public static int soma(int ... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma += valor;
		}
		return soma;
	}
}
