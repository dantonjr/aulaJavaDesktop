package edu.senai.a9.interfaces;

public class UsaConta {
	public static void main(String[] args) {
		ContaLuz luz = new ContaLuz(100, (float).55);
		System.out.println(luz);
		System.out.println("Total: " + luz.calculaConta());
		
		ContaAgua agua = new ContaAgua();
		System.out.println(agua);
		System.out.println("Total: " + agua.calculaConta());
		
		ContaTelefone fone = new ContaTelefone();
		System.out.println(fone);
		System.out.println("Total: " + fone.calculaConta());
		
		TotalizadorContas carteira = new TotalizadorContas(luz, agua, fone);
//		carteira.acumulaTotal(agua);
//		carteira.acumulaTotal(luz);
//		carteira.acumulaTotal(fone);
		System.out.println(carteira.getTotal());
		ContaLuz luzSitio = new ContaLuz(1000, (float) .12);
		carteira.acumulaTotal(luzSitio);
		System.out.println(carteira.getTotal());
	}
}
