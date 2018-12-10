package edu.senai.a16.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaObjeto {
	public static void main(String[] args) {
		try {
			ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("c:\\lixo\\camisa.bin"));
			Camisa camisa = new Camisa(55.90, "Amarela", 42);
			Camisa outraCamisa = new Camisa(102.50, "Azul", 44);
			serializador.writeObject(camisa);
			serializador.writeObject(outraCamisa);
			camisa = new Camisa(12.30, "Verde", 25);
			serializador.writeObject(camisa);
			serializador.flush();
			serializador.close();
			System.out.println("Sucesso!!!");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
