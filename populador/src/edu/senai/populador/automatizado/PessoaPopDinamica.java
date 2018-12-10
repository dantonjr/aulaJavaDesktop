package edu.senai.populador.automatizado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.senai.arquivo.Arquivo;
import edu.senai.bancodados.conexao.BancoDadosException;
import edu.senai.bancodados.dao.PessoaDAO;
import edu.senai.bean.pessoa.Pessoa;

public class PessoaPopDinamica {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		// Criar apontador para arquivo de propriedades
		String caminho = System.getProperty("user.dir") + "/config/populador.properties";
		FileInputStream arquivo = new FileInputStream(new File(caminho));
		Properties propriedades = new Properties();
		propriedades.load(arquivo);
		arquivo.close();
		// Ler e armazenar as propriedades
		caminho = propriedades.getProperty("origemArquivos");
		String arqMas = propriedades.getProperty("nomeMas");
		String arqFem = propriedades.getProperty("nomeFem");
		String arqSobrenome = propriedades.getProperty("sobrenome");
		String arqSobrenome2 = propriedades.getProperty("sobrenome2");
		// Mostrar propriedades lidas
		System.out.println("Populando com as seguintes configurações:");
		System.out.println("\tCaminho dos populadores......: " + caminho);
		System.out.println("\tArquivo de nomes masculinos..: " + arqMas);
		System.out.println("\tArquivo de nomes femininos...: " + arqFem);
		System.out.println("\tArquivo de sobrenomes........: " + arqSobrenome);
		System.out.println("\tArquivo de 2o sobrenome......: " + arqSobrenome2);
		// Leitura dos arquivos e criação dos vetores
		String [] nomesMas = Arquivo.leArquivo(caminho + "/" + arqMas, true, "#").split("#");
		String [] nomesFem = Arquivo.leArquivo(caminho + "/" + arqFem, true, "#").split("#");
		String [] sobrenomes = Arquivo.leArquivo(caminho + "/" + arqSobrenome, true, "#").split("#");
		String [] sobrenomes2 = Arquivo.leArquivo(caminho + "/" + arqSobrenome2, true, "#").split("#");
		System.out.print("Informe código inicial.........: ");
		int codIni = Integer.parseInt(teclado.readLine());
		System.out.print("Informe código final...........: ");
		int codFim = Integer.parseInt(teclado.readLine());
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (int i = codIni; i < codFim; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setCodigo(i);
			String segundoNome = (int) (Math.random() * 2) == 0  ? " " + sobrenomes2[(int) (Math.random() * sobrenomes2.length)] : "";
			String sobrenome = " " + sobrenomes[(int) (Math.random() * sobrenomes.length)] + segundoNome;
			if((int) (Math.random() * 2) == 0) {
				pessoa.setSexo('M');
				pessoa.setNome(nomesMas[(int) (Math.random() * nomesMas.length)] + sobrenome);
			} else {
				pessoa.setSexo('F');
				pessoa.setNome(nomesFem[(int) (Math.random() * nomesFem.length)] + sobrenome);
			}
			pessoa.setSalario((float)(Math.random() * 5000));
			pessoas.add(pessoa);
		}
		PessoaDAO pessoaDAO = new PessoaDAO();
		try {
			pessoaDAO.criaTabela();
		} catch (BancoDadosException e) {
			System.out.println(e.getMessage());
		}
		try {
			pessoaDAO.insereVariosTrn(pessoas);
		} catch (BancoDadosException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Terminado");
	}
}
