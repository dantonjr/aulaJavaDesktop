package edu.senai.a7.construtores;

import edu.senai.a67.enumerador.ESexo;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();//("Danton Junior", "Blumenau");
		System.out.println(pessoa.toString());
		System.out.println(pessoa.getNome().toUpperCase());
		pessoa = new Pessoa("Blumenau", Pessoa.ATRIBUTO_ENDERECO);
		System.out.println(pessoa.toString());
		
		PessoaFisica pf = new PessoaFisica();
		System.out.println(pf);
		System.out.println("\n***\n");
		
		pf = new PessoaFisica((byte) 40, ESexo.MASCULINO, "123.456.789-10");
		System.out.println(pf);
		System.out.println("\n***\n");

		pf = new PessoaFisica((byte) 30, ESexo.FEMININO, "789.456.123-10", "Camila", "Itajaí");
		System.out.println(pf);
		System.out.println("\n***\n");

	}
}
