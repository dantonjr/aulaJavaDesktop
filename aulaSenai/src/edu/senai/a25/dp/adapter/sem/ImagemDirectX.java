package edu.senai.a25.dp.adapter.sem;

public class ImagemDirectX  {
	public String carregaArquivoDX(String nomeArq) {
		return "Aquivo DirectX: " + nomeArq + " carregado OK!";
	}
	
	public String printaImagemDX(int altura, int largura, int pX, int pY) {
		return "Imagem DirectX printada em X: " + pX + ", Y: " + pY + " - Altura: " + altura + ", Largura: " + largura;
	}
}
