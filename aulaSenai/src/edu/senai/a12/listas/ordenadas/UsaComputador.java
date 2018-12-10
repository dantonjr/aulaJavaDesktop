package edu.senai.a12.listas.ordenadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

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

		computadores.sort(new ComparaFrequencia());

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR FREQUENCIA ***");
		for (Computador computador : computadores) {
			System.out.println(computador.toString());
		}

		computadores.sort(new ComparaFabricante());

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR FABRICANTE ***");
		for (Computador computador : computadores) {
			System.out.println(computador.toString());
		}

		Collections.sort(computadores);

		System.out.println("*** MOSTRANDO LISTA ORDENADA POR PRE�O ***");
		for (Computador computador : computadores) {
			System.out.println(computador.toString());
		}
	}

}

class ComparaFabricante implements Comparator<Computador> {

	@Override
	public int compare(Computador computador1, Computador computador2) {
		return computador1.getFabricante().compareTo(computador2.getFabricante());
	}

}

class ComparaFrequencia implements Comparator<Computador> {
	@Override
	public int compare(Computador computador1, Computador computador2) {
		return Integer.compare(computador1.getFrenquencia(), computador2.getFrenquencia());
//		return computador1.getFrenquencia() - computador2.getFrenquencia();

//		if (computador1.getFrenquencia() > computador2.getFrenquencia()) {
//			return 1;
//		} 
//		if (computador1.getFrenquencia() < computador2.getFrenquencia()) {
//			return -1;
//		} 
//		return 0;
	}

}
