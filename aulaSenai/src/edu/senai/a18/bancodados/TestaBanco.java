package edu.senai.a18.bancodados;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.senai.a18.bancodados.bean.Pessoa;
import edu.senai.a18.bancodados.conexao.ConexaoException;
import edu.senai.a18.bancodados.dao.DAOException;
import edu.senai.a18.bancodados.dao.PessoaDAO;
import edu.senai.a67.enumerador.ESexo;

public class TestaBanco {
	public static void main(String[] args) {
		System.out.println("Inicio");

//		try {
//			System.out.println("Abrindo...");
//			Conexao.abreConexao();
//		} catch (ConexaoException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			System.out.println("Fechando...");
//			Conexao.fechaConexao();
//		} catch (ConexaoException e) {
//			System.out.println(e.getMessage());
//		}

//		try {
//			System.out.println(pessoaDAO.criaTabela() ? "Sucesso" : "Falha");
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			System.out.println(pessoaDAO.excluiTabela() ? "Sucesso" : "Falha");
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}

//		Pessoa pessoa = new Pessoa(12, "Danton Junior", new Date(), ESexo.MASCULINO, 950.00, true);
//		
//		try {
//			pessoaDAO.insere(pessoa);
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}

		// List<Pessoa> pessoas = new ArrayList<Pessoa>();
//		Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();
//		for (int i = 1; i < 2000; i++) {
//			pessoas.put(Integer.valueOf(i), new Pessoa(i, "Danton " + i, new Date(), ESexo.MASCULINO, i * Math.random(), (int)(Math.random() * 2) == 0));
//		}
//		List<Pessoa> erros = new ArrayList<Pessoa>();
//		try {
//			erros = pessoaDAO.insereVarios(pessoas);
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}
//		for(Pessoa p : erros) {
//			System.out.println(p.toString("#"));
//		}

//		Pessoa pessoa;
//		try {
//			pessoa = pessoaDAO.consulta(27);
//			System.out.println(pessoa instanceof Pessoa ? pessoa.toString() : "Não encontrado!!");
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}

//		try {
//			Map<Integer, Pessoa> pessoas = pessoaDAO.consultaTodos(); 
//			for(Pessoa pessoa : pessoas.values()) {
//				System.out.println(pessoa.toString("#"));
//			}
//			
//			Collection<String> exporta = new ArrayList<String>();
//			pessoas.values().forEach(pessoa -> exporta.add(pessoa.toString(";")));
//			try {
//				Arquivo.gravaArquivo(System.getProperty("user.dir") + "/dados/exportaPessoa.csv", exporta, false);
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
//			
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}
//
//		Collection<String> dados;
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		DecimalFormat df = new DecimalFormat("###,###,##0.00");
//		List<Pessoa> pessoas = new ArrayList<Pessoa>();
//		try {
//			dados = Arquivo.leArquivo(System.getProperty("user.dir") + "/dados/exportaPessoa.csv");
//			for (String dado : dados) {
//				String [] convertido = dado.split(";");
//				try {
//					pessoas.add(new Pessoa(Integer.parseInt(convertido[0]),
//										   convertido[1], 
//										   sdf.parse(convertido[2]),
//										   ESexo.values()[convertido[3].charAt(0) == 'M' ? 0 : 1],
//										   df.parse(convertido[4]).doubleValue(),
//										   convertido[5].charAt(0) == 'S'));
//				} catch (NumberFormatException | ParseException e) {
//					System.out.println(e.getMessage());
//				}
//			}
//			pessoaDAO.insereVarios(pessoas);
//		} catch (IOException | ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Fim");
		PessoaDAO pessoaDAO = new PessoaDAO();
//		List<Pessoa> pessoas = new ArrayList<Pessoa>();
//		try {
//			pessoas = pessoaDAO.consultaFaixa(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		for (Pessoa pessoa : pessoas) {
//			System.out.println(pessoa.toString(";"));
//		}
//		try {
//			Pessoa pessoa = pessoaDAO.consulta(2);
//			pessoa.setNome("Danton Cavalcanti Franco Junior");
//			System.out.println(pessoaDAO.altera(pessoa) ? "Sucesso" : "Falha");
//		} catch (ConexaoException | DAOException e) {
//			System.out.println(e.getMessage());
//		}
		Map<Integer, Pessoa> pessoasH = new HashMap<Integer, Pessoa>();
		for (int i = 1; i <= 100000; i++) {
			pessoasH.put(Integer.valueOf(i), new Pessoa(i, "Danton " + i, new Date(), ESexo.MASCULINO, i * Math.random(), (int)(Math.random() * 2) == 0));
		}
		List<Pessoa> pessoas = new ArrayList<Pessoa>(pessoasH.values());
		System.out.println("Comecei a inserir...");
		long tempoInicio = System.nanoTime();
		try {
			System.out.println(pessoaDAO.insereVariosTransacao(pessoas) ? "Sucesso" : "Falha");
		} catch (ConexaoException | DAOException e) {
			System.out.println(e.getMessage());
		}
		long tempoFim = System.nanoTime();
		double tempoCorrido = (tempoFim - tempoInicio) / (double)1000000000;
		System.out.println("Tempo: " + tempoCorrido);
	}
}
