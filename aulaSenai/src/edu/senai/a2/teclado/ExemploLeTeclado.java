package edu.senai.a2.teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExemploLeTeclado {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Qual seu nome? ");
		String nome = teclado.readLine();
		System.out.println("Boa noite " + nome);
	}
}
