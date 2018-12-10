package edu.senai.a10.matrizes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrizTransposta {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Quantidade de colunas...: ");
		int totColunas = Integer.parseInt(teclado.readLine());
		System.out.print("Quantidade de linhas....: ");
		int totLinhas = Integer.parseInt(teclado.readLine());

		int[][] matriz = new int[totColunas][totLinhas];
		System.out.println("Lendo dados da matriz original...");
		for (int c = 0; c < matriz.length; c++) {
			for (int l = 0; l < matriz[c].length; l++) {
				System.out.print(c + " . " + l + " -> ");
				matriz[c][l] = Integer.parseInt(teclado.readLine());
			}
		}
		
		int[][] matrizT = new int[matriz[0].length][matriz.length];

		for (int c = 0; c < matriz.length; c++) {
			for (int l = 0; l < matriz[c].length; l++) {
				matrizT[l][c] = matriz[c][l];
			}
		}

		System.out.println("Mostrar matriz transposta...");
		for (int c = 0; c < matrizT.length; c++) {
			for (int l = 0; l < matrizT[c].length; l++) {
				System.out.println(c + " . " + l + " -> " + matrizT[c][l]);
			}
		}
	}
}