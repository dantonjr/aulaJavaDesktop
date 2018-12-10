package edu.senai.a14.exceptions.checked;

public class UsaException {
	public static void main(String[] args) {
		TestaException testaException = new TestaException();
		try {
			testaException.metodoQualquer(3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim");
	}
}
