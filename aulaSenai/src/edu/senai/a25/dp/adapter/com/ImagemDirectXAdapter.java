package edu.senai.a25.dp.adapter.com;

import edu.senai.a25.dp.adapter.sem.ImagemDirectX;

public class ImagemDirectXAdapter extends ImagemDirectX implements IPadraoImagem {

	@Override
	public String leArquivo(String nomeArquivo) {
		return carregaArquivoDX(nomeArquivo);
	}

	@Override
	public String desenhaImagem(int x, int y, int x2, int y2) {
		return printaImagemDX(x2, y2, x, y);
	}

}
