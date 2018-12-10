package edu.senai.a8.randomicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import edu.senai.a5.heranca.ECor;
import edu.senai.a8.abstracao.Circulo;
import edu.senai.a8.abstracao.Quadrado;
import edu.senai.a8.abstracao.Retangulo;
import edu.senai.a8.abstracao.Triangulo;

public class FigurasRandomicas {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Random aleatorio = new Random();
		System.out.print("Informe o total de figuras...: ");
		int totalFiguras = Integer.parseInt(teclado.readLine());
		for (int i = 0; i < totalFiguras; i++) {
			ECor cor = ECor.values()[aleatorio.nextInt(ECor.values().length)];
			switch (aleatorio.nextInt(4) + 1) {
			case 1:
				Quadrado quadrado = new Quadrado(aleatorio.nextDouble() * 100, cor);
				System.out.println(quadrado.toString());
				break;
			case 2:
				Retangulo retangulo = new Retangulo(aleatorio.nextDouble() * 100, aleatorio.nextDouble() * 100, cor);
				System.out.println(retangulo.toString());
				break;
			case 3:
				Circulo circulo = new Circulo(aleatorio.nextDouble() * 100, cor);
				System.out.println(circulo.toString());
				break;
			default:
				Triangulo triangulo = new Triangulo(aleatorio.nextDouble() * 100, aleatorio.nextDouble() * 100,
						aleatorio.nextDouble() * 100, cor);
				System.out.println(triangulo.toString());
				break;
			}
		}
	}
}
