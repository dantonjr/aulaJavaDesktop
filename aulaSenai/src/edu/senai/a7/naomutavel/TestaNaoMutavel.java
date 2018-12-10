package edu.senai.a7.naomutavel;

public class TestaNaoMutavel {
	public static void main(String[] args) {
		PessoaNaoMutavel pnm = new PessoaNaoMutavel(40, "Maria");
		System.out.println(pnm);
		pnm = new PessoaNaoMutavel(30, "Joana");
		System.out.println(pnm);
	}
}
