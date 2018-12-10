package edu.senai.a25.dp.adapter.sem;

public class ImagemOpenGL  {
	public String carregaArquivoOGL(String nomeArquivo) {
		return "Aquivo Open GL: " + nomeArquivo + " carregado com sucesso!";
	}
	
	public String desenhaImagemOGL(int posicaoX, int posicaoY) {
		return "Imagem Open GL desenhada nas coordenadas X: " + posicaoX + ", Y: " + posicaoY;
	}
}
