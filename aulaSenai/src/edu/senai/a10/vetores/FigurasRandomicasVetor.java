package edu.senai.a10.vetores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import edu.senai.a5.heranca.ECor;
import edu.senai.a8.abstracao.Circulo;
import edu.senai.a8.abstracao.FiguraGeometrica;
import edu.senai.a8.abstracao.Quadrado;
import edu.senai.a8.abstracao.Retangulo;
import edu.senai.a8.abstracao.Triangulo;

public class FigurasRandomicasVetor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Random aleatorio = new Random();
		System.out.print("Informe o total de figuras...: ");
		int totalFiguras = Integer.parseInt(teclado.readLine());
		FiguraGeometrica[] figuras = new FiguraGeometrica[totalFiguras];
		for (int i = 0; i < totalFiguras; i++) {
			ECor cor = ECor.values()[aleatorio.nextInt(ECor.values().length)];
			switch (aleatorio.nextInt(4) + 1) {
			case 1:
				figuras[i] = new Quadrado(aleatorio.nextDouble() * 100, cor);
				break;
			case 2:
				figuras[i] = new Retangulo(aleatorio.nextDouble() * 100, aleatorio.nextDouble() * 100, cor);
				break;
			case 3:
				figuras[i] = new Circulo(aleatorio.nextDouble() * 100, cor);
				break;
			default:
				figuras[i] = new Triangulo(aleatorio.nextDouble() * 100, aleatorio.nextDouble() * 100,
						aleatorio.nextDouble() * 100, cor);
				break;
			}
		}
		System.out.println("MOSTRAR FIGURAS");
		for (FiguraGeometrica figura : figuras) {
			System.out.println(figura.toString());
		}
	}
}
