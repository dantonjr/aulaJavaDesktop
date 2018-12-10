package edu.senai.a17.propriedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ManipulaPropriedade {
	public static void main(String[] args) throws IOException {
		String caminho = System.getProperty("user.dir") + "/dados/configuracao.properties";
		
		FileInputStream arquivoEntrada = new FileInputStream(new File(caminho));
		
		Properties propriedades = new Properties();
		propriedades.load(arquivoEntrada);
		
		arquivoEntrada.close();
		
		System.out.println(propriedades.getProperty("nomes", "boa noite"));
		
		propriedades.setProperty("idade", "41");
		FileOutputStream arquivoSaida = new FileOutputStream(caminho);
		propriedades.store(arquivoSaida, "Foi!!!");
		arquivoSaida.close();
	}
}
