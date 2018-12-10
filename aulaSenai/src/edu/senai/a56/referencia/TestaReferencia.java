package edu.senai.a56.referencia;

import edu.senai.a3.pessoa.Pessoa;

public class TestaReferencia {

	public static void main(String[] args) throws CloneNotSupportedException {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setAtivo(true);
		pessoa1.setEndereco("Blumenau");
		pessoa1.setNome("Maria");
		pessoa1.setSexo('F');
		pessoa1.setSalario((float) 4500.0);
		pessoa1.setIdade(30);
		System.out.println("Pessoa 1:\n" + pessoa1);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2 = pessoa1;
		pessoa2.setEndereco("Itajaí");
		pessoa2.setNome("Paula");
		
		System.out.println("Pessoa 2:\n" + pessoa2);
		System.out.println("Pessoa 1:\n" + pessoa1);
	}

}
