package edu.senai.a25.dp.adapter.com;

import edu.senai.a25.dp.adapter.sem.ImagemOpenGL;

public class ImagemOpenGLAdapater extends ImagemOpenGL implements IPadraoImagem {

	@Override
	public String leArquivo(String nomeArquivo) {
		return carregaArquivoOGL(nomeArquivo);
	}

	@Override
	public String desenhaImagem(int x, int y, int x2, int y2) {
		return desenhaImagemOGL(x, y);
	}

}
