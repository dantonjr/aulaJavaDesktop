package edu.senai.a3.boxunboxing;

public class TestaBoxUnboxing {
	public static void main(String[] args) {
		int x = 10;
		Integer y = new Integer(10);
		System.out.println(x);

		x = y.intValue();

		// UNBOXING
		int a = 10;
		Integer b = new Integer(100);
		a = b;
		System.out.println(a);

		// BOXING
		Integer c = new Integer(a);
		c = a;
		System.out.println(c);
		System.out.println(b);

		int f = 10;
		int g = 2;
		String w = null;
		w = "" + (f + g);
		System.out.println(w);
		Integer.parseInt("10");
		Integer.valueOf("10");

	}
}
