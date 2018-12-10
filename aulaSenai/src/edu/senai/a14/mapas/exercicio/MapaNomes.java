package edu.senai.a14.mapas.exercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapaNomes {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> nomes = new HashMap<String, String>();
		System.out.print("Entre com nome...: ");
		String nome = teclado.readLine();
		while (!nome.equalsIgnoreCase("fim")) {
			nomes.put(nome, nome);
			System.out.print("Entre com nome...: ");
			nome = teclado.readLine();
		}
		System.out.println("*** LAÇO DE PESQUISA ***");
		System.out.print("Entre com nome...: ");
		nome = teclado.readLine();
		while (!nome.equalsIgnoreCase("fim")) {
			System.out.println(nomes.get(nome) instanceof String ? nome : "não encontrado");
			System.out.print("Entre com nome...: ");
			nome = teclado.readLine();
//			String busca = nomes.get(nome);
//			System.out.println(busca instanceof String ? busca : "não encontrado");
		}
		System.out.println("*** MOSTRANDO LISTA ***");
		for (String name : nomes.values()) {
			System.out.println(name);
		}

		TreeMap<String, String> ordenados = new TreeMap<String, String>(nomes);
		System.out.println("*** MOSTRANDO LISTA ORDENADA ***");
		for (String name : ordenados.values()) {
			System.out.println(name);
		}
		
		System.out.println("*** ENTRADAS ***");
		Set<Entry<String, String>> entradas = nomes.entrySet();
		for (Entry<String, String> entrada : entradas) {
			System.out.println(entrada.getValue());
		}

	}
}
