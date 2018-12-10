package edu.senai.a3.precisao;

import java.math.BigDecimal;

public class TestaPrecisao {
	public static void main(String[] args) {
		double x, y, k, w, z, t, u;
		x = 4.3;
		y = 3.1;
		k = 1.2;
		w = 1.7;
		z = 10;
		t = (3 * x) + (2 * y) + (2 * k) + (5 * w);
		u = t / z;
		System.out.println(x);
		System.out.println(new BigDecimal(x).toString());
		System.out.println(y);
		System.out.println(new BigDecimal(y).toString());
		System.out.println(k);
		System.out.println(new BigDecimal(k).toString());
		System.out.println(w);
		System.out.println(new BigDecimal(w).toString());
		System.out.println(z);
		System.out.println(new BigDecimal(z).toString());
		System.out.println(t);
		System.out.println(new BigDecimal(t).toString());
		System.out.println(u);
		System.out.println(new BigDecimal(u).toString());
		u = Math.round(u);
		System.out.println(u);
		System.out.println(new BigDecimal(u).toString());
	}

}
