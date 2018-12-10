package edu.senai.a17.populabanco;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.senai.a15.exercicio.banco.AgenciaException;
import edu.senai.a15.exercicio.banco.Banco;
import edu.senai.a16.arquivo.Arquivo;

public class PopulaBanco {
	public static void main(String[] args) throws IOException, NumberFormatException, AgenciaException {
		List<String> bancosTxt = (List<String>) Arquivo.leArquivo(System.getProperty("user.dir") + "/material/listaDeBancos.txt");
		Map<Integer, Banco> bancos = new HashMap<Integer, Banco>();
		for (String bancoLido : bancosTxt) {
			String[] dados = bancoLido.split(";");
			bancos.put(Integer.valueOf(dados[0]), new Banco(Integer.parseInt(dados[0]), dados[1]));
		}
		ObjectOutputStream grava;
		try {
			grava = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "/dados/bancos.bin"));
			grava.writeObject(bancos);
			grava.flush();
			grava.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Dados importados com sucesso!!");
	}
}
