package edu.senai.a13.listas.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TestaListasRecursosJavaOito {
	private static final String[] FABRICANTES = { "Intel", "AMD", "Apple", "Motorola", "Samsung", "Dell" };

	private static final int TAMANHO_VETOR = 10;

	public static void main(String[] args) {
		Random sorteia = new Random(10);
		List<ComputadorComPeca> computadores = new ArrayList<ComputadorComPeca>(TAMANHO_VETOR);
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			computadores.add(new ComputadorComPeca(sorteia.nextInt(5000) + 1000,
					FABRICANTES[sorteia.nextInt(FABRICANTES.length)], sorteia.nextDouble() * 4500));
		}

		System.out.println("*** MOSTRANDO LISTA ORIGINAL ***");
		computadores.forEach((computador) -> System.out.println(computador.toString()));

		computadores.sort(Comparator.comparing(ComputadorComPeca::getPreco));
		System.out.println("*** MOSTRANDO LISTA POR PREÇO ***");
		computadores.forEach((computador) -> System.out.println(computador.toString()));

		computadores.sort(Comparator.comparing(ComputadorComPeca::getFrenquencia));
		System.out.println("*** MOSTRANDO LISTA POR FREQUENCIA ***");
		computadores.forEach((computador) -> System.out.println(computador.toString()));

		double precoTotal = 0;
		for (ComputadorComPeca computador : computadores) {
			precoTotal += computador.getPreco();
		}
		System.out.println("Preço total é: " + precoTotal);
		
		double precoTotalJavaOito = computadores.stream().mapToDouble(ComputadorComPeca::getPreco).sum();
		System.out.println("Preço total é (java 8): " + precoTotalJavaOito);
	}
}
