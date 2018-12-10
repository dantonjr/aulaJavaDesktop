package edu.senai.a67.enumerador;

import javax.swing.JOptionPane;

public class UsaPessoaEnum {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setSexo(ESexo.FEMININO);
		System.out.println(pessoa.toString());
		System.out.println(pessoa.getSexo().getDescricao());
		System.out.println(pessoa.getSexo().getAbreviatura());
		
		JOptionPane.showMessageDialog(null,
									  pessoa.toString(),
									  "Dados da pessoa",
									  JOptionPane.INFORMATION_MESSAGE, 
									  pessoa.getSexo().getImagem());
	}
}
