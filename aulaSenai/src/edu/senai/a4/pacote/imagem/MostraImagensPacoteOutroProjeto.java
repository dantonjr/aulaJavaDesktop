package edu.senai.a4.pacote.imagem;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MostraImagensPacoteOutroProjeto {
	public static void main(String[] args) {
		ImageIcon imgHomer = new ImageIcon(ClassLoader.getSystemResource("edu/senai/imagens/simpsons/Homer_Simpson.png"));
		JOptionPane.showMessageDialog(null, "Olha o Homer", "Simpsons", JOptionPane.INFORMATION_MESSAGE, imgHomer);
		ImageIcon imgBolaNeve = new ImageIcon(ClassLoader.getSystemResource("edu/senai/imagens/simpsons/Bola_de_Neve.png"));
		JOptionPane.showMessageDialog(null, "Olha o Bola de Neve", "Simpsons", JOptionPane.INFORMATION_MESSAGE, imgBolaNeve);
		ImageIcon imgAjudantePapaiNoel = new ImageIcon(ClassLoader.getSystemResource("edu/senai/imagens/simpsons/Ajudante_de_Papai_Noel.png"));
		JOptionPane.showMessageDialog(null, "Olha o Ajudante de Papai Noel", "Simpsons", JOptionPane.INFORMATION_MESSAGE, imgAjudantePapaiNoel);
		
		
		
	}
}
