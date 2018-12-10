package edu.senai.a21.threads.pelaclasse;

public class ProcessamentoPelaClasse extends Thread {
	private String nome;

	public ProcessamentoPelaClasse(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Iniciando Thread: " + this.nome);
		for (int i = 0; i < 20; i++) {
			System.out.println(this.nome + ": " + i);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thread: " + this.nome + " encerrada.");
	}

}
