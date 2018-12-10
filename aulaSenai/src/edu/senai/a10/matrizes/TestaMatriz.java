package edu.senai.a10.matrizes;

import edu.senai.a7.construtores.Pessoa;

public class TestaMatriz {
	public static void main(String[] args) {
//		int[][] m2 = new int[2][3];
//		int[][] m2ini = { { 1, 2, 3 }, { 2, 3 } };

//		int[][][] m3 = new int[4][3][5];

//		int[][][] m3ini = { { { 1, 2, 3 }, { 2, 3, 4, 5, 6, 6 } }, { {}, { 1 } } };

		Pessoa[][] pessoas = new Pessoa[3][5];
		for (int i = 0; i < pessoas.length; i++) {
			for (int j = 0; j < pessoas[i].length; j++) {
				System.out.println(pessoas[i][j]);
			}
		}
	}
}
