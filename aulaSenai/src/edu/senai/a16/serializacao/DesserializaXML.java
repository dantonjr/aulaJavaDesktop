package edu.senai.a16.serializacao;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DesserializaXML {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
//			try {
				XMLDecoder desserializador = new XMLDecoder(new BufferedInputStream(new FileInputStream("c:\\lixo\\camisa.xml")));
				Camisa camisa = (Camisa) desserializador.readObject();
				Camisa novaCamisa = (Camisa) desserializador.readObject();
//				Camisa outra = (Camisa) desserializador.readObject();
				desserializador.close();
				System.out.println(camisa.toString());
				System.out.println(novaCamisa.toString());
//				System.out.println(outra.toString());
//			} catch (IOException | ClassNotFoundException e) {
//				System.out.println(e.getMessage());
//			}
	}
}
