package edu.senai.a7.performance;

public class TestaPerformance {
	public static final int TOTAL = 70_000;

	public static void main(String[] args) {
//		String valor = "";
//		System.out.println("Iniciei...");
//		long tempoInicio = System.nanoTime();
//		for (int i = 0; i < TOTAL; i++) {
//			valor += "linha " + i + "\n";
//		}
//		long tempoFinal = System.nanoTime();
//		double tempo = (tempoFinal - tempoInicio) / (double) 1000000000;
//		System.out.println(valor);
//		System.out.println(tempo);

		StringBuffer valorBuff = new StringBuffer("");
		System.out.println("Iniciei...");
		long tempoInicio = System.nanoTime();
		for (int i = 0; i < TOTAL * 800; i++) {
			valorBuff.append("linha " + i + "\n");
		}
		long tempoFinal = System.nanoTime();
		double tempo = (tempoFinal - tempoInicio) / (double) 1_000_000_000;
		//System.out.println(valorBuff.toString());
		System.out.println(tempo);

//		StringBuilder valorBuild = new StringBuilder("");

	}
}
