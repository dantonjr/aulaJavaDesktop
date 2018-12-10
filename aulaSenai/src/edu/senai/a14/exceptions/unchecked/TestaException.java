package edu.senai.a14.exceptions.unchecked;

public class TestaException {
	public void metodoQualquer(int x) {
		if (x == 2) throw new IllegalAccessError("Outro erro");
		if (x == 3) throw new MinhaExceptionUnchecked("Essa exception é unchecked");
		
	}
}
