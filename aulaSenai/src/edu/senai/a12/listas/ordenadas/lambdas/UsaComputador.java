package edu.senai.a12.listas.ordenadas.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.senai.a12.listas.ordenadas.Computador;

public class UsaComputador {

	private static final String[] FABRICANTES = { "Intel", "AMD", "Apple", "Motorola", "Samsung", "Dell" };
	private static final int TAMANHO_VETOR = 10;

	public static void main(String[] args) {
		Random sorteia = new Random(10);
		List<Computador> computadores = new ArrayList<Computador>(TAMANHO_VETOR);
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			computadores.add(new Computador(sorteia.nextInt(5000) + 1000,
					FABRICANTES[sorteia.nextInt(FABRICANTES.length)], sorteia.nextDouble() * 4500));
		}

		System.out.println("*** MOSTRANDO LISTA ORIGINAL ***");
		computadores.forEach((computador) -> System.out.println(computador.toString()));
		computadores.sort((computador1, computador2) -> Integer.compare(computador1.getFrenquencia(), computador2.getFrenquencia()));

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR FREQUENCIA ***");
		computadores.forEach((computador) -> System.out.println(computador.toString()));
		computadores.sort((computador1, computador2) -> computador1.getFabricante().compareTo(computador2.getFabricante()));

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR FABRICANTE ***");
		computadores.forEach((computador) -> System.out.println(computador.toString()));
	}

}