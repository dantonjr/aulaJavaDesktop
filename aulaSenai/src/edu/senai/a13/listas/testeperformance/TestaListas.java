package edu.senai.a13.listas.testeperformance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import edu.senai.a8.abstracao.Quadrado;

public class TestaListas {
	private static final int TOTAL = 3_000_000;

	public static void main(String[] args) {

		System.out.println("*** ArrayList vs LinkedList vs Vector ***");

		List<Quadrado> quadradosArrayList = new ArrayList<Quadrado>();
		List<Quadrado> quadradosLinkedList = new LinkedList<Quadrado>();
		List<Quadrado> quadradosVector = new Vector<Quadrado>();

		double tempoArrayList = insereElementos(quadradosArrayList, TOTAL);
		double tempoLinkedList = insereElementos(quadradosLinkedList, TOTAL);
		double tempoVector = insereElementos(quadradosVector, TOTAL);

		System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
		System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
		System.out.println("Inserção no Vector demorou " + tempoVector);

		tempoArrayList = removePrimeirosElementos(quadradosArrayList);
		tempoLinkedList = removePrimeirosElementos(quadradosLinkedList);
		tempoVector = removePrimeirosElementos(quadradosVector);

		System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
		System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
		System.out.println("Remoção do Vector demorou " + tempoVector);
	}

	private static double removePrimeirosElementos(List<Quadrado> quadrados) {
		long tempoInicial = System.nanoTime();
		for (int i = 0; i < 30000; i++) {
			quadrados.remove(0); // removendo sempre o primeiro elemento
		}
		long tempoFinal = System.nanoTime();
		return (tempoFinal - tempoInicial) / (double) 1000000000;
	}

	private static double insereElementos(List<Quadrado> quadrados, int quantidade) {
		long tempoInicial = System.nanoTime();
		for (int i = 0; i < quantidade; i++) {
			quadrados.add(new Quadrado());
		}
		long tempoFinal = System.nanoTime();
		return (tempoFinal - tempoInicial) / (double) 1000000000;
	}
}
