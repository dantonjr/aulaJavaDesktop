package edu.senai.a16.serializacao;

public class TestaCamisa {
	public static void main(String[] args) {
		Camisa camisa = new Camisa();
		System.out.println(camisa.toString());
		camisa = new Camisa(55.90, "Amarela", 42);
		System.out.println(camisa.toString());
	}
}
