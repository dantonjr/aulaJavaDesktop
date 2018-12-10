package edu.senai.a5.heranca;

public class UsaVeiculo {
	public static void main(String[] args) {
//		Veiculo veiculo = new Veiculo();
		Pesado pesado = new Pesado();
		Leve leve = new Leve();
		Moto moto = new Moto();
		
//		moto.setImpostoPadrao(200);
		System.out.println(moto.getImpostoPadrao());
		System.out.println(pesado.getImpostoPadrao());
		System.out.println(leve.getImpostoPadrao());
		
		
//		Veiculo caminhao = new Pesado();
//		((Pesado)caminhao).setQtdEixos((byte)12);
//		
//		Veiculo corrida = new Pesado();
		
//		((Leve)corrida).setCombustivel("Gasolina");
//		
//		if (corrida instanceof Leve) {
//			System.out.println("é Leve");
//			((Leve)corrida).setCombustivel("Gasolina");
//		} else if (corrida instanceof Pesado) {
//			System.out.println("É pesado");
//			((Pesado)corrida).setQtdEixos((byte) 12);
//		}
	}
}
