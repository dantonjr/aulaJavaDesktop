package edu.senai.a11.breakcontinue;

public class TestaBreakContinue {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
				//break;
			}
			System.out.println(i);
		}
	}
}
