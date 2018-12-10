package edu.senai.populador.manual;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import edu.senai.arquivo.Arquivo;
import edu.senai.bancodados.conexao.BancoDadosException;
import edu.senai.bancodados.dao.PessoaDAO;
import edu.senai.bean.pessoa.Pessoa;

public class ImportaPessoa {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		List<String> dados = Arquivo.leArquivo(System.getProperty("user.dir") + "\\dados\\pessoa.txt");
		System.out.print("Entre com o separador...: ");
		String separador = teclado.readLine();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		for(String linha : dados) {
			String [] valores = linha.split(separador);
			Pessoa pessoa = new Pessoa(Integer.parseInt(valores[0]), valores[1], valores[2].charAt(0), Float.parseFloat(valores[3]));
			pessoas.add(pessoa);
		}
		PessoaDAO pessoaDAO = new PessoaDAO();
		try {
			pessoaDAO.insereVariosTrn(pessoas);
		} catch (BancoDadosException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Encerrado");
	}
}
