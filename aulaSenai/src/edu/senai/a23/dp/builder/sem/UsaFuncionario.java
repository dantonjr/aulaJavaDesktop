package edu.senai.a23.dp.builder.sem;

public class UsaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario(1, "Danton Junior");
		Funcionario f3 = new Funcionario(2, "Danton Junior", "falecom@dantonjr.com.br");
		Funcionario f4 = new Funcionario(3, "Danton", "falecom@dantonjr.com.br", "Blumenau");
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		
	}
}
