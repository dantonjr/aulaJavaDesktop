package edu.senai.a2.classeswrapper;

public class TestaWrapper {
	public static void main(String[] args) {
		int a = 105928;
		int b = 3;
		int resposta = a / b;
		System.out.println(resposta);
		double x = 10;
		double y = 3;
		double resp = x / y;
		System.out.println(resp);

		resposta = (int) (a / y);
		System.out.println(resposta);

		resp = a / (double) b;
		System.out.println(resp);

		System.out.println(Integer.toOctalString(a).charAt(0));
		System.out.println(Integer.toHexString(a).toUpperCase());
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.parseUnsignedInt("AAABAC", 16));
		int z = Integer.MAX_VALUE;
		int m = Byte.MIN_VALUE;
		
		System.out.println(z);
		System.out.println(m);

	}
}
