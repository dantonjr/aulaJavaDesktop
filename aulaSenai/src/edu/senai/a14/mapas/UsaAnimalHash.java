package edu.senai.a14.mapas;

import java.util.HashMap;
import java.util.Map;

import edu.senai.a11.listas.Animal;

public class UsaAnimalHash {
	public static void main(String[] args) {
		Map<Integer, Animal> animais = new HashMap<Integer, Animal>();
		Animal animal = new Animal("Nega", 14, "vira lata", 5.5);
		animais.put(new Integer(1), animal);
		animal = new Animal();
		animais.put(2, animal);
		animais.put(27, new Animal());
		animais.put(45, new Animal("feijão", 3, "labrador", 15));

		Animal buscaAnimal = animais.get(new Integer(1));
//		System.out.println(buscaAnimal == null ? "Não achei" : "Achei : "+ buscaAnimal.toString());
		System.out.println(buscaAnimal instanceof Animal ? "Achei : " + buscaAnimal.toString() : "Não achei");
//		if (buscaAnimal != null) {
//			System.out.println("Achei: " + buscaAnimal.toString());
//		} else {
//			System.out.println("Não achei!!!");
//		}

	}
	
}