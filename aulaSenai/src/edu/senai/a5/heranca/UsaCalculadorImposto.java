package edu.senai.a5.heranca;

public class UsaCalculadorImposto {
	public static void main(String[] args) {
		CalculaImpostoVeiculos impostometro = new CalculaImpostoVeiculos();
		
		Pesado caminhaoTanque = new Pesado();
		impostometro.registraImposto(caminhaoTanque);
		System.out.println(impostometro.getTotal());
		
		Pesado cegonha = new Pesado();
		cegonha.setImpostoPadrao(2000);
		System.out.println(cegonha.getImpostoPadrao());
		
		impostometro.registraImposto(cegonha);
		System.out.println(impostometro.getTotal());
		
		Leve ferrari = new Leve();
		ferrari.setImpostoPadrao(30000);
		System.out.println(ferrari.getImpostoPadrao());
		
		impostometro.registraImposto(ferrari);
		System.out.println(impostometro.getTotal());
		
		Leve laborgini = new Leve();
		laborgini.setImpostoPadrao(55000);
		impostometro.registraImposto(laborgini);
		
		Moto hayaBusa = new Moto();
		hayaBusa.setImpostoPadrao(5500);
		
		impostometro.registraImposto(hayaBusa);
		
		System.out.println(impostometro.getTotal());
	}
	
}
