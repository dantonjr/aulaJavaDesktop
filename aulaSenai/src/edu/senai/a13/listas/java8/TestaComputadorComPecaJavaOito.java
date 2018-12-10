package edu.senai.a13.listas.java8;

import java.util.ArrayList;
import java.util.List;

public class TestaComputadorComPecaJavaOito {
	public static void main(String[] args) {
		ComputadorComPeca computador = new ComputadorComPeca(3500, "Dell", 5.890);
//		List<Peca> pecas = computador.getPecas();
//		pecas.add(new Peca(1, "Processador"));
//		pecas.add(new Peca(2, "Memória DDR4"));
//		computador.getPecas().add(new Peca(3, "SSD 2TB"));

		computador.adiciona(new Peca(1, "Processador"));
		computador.adiciona(new Peca(2, "Memória DDR4"));
		computador.adiciona(new Peca(3, "SSD 2TB"));
		computador.adiciona(new Peca(4, "NVIDIA GTPokemon 1080XPTO Exteme MF"));
		
		for (Peca peca : computador.getPecas()) {
			System.out.println(peca);
		}
		System.out.println("*** MINHA LISTA ***");
		List<Peca> minhasPecas = new ArrayList<Peca>(computador.getPecas());
		minhasPecas.remove(2);
		minhasPecas.forEach(peca -> System.out.println(peca.toString()));
		System.out.println(minhasPecas.stream().mapToInt(Peca::getCodigo).count());
	}
}
