package edu.senai.bancodados.conexao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexao {
	private static Connection conn = null;
	
	public static Connection getConexao() throws BancoDadosException {
		try {
			String caminho = System.getProperty("user.dir") + "/config/BDarq.properties";
			FileInputStream arquivo = new FileInputStream(new File(caminho));
			Properties propriedades = new Properties();
			propriedades.load(arquivo);
			arquivo.close();
			String le = "";
			String base = (le = propriedades.getProperty("base")) != null ? le : "junior";
			String porta = (le = propriedades.getProperty("porta")) != null ? le : "3306";
			String ip = (le = propriedades.getProperty("ip")) != null ? le : "localhost";
			String usuario = (le = propriedades.getProperty("usuario")) != null ? le : "root";
			String senha = (le = propriedades.getProperty("senha")) != null ? le : "social";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + porta + "/" + base, usuario, senha);
			return conn;
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.OPEN_CONEXAO, e.getMessage());
		}
	}
	
	public static void closeConexao() throws BancoDadosException {
		try {
			if(conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.CLOSE_CONEXAO, e.getMessage());
		}
	}
}
