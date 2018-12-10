package edu.senai.a14.exceptions.unchecked;

public class UsaException {
	public static void main(String[] args) {
		System.out.println("Inicio");
		TestaException testaException = new TestaException();
		try {
			testaException.metodoQualquer(1);
		} catch (MinhaExceptionUnchecked | IllegalAccessError e) {
			System.out.println("Deu pau " + e.getMessage());
		}
		System.out.println("Fim");
	}
}
