package edu.senai.a1.calculadora;

public class UsaCalc {
	public static void main(String[] args) {
		System.out.println(Calc.soma(2));
		System.out.println(Calc.soma(2, 4, 6, 5, 9, 1));
		Calc calc = new Calc();
		System.out.println(calc.soma((float)3.89876, (float)4.9));
		System.out.println(Calc.soma(3));
	}
}
