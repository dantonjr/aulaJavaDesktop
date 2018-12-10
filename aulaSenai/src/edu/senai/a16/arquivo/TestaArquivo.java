package edu.senai.a16.arquivo;

import java.io.IOException;

public class TestaArquivo {
	public static void main(String[] args) throws IOException {
//		List<String> palavras = new ArrayList<String>();
//		palavras.add("Oi");
//		palavras.add("Galera");
//		palavras.add("Java é vida");
//		palavras.add("Coisa linda");
//		palavras.add("Sensacional");
//		palavras.add("Boa noite");
//		
//		Arquivo.gravaArquivo("c:/lixo/dados.txt", palavras, false);
//		Arquivo.gravaArquivo("c:/lixo/dados.txt", "Java MF", true);
//		for (String dado : Arquivo.leArquivo("c:/lixo/dados.txt")) {
//			System.out.println(dado);
//		}
//		String valores = Arquivo.leArquivo("c:/lixo/dados.txt", true, "#");
//		System.out.println(valores);
//		System.out.println("linha a  linha");
		for (String elemento : Arquivo.leArquivo("c:/lixo/dados.txt", true, "#").split("#")) {
			System.out.println(elemento);
		}
		
	}
}
