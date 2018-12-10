package edu.senai.a23.dp.builder.com;

public class UsaBuilderFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new FuncionarioBuild(1, "Danton Junior")
						.comContato("falecom@dantonjr.com.br")
						.moraEm("Blumenau")
						.cria();
		System.out.println(f1.toString());
	
		Funcionario f2 = new FuncionarioBuild(2, "Maria").recebendo(345.90).cria();
		System.out.println(f2.toString());
	}
}
