package edu.senai.a25.dp.adapter.sem;

public class TestaSemAdapter {
	public static void main(String[] args) {
		Object imagem = new ImagemOpenGL();
		if (imagem instanceof ImagemOpenGL) {
			System.out.println(((ImagemOpenGL) imagem).desenhaImagemOGL(100, 200));
		} else {
			System.out.println(((ImagemDirectX) imagem).printaImagemDX(200, 30, 50, 10));
		}
		imagem = new ImagemDirectX();
		if (imagem instanceof ImagemOpenGL) {
			System.out.println(((ImagemOpenGL) imagem).desenhaImagemOGL(100, 200));
		} else {
			System.out.println(((ImagemDirectX) imagem).printaImagemDX(200, 30, 50, 10));
		}
	}
}
