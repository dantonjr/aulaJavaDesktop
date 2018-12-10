package edu.senai.a10.vetores;

import java.util.Arrays;
import java.util.Collections;

import edu.senai.a7.construtores.Pessoa;

public class TestaVetor {
	public static void main(String[] args) {
//		tipo [] nome = new tipo[tamanho];
//		tipo [] nome = { inicializadores, .. };
//		
//		tipo nome [] = new tipo[tamanho];
//		tipo nome [] = { inicializadores, .. };
		int[] inteiros = new int[10];
		System.out.println("Escrever vetor");
		for (int i = 0; i < inteiros.length; i++) {
			System.out.println(i + " = " + inteiros[i]);
		}

		int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17 };
		System.out.println("Escrever vetor");
		for (int i = 0; i < primos.length; i++) {
			System.out.println(i + " = " + primos[i]);
		}

		Pessoa[] pessoas = new Pessoa[10];
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa pessoa = new Pessoa();
			pessoas[i] = pessoa;
		}
		System.out.println("Escrever vetor");
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(i + " = " + pessoas[i]);
		}

		Pessoa irmao = new Pessoa("Dalton", "Rio do Sul");
		Pessoa[] familia = { new Pessoa(), new Pessoa("Danton"), new Pessoa(), null, null, new Pessoa(), irmao };
		System.out.println("Escrever vetor");
		for (Pessoa pessoa : familia) {
			System.out.println(pessoa);
		}

		Integer[] numeros = { 2, 6, 9, 27, 45, 1, 18, 32, 100 };
		System.out.println("Mostrar números");
		for (int numero : numeros) {
			System.out.println(numero);
		}

		Arrays.sort(numeros);
		System.out.println("Mostrar números ordenados");
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		Arrays.sort(numeros, Collections.reverseOrder());
		System.out.println("Mostrar números ordenados de la pra cá");
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
	}
}
