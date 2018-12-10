package edu.senai.a21.threads.pelaclasse;

public class TestaThread {
	public static void main(String[] args) {
		ProcessamentoPelaClasse t1 = new ProcessamentoPelaClasse("T1");
		ProcessamentoPelaClasse t2 = new ProcessamentoPelaClasse("T2");
		t1.start();
		t2.start();
	}
}
