package edu.senai.a16.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializaVariosObjetos {
	public static void main(String[] args) {
		try {
			ObjectInputStream desserializador = new ObjectInputStream(new FileInputStream("c:\\lixo\\camisa.bin"));
			try {
				while (true) {
					Camisa camisa = (Camisa) desserializador.readObject();
					System.out.println(camisa.toString());
				}
			} catch (Exception e) {
				System.out.println("Letura com sucesso!!!");
			}
			desserializador.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
