package edu.senai.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	public static void gravaArquivo(String nomeArq, String conteudo, boolean fimArq) {
		try {
			PrintWriter arquivo = 
					new PrintWriter(
							new FileWriter(new File(nomeArq), fimArq), true);
			arquivo.println(conteudo);
			arquivo.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar no arquivo..");
			System.out.println(e.getMessage());
		}
	}

	public static void gravaArquivo(String nomeArq, List<String> conteudo, boolean fimArq) {
		try {
			PrintWriter arquivo = 
					new PrintWriter(
							new FileWriter(new File(nomeArq), fimArq), true);
			for (String linha : conteudo) {
				arquivo.println(linha);
			}
			arquivo.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar no arquivo..");
			System.out.println(e.getMessage());
		}
	}

	public static String leArquivo(String nomeArq, boolean todasLinhas, String separador) {
		BufferedReader arquivo = null;
		StringBuffer agrupaTodas = new StringBuffer();
		try {
			String linha = "";
			arquivo = new BufferedReader(new FileReader(new File(nomeArq)));
			if(todasLinhas) {
				while ((linha = arquivo.readLine()) != null) {
					agrupaTodas.append(linha + separador);
				}
				arquivo.close();
				return agrupaTodas.toString();
			} else {
				arquivo.close();
				return arquivo.readLine();
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo: " + nomeArq);
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static List<String> leArquivo(String nomeArq) {
		BufferedReader arquivo = null;
		List<String> linhas = new ArrayList<String>();
		try {
			String linha = "";
			arquivo = new BufferedReader(new FileReader(new File(nomeArq)));
			while ((linha = arquivo.readLine()) != null) {
				linhas.add(linha);
			}
			arquivo.close();
			return linhas;
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo: " + nomeArq);
			System.out.println(e.getMessage());
		}
		return null;
	}

}
