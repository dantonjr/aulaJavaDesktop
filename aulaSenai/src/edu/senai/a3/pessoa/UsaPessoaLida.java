package edu.senai.a3.pessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsaPessoaLida {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Pessoa pessoa = new Pessoa();
		System.out.println("*** ENTRADA DE DADOS DA PESSOA ***");
		System.out.print("Informe nome.........: ");
		pessoa.setNome(teclado.readLine());
		System.out.print("Informe endere�o.....: ");
		pessoa.setEndereco(teclado.readLine());
		System.out.print("Informe idade........: ");
		pessoa.setIdade(Integer.parseInt(teclado.readLine()));
		System.out.print("Informe sal�rio......: ");
		pessoa.setSalario(Float.parseFloat(teclado.readLine()));
		System.out.print("Informe sexo.........: ");
		pessoa.setSexo(teclado.readLine().charAt(0)); // Assumindo valida��o na classe pessoa (m�todo setSexo)
		//pessoa.setSexo(Character.toUpperCase(teclado.readLine().charAt(0)) == 'M' ? 'M' : 'F'); // Compara s� 1
		//pessoa.setSexo(teclado.readLine().toUpperCase().charAt(0) == 'M' ? 'M' : 'F'); // faz tudo
		System.out.print("Est� ativo? .........: ");
		pessoa.setAtivo(Character.toUpperCase(teclado.readLine().charAt(0)) == 'S');
		
		
		System.out.println("*** SA�DA DE DADOS DA PESSOA ***");
		System.out.println(pessoa.toString());
		System.out.println(pessoa);
		
	}
}