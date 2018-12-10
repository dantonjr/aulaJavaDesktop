package edu.senai.a45.janelas;

import java.awt.Dimension;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestaJanela {
	public static void main(String[] args) throws MalformedURLException {
//		JOptionPane.showMessageDialog(null, "Boa noite!");
//		JOptionPane.showMessageDialog(null, "Porra, Java é vida!!!", "Preste atenção", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Porra, Java é vida!!!", "Preste atenção", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Porra, Java é vida!!!", "Preste atenção", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Porra, Java é vida!!!", "Preste atenção", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Porra, Java é vida!!!", "Preste atenção", JOptionPane.PLAIN_MESSAGE);

//		String caminho = System.getProperty("user.dir");
//		System.out.println(caminho);
//		caminho += "\\imagens\\Bart_Simpson.png";
//		
//		ImageIcon iconeArq = new ImageIcon(caminho);
//		JOptionPane.showMessageDialog(null, "Boa noite!", "Saudação", JOptionPane.INFORMATION_MESSAGE, iconeArq);
//		
//		ImageIcon iconeRes = new ImageIcon(ClassLoader.getSystemResource("edu/senai/imagens/lisa.jpg"));
//		JOptionPane.showMessageDialog(null, "Olha a Lisa", "Do Recurso", JOptionPane.INFORMATION_MESSAGE, iconeRes);
//		
//		ImageIcon iconeWeb = new ImageIcon(new URL("http://s2.glbimg.com/uAUzzHYROdOCmCy5hyb4B6769wqNoH8ynqKpo3E9EdovMx1OvT7-KrdO9FbDdzQ_/i.glbimg.com/og/ig/f/original/2012/11/29/13835-marge-simpson.jpg"));
//		JOptionPane.showMessageDialog(null, "Funciona?", "Da WEB", JOptionPane.INFORMATION_MESSAGE, iconeWeb);

		// int resposta = JOptionPane.showConfirmDialog(null, "Boa noite");
//		int resposta = JOptionPane.showConfirmDialog(null, "Tudo certo", "Responda", JOptionPane.YES_NO_OPTION);
//		System.out.println(resposta);
//		if (resposta == JOptionPane.YES_OPTION) {
//			System.out.println("Que legal!!!!");
//		}

//		String valor = JOptionPane.showInputDialog(null, "Oi");
//		System.out.println(valor);
//		String nome = JOptionPane.showInputDialog(null, "Qual seu nome?", "Digite aqui o seu nome");
//		System.out.println(nome);
//
//		JOptionPane.showInputDialog(null, "Ta tudo certo?", null, JOptionPane.INFORMATION_MESSAGE);

//		char sexo = (Character)JOptionPane.showInputDialog(null,
//									"Qual seu sexo?",
//									"Sexo",
//									JOptionPane.QUESTION_MESSAGE,
//									null,
//									new Character[] { 'M', 'F' },
//									'M');
//		
//		System.out.println(sexo);

		String lista = "";
		for (int i = 0; i < 100; i++) {
			lista += "Elemento: " + i + "\n";
		}

		JTextArea area = new JTextArea(lista);
		JScrollPane scroll = new JScrollPane(area);
		scroll.setPreferredSize(new Dimension(400, 300));
		JOptionPane.showMessageDialog(null, scroll);

		
	}
}
