package edu.senai.a16.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializaObjeto {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		try {
			ObjectInputStream desserializador = new ObjectInputStream(new FileInputStream("c:\\lixo\\camisa.bin"));
			Camisa camisa = (Camisa) desserializador.readObject();
			Camisa novaCamisa = (Camisa) desserializador.readObject();
			Camisa outra = (Camisa) desserializador.readObject();
			desserializador.close();
			System.out.println(camisa.toString());
			System.out.println(novaCamisa.toString());
			System.out.println(outra.toString());
//		} catch (IOException | ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
