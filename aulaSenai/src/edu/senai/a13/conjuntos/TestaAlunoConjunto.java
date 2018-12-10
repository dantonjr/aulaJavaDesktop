package edu.senai.a13.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunoConjunto {
	public static void main(String[] args) {
//		Set<Aluno> alunos = new TreeSet<Aluno>(); // Conjunto com os objetos ordenados pelo Comparable da classe
//		Set<Aluno> alunos = new LinkedHashSet<Aluno>(); // Conjunto guardando a ordem de inserção
		Set<Aluno> alunos = new HashSet<Aluno>(); // Conjunto puro, sem ordem de inserção nem ordenação
		Aluno aluno1 = new Aluno(1, "Danton Junior", 9, 8, 10);
		Aluno aluno2 = new Aluno(4, "Maria Paula", 5, 6, 5.5);
		Aluno aluno3 = new Aluno(10, "Suelen Schmidt", 7, 8, 8);
		Aluno aluno4 = new Aluno(8, "Zuleide da Silva", 9, 9, 10);
		Aluno aluno5 = new Aluno(17, "Andrea Gomes", 5, 9, 7);

		// Set Não permite objetos duplicados
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);
		alunos.add(aluno2);

		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		// Quando usamos Set devemos mudar o método equals e hashCode do objeto
		Aluno alunoBusca = new Aluno(4, "Maria Paula", 0, 0, 0);
		for (Aluno aluno : alunos) {
			if (aluno.equals(alunoBusca)) {
				System.out.println("achei");
				break;
			}
		}
		
		System.out.println(alunos.contains(alunoBusca));
		System.out.println("Fim");
	}
}
