package edu.senai.a16.splits;

public class TestaSplit {
	public static void main(String[] args) {
		String frase = "Boa,noite,galera! Java,é fodástico!!!";
		String[] palavras = frase.split(",");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
