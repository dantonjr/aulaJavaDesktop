package edu.senai.a3.pessoa;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Danton Junior");
		pessoa.setAtivo(true);
		pessoa.setEndereco("Blumenau");
		pessoa.setIdade(41);
		pessoa.setSalario((float) 980.00);
		pessoa.setSexo('m');

		System.out.println("*** DADOS DA PESSOA ***");
		System.out.println("Nome:\t\t" + pessoa.getNome());

		// MACHO MF
		System.out.println("Ativo:\t\t" + (pessoa.isAtivo() ? "Sim" : "Não"));
		
// PARA BOIOLAS
//		if (pessoa.isAtivo()) {
//			System.out.println("Ativo:\t\t" + "Sim");
//		} else {
//			System.out.println("Ativo:\t\t" + "Não");
//		}

		System.out.println("Endereço:\t" + pessoa.getEndereco());
		System.out.println("Idade:\t\t" + pessoa.getIdade());
		System.out.println("Salário:\t" + pessoa.getSalario());
		System.out.println("Sexo:\t\t" + (pessoa.getSexo() == 'M' ? "Masculino" : "Feminino"));
	}
}
