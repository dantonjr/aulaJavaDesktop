package edu.senai.a6.referencia.clone;

public class UsaComputador {
	public static void main(String[] args) throws CloneNotSupportedException {
//		Computador c1 = new Computador();
//		c1.setFabricante("Dell");
//		c1.setFrequencia(3000);
//		System.out.println("C1: " + c1.toString());
//		Computador c2 = c1;
//		c2.setFabricante("Intel");
//		c2.setFrequencia(2500);
//		System.out.println("C2: " + c2.toString());
//		System.out.println("C1: " + c1.toString());
		
		Computador c1 = new Computador();
		c1.setFabricante("Dell");
		c1.setFrequencia(3000);
		System.out.println("C1: " + c1.toString());
		Computador c2 = (Computador) c1.clone();
		System.out.println("C2: " + c2.toString());
		
		
		c2.setFabricante("Intel");
		c2.setFrequencia(2500);
		System.out.println("C2: " + c2.toString());
		System.out.println("C1: " + c1.toString());

	}
}
