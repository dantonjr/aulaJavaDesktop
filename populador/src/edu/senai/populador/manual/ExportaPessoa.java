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

public class ExportaPessoa {
	public static void main(String[] args) throws IOException, BancoDadosException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entre com o separador...: ");
		String separador = teclado.readLine();
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> pessoas = pessoaDAO.consultaTodos();
		List<String> pessoasExp = new ArrayList<String>();
		for(Pessoa pessoa : pessoas) {
			pessoasExp.add(pessoa.toStringBD(separador));
		}
		Arquivo.gravaArquivo(System.getProperty("user.dir") + "\\dados\\pessoa.txt", pessoasExp, false);
	}
}
