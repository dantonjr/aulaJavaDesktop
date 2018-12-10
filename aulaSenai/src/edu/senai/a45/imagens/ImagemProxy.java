package edu.senai.a45.imagens;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImagemProxy {
	public static void main(String[] args) {
		// URL da imagem
		String urlString = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiEuJrDsf_cAhVGkZAKHYm-B9gQjRx6BAgBEAU&url=https%3A%2F%2Fkogut.oglobo.globo.com%2Fnoticias-da-tv%2Fnoticia%2F2009%2F10%2Fmarge-simpson-nua-na-playboy-americana-230438.html&psig=AOvVaw0aI90EICJKp8U0e5cJKf_N&ust=1534983402616719";
		// Servidor proxy
		String proxyHost = "proxy.senai.local";
		// porta do servidor proxy
		String proxyPort = "3128";

		// Objeto URL
		URL url = null;
		try {
			url = new URL(urlString);
		} catch (MalformedURLException ex) {
			System.out.println(ex.getMessage());
		}

		// Objeto HttpURLConnection
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection) url.openConnection();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		// Config Proxy
		// true para passar pelo servidor proxy
		System.setProperty("proxySet", "true");

		// IP ou nome do servidor proxy
		System.setProperty("http.proxyHost", proxyHost);

		// Porta do proxy
		System.setProperty("http.proxyPort", proxyPort);

		ImageIcon icon = new ImageIcon(connection.getURL());
		JOptionPane.showMessageDialog(null, "Olá Mundo", "Saudação", JOptionPane.PLAIN_MESSAGE, icon);
	}
}
