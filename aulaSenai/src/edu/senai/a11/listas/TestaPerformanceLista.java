package edu.senai.a11.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import edu.senai.a5.heranca.ECor;
import edu.senai.a8.abstracao.Circulo;
import edu.senai.a8.abstracao.FiguraGeometrica;
import edu.senai.a8.abstracao.Quadrado;
import edu.senai.a8.abstracao.Retangulo;
import edu.senai.a8.abstracao.Triangulo;

public class TestaPerformanceLista {

	public static final int TOTAL_FIGURAS = 50_000_000;
	public static final int TAMANHO_PADRAO = 100;

	public static void main(String[] args) {
		System.out.println("Processando...");
		Random aleatorio = new Random();
		List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>(TAMANHO_PADRAO);
		List<Quadrado> quadrados = new ArrayList<Quadrado>();
		List<Retangulo> retangulos = new ArrayList<Retangulo>();
		List<Triangulo> triangulos = new ArrayList<Triangulo>();
		List<Circulo> circulos = new ArrayList<Circulo>();
		System.out.println("Listas criadas...");
		System.out.println("Criando figuras...");

		long inicio = System.nanoTime();
		for (int figura = 0; figura < TOTAL_FIGURAS; figura++) {
			ECor cor = ECor.values()[aleatorio.nextInt(ECor.values().length)];
			switch (aleatorio.nextInt(4)) {
			case 0:
				figuras.add(new Quadrado(aleatorio.nextDouble() * TAMANHO_PADRAO, cor));
				break;
			case 1:
				figuras.add(new Retangulo(aleatorio.nextDouble() * TAMANHO_PADRAO,
						aleatorio.nextDouble() * TAMANHO_PADRAO, cor));
				break;
			case 2:
				figuras.add(new Circulo(aleatorio.nextDouble() * TAMANHO_PADRAO, cor));
				break;
			default:
				figuras.add(new Triangulo(aleatorio.nextDouble() * TAMANHO_PADRAO,
						aleatorio.nextDouble() * TAMANHO_PADRAO, aleatorio.nextDouble() * TAMANHO_PADRAO, cor));
				break;
			}
		}
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / (double) 1000000000;
		System.out.println("Lista de figura gerada (" + TOTAL_FIGURAS + ")...");
		System.out.println("Tempo: " + tempo);

		System.out.println("Processamento com ForGet...");
		inicio = System.nanoTime();
		for (int i = 0; i < figuras.size(); i++) {
			if (figuras.get(i) instanceof Quadrado) {
				quadrados.add((Quadrado) figuras.get(i));
			} else if (figuras.get(i) instanceof Triangulo) {
				triangulos.add((Triangulo) figuras.get(i));
			} else if (figuras.get(i) instanceof Retangulo) {
				retangulos.add((Retangulo) figuras.get(i));
			} else {
				circulos.add((Circulo) figuras.get(i));
			}
		}
		fim = System.nanoTime();
		System.out.println("Total quadrados: " + quadrados.size());
		System.out.println("Total triâgulos: " + triangulos.size());
		System.out.println("Total retangulos: " + retangulos.size());
		System.out.println("Total circulos: " + circulos.size());
		tempo = (fim - inicio) / (double) 1000000000;
		System.out.println("Tempo: " + tempo);

		System.out.println("Limpando as listas...");
		quadrados.clear();
		circulos.clear();
		triangulos.clear();
		retangulos.clear();
		System.gc();

		System.out.println("Processamento com ForIterator...");
		inicio = System.nanoTime();
		for (Iterator<FiguraGeometrica> iFigura = figuras.iterator(); iFigura.hasNext();) {
			FiguraGeometrica figura = iFigura.next();
			if (figura instanceof Quadrado) {
				quadrados.add((Quadrado) figura);
			} else if (figura instanceof Triangulo) {
				triangulos.add((Triangulo) figura);
			} else if (figura instanceof Retangulo) {
				retangulos.add((Retangulo) figura);
			} else {
				circulos.add((Circulo) figura);
			}
		}
		fim = System.nanoTime();
		System.out.println("Total quadrados: " + quadrados.size());
		System.out.println("Total triâgulos: " + triangulos.size());
		System.out.println("Total retangulos: " + retangulos.size());
		System.out.println("Total circulos: " + circulos.size());
		tempo = (fim - inicio) / (double) 1000000000;
		System.out.println("Tempo: " + tempo);

		System.out.println("Limpando as listas...");
		quadrados.clear();
		circulos.clear();
		triangulos.clear();
		retangulos.clear();
		System.gc();

		System.out.println("Processamento com ForEach...");
		inicio = System.nanoTime();
		for (FiguraGeometrica figura : figuras) {
			if (figura instanceof Quadrado) {
				quadrados.add((Quadrado) figura);
			} else if (figura instanceof Triangulo) {
				triangulos.add((Triangulo) figura);
			} else if (figura instanceof Retangulo) {
				retangulos.add((Retangulo) figura);
			} else {
				circulos.add((Circulo) figura);
			}
		}
		fim = System.nanoTime();
		System.out.println("Total quadrados: " + quadrados.size());
		System.out.println("Total triâgulos: " + triangulos.size());
		System.out.println("Total retangulos: " + retangulos.size());
		System.out.println("Total circulos: " + circulos.size());
		tempo = (fim - inicio) / (double) 1000000000;
		System.out.println("Tempo: " + tempo);

		System.out.println("Limpando as listas...");
		figuras.clear();
		quadrados.clear();
		circulos.clear();
		triangulos.clear();
		retangulos.clear();
		System.gc();

		System.out.println("Fim...");

	}
}
