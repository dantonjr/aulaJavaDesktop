package edu.senai.a9.interfaces;

import edu.senai.a5.heranca.Moto;

public class UsaSuperCalculadoraDeTudo {
	public static void main(String[] args) {
		SuperCalculadoraDeTudo desgraca = new SuperCalculadoraDeTudo();
	
		Moto moto = new Moto();
		moto.setImpostoPadrao(1000);
		
		ContaLuz luz = new ContaLuz(500, (float) .5);
		
		desgraca.acumulaTotal(luz);
		desgraca.acumulaTotal(moto);
		System.out.println(desgraca.getValorTotal());
	}
}
