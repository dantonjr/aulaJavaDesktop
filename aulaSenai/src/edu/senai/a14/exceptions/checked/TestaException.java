package edu.senai.a14.exceptions.checked;

public class TestaException {
	public void metodoQualquer(int x) throws Exception {
		if (x == 2) throw new MinhaExceptionChecked("Essa exception é checked");
		if (x == 3) throw new Exception("Outro erro");
	}

}
