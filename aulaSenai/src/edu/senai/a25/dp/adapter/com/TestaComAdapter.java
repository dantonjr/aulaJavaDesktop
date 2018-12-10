package edu.senai.a25.dp.adapter.com;

public class TestaComAdapter {
	public static void main(String[] args) {
		IPadraoImagem imagem = new ImagemOpenGLAdapater();
		System.out.println(imagem.desenhaImagem(10, 100, 40, 340));
		
		imagem = new ImagemDirectXAdapter();
		System.out.println(imagem.desenhaImagem(100, 200, 50, 76));
	}
}
