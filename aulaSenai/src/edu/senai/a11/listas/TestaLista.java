package edu.senai.a11.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// https://szakuljarzuk.wordpress.com/2015/07/28/java-collections-set-list-map-queue-stack-deque/
public class TestaLista {
	public static void main(String[] args) {
//		ArrayList<TipoObjeto> nomeLista = new ArrayList<TipoObjeto>();
//		List<TipoObjeto> nomeLista = new ArrayList<TipoObjeto>();
//		List<Animal> animais = new ArrayList<Animal>();
//		animais.add(new Animal());
//		animais.add(new Animal("nega", 14, "vira lata", 5.3));
//		Animal animal = new Animal();
//		animais.add(animal);
//		
//		for (int i = 0; i < animais.size(); i++) {
//			System.out.println(animais.get(i).toString());
//		}

		List<Animal> animais = new ArrayList<Animal>();
		for (int i = 0; i < 100; i++) {
			animais.add(new Animal("nega " + i, i, "vira lata", i * i));
		}

//		System.out.println("Mostrar pitoco");
//		for (int i = 0; i < animais.size(); i++) {
//			System.out.println(animais.get(i).toString());
//		}

//		System.out.println("Boa");
//		for (Animal animal : animais) {
//			System.out.println(animal.toString());
//		}

		System.out.println("Macho Extreme Super Edition MF");
		for (Iterator<Animal> iAnimal = animais.iterator(); iAnimal.hasNext();) {
			Animal animal = (Animal) iAnimal.next();
			System.out.println(animal);
		}
	}

}
