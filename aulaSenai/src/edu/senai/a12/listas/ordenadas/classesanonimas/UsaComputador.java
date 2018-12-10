package edu.senai.a12.listas.ordenadas.classesanonimas;

import java.util.ArrayList;
import java.util.Comparator;
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
		for (Computador computador : computadores) {
			System.out.println(computador.toString());
		}

		computadores.sort(new Comparator<Computador>() {

			@Override
			public int compare(Computador computador1, Computador computador2) {
				return Integer.compare(computador1.getFrenquencia(), computador2.getFrenquencia());
			}
		});

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR FREQUENCIA ***");
		for (Computador computador : computadores) {
			System.out.println(computador.toString());
		}

		computadores.sort(new Comparator<Computador>() {

			@Override
			public int compare(Computador computador1, Computador computador2) {
				return computador1.getFabricante().compareTo(computador2.getFabricante());
			}
		});

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR FABRICANTE ***");
		for (Computador computador : computadores) {
			System.out.println(computador.toString());
		}
		
	}

}