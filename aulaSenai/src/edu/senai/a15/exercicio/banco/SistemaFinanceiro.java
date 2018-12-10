package edu.senai.a15.exercicio.banco;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SistemaFinanceiro {

	public static void main(String[] args) {
		String caminho = System.getProperty("user.dir") + "/dados/bancos.bin";
		
		Map<Integer, Banco> bancos = new HashMap<Integer, Banco>();
		ObjectInputStream le = null;
		try {
			le = new ObjectInputStream(new FileInputStream(caminho));
			bancos = ((HashMap<Integer, Banco>) le.readObject());
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Operacoes operacoes = new Operacoes();
		int opcaoPrincipal = 0;
		do {
			Menus.montaMenuPrincipal();
			switch (opcaoPrincipal = UtilsLeitura.leInteiro(1, 3)) {
			case 1:
				System.out.println("*** CRIAÇÃO DE UM BANCO ***");
				try {
					operacoes.criaBanco(bancos);
				} catch (AgenciaException ae) {
					System.out.println(ae.getMessage());
				}
				break;
			case 2:
				System.out.println("*** ENTRAR NO BANCO ***");
				Banco meuBanco = null;
				try {
					meuBanco = operacoes.buscaBanco(bancos, null);
					System.out.println("Banco escolhido: " + meuBanco.getNumeroBanco() + "/" + meuBanco.getNomeBanco());
				} catch (AgenciaException ae) {
					System.out.println(ae.getMessage());
				}
				while (meuBanco instanceof Banco) {
					Menus.montaMenuBanco();
					try {
						switch (UtilsLeitura.leInteiro(0, 10)) {
						case 0:
							meuBanco = null;
							break;
						case 1:
							System.out.println("*** CRIA AGÊNCIA ***");
							System.out.println(operacoes.criarAgencia(meuBanco) ? "Sucesso" : "Erro");
							break;
						case 2:
							System.out.println("*** ABERTURA DE CONTA CORRENTE ***");
							System.out.println("Sua conta é: " + operacoes.abrirConta(meuBanco));
							break;
						case 3:
							System.out.println("*** DEPOSITAR ***");
							System.out.println(operacoes.depositar(meuBanco) ? "Sucesso" : "Erro");
							break;
						case 4:
							System.out.println("*** SACAR ***");
							System.out.println(operacoes.sacar(meuBanco) ? "Sucesso" : "Erro");
							break;
						case 5:
							System.out.println("*** VERIFICAR SALDO ***");
							System.out.println("Seu saldo é: " + operacoes.saldo(meuBanco));
							break;
						case 6:
							System.out.println("*** TRANSFERÊNCIA PARA MESMO BANCO E AGÊNCIA ***");
							System.out
									.println(operacoes.transfereMesmoBancoMesmaAgencia(meuBanco) ? "Sucesso" : "Erro");
							break;
						case 7:
							System.out.println("*** TRANSFERÊNCIA PARA MESMO BANCO E AGÊNCIAS DIFERENTES ***");
							System.out.println(
									operacoes.transfereMesmoBancoAgenciaDiferente(meuBanco) ? "Sucesso" : "Erro");
							break;
						case 8:
							System.out.println("*** TRANSFERÊNCIA ENTRE BANCOS DIFERENTES (DOC/TED) ***");
							System.out.println(
									operacoes.transfereBancosDiferentes(meuBanco, bancos) ? "Sucesso" : "Erro");
							break;
						case 9:
							System.out.println("*** EMISSÃO DE EXTRATO ***");
							System.out.println(operacoes.emiteExtrato(meuBanco));
							break;
						case 10:
							System.out.println("*** TROCA DE SENHA ***");
							System.out.println(operacoes.trocaSenha(meuBanco) ? "Sucesso" : "Erro");
							break;
						}
					} catch (AgenciaException ae) {
						System.out.println(ae.getMessage());
					}
				}
				break;
			case 3:
				System.out.println("Obrigado por usar o sistema...");
				break;
			}
		} while (opcaoPrincipal != 3);
		bancos.values().forEach(banco -> System.out.println(banco.toString()));
		ObjectOutputStream grava;
		try {
			grava = new ObjectOutputStream(new FileOutputStream(caminho));
			grava.writeObject(bancos);
			grava.flush();
			grava.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
