package edu.senai.a8.abstracao;

import edu.senai.a5.heranca.ECor;

public class UsaFigura {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		System.out.println(quadrado);
		System.out.println("***");
		quadrado = new Quadrado(12.5, ECor.AZUL);
		System.out.println(quadrado);
		System.out.println("***");
		Retangulo retangulo = new Retangulo();
		System.out.println(retangulo);
		System.out.println("***");
		retangulo = new Retangulo(20, 56, ECor.VERDE);
		System.out.println(retangulo);
		System.out.println("***");
		Circulo circulo = new Circulo();
		System.out.println(circulo);
		System.out.println("***");
		circulo = new Circulo(22.45, ECor.VERMELHO);
		System.out.println(circulo);
		System.out.println("***");
		Triangulo triangulo = new Triangulo();
		System.out.println(triangulo);
		System.out.println("***");
		triangulo = new Triangulo(34, 56, 29, ECor.BRANCO);
		System.out.println(triangulo);
		System.out.println("***");
		triangulo = new Triangulo(12, 10, 110, ECor.AZUL);
		System.out.println(triangulo);

	}
}
