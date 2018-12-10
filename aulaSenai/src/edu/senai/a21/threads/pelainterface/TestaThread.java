package edu.senai.a21.threads.pelainterface;

public class TestaThread {
	public static void main(String[] args) {
//		ProcessamentoPelaInterface t1 = new ProcessamentoPelaInterface("T1");
//		ProcessamentoPelaInterface t2 = new ProcessamentoPelaInterface("T2");
//		t1.run();
//		t2.run();
		
		Thread t1 = new Thread(new ProcessamentoPelaInterface("T1"));
		Thread t2 = new Thread(new ProcessamentoPelaInterface("T2"));
		Thread t3 = new Thread(new ProcessamentoPelaInterface("T3"));
		Thread t4 = new Thread(new ProcessamentoPelaInterface("T4"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
