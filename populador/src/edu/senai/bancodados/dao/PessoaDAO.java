package edu.senai.bancodados.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.senai.arquivo.Arquivo;
import edu.senai.bancodados.conexao.BancoDadosException;
import edu.senai.bancodados.conexao.Conexao;
import edu.senai.bancodados.conexao.EErosBanco;
import edu.senai.bean.pessoa.Pessoa;

public class PessoaDAO {
	public boolean criaTabela() throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			Statement st = conexao.createStatement();
			return st.execute("CREATE TABLE Pessoa ("
					+ "Codigo     Integer not null primary key, "
					+ "Nome       VarChar(50) not null,"
					+ "Sexo       Char(1) not null,"
					+ "Salario    Float"
					+ ");");
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.CRIA_TABELA, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}

	public boolean excluiTabela() throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			Statement st = conexao.createStatement();
			return st.execute("DROP  TABLE Pessoa;");
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.EXCLUI_TABELA, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}

	public boolean insere(Pessoa pessoa) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("INSERT INTO Pessoa" +
					"(Codigo, Nome, Sexo, Salario) VALUES (?, ?, ?, ?)");
			pst.setInt(1, pessoa.getCodigo());
			pst.setString(2, pessoa.getNome());
			pst.setString(3, String.valueOf(pessoa.getSexo()));
			pst.setFloat(4, pessoa.getSalario());
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.INSERE_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}
	
	public boolean insereVarios(List<Pessoa> pessoas) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("INSERT INTO Pessoa" +
					"(Codigo, Nome, Sexo, Salario) VALUES (?, ?, ?, ?)");
			for (Pessoa pessoa : pessoas) {
				pst.setInt(1, pessoa.getCodigo());
				pst.setString(2, pessoa.getNome());
				pst.setString(3, String.valueOf(pessoa.getSexo()));
				pst.setFloat(4, pessoa.getSalario());
				pst.executeUpdate();
			}
			return true;
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.INSERE_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}

	public boolean insereVariosTrn(List<Pessoa> pessoas) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			conexao.setAutoCommit(false);
			PreparedStatement pst = conexao.prepareStatement("INSERT INTO Pessoa" +
					"(Codigo, Nome, Sexo, Salario) VALUES (?, ?, ?, ?)");
			for (Pessoa pessoa : pessoas) {
				pst.setInt(1, pessoa.getCodigo());
				pst.setString(2, pessoa.getNome());
				pst.setString(3, String.valueOf(pessoa.getSexo()));
				pst.setFloat(4, pessoa.getSalario());
				pst.executeUpdate();
			}
			conexao.commit();
			return true;
		} catch (Exception e) {
				try {
					conexao.rollback();
				} catch (SQLException r) {
					throw new BancoDadosException(EErosBanco.ROLLBACK, r.getMessage());
				}
				throw new BancoDadosException(EErosBanco.INSERE_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}
	
	public Pessoa consulta(int codigo) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("SELECT * FROM Pessoa " +
					"WHERE Codigo = ?;");
			pst.setInt(1, codigo);
			ResultSet rs = pst.executeQuery();
			return rs.first() ? new Pessoa(codigo,
								  rs.getString("Nome"),
								  rs.getString("Sexo").charAt(0),
								  rs.getFloat("Salario")
								 ) : null;
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.CONSULTA_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}
	
	public List<Pessoa> consultaTodos() throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Pessoa;");
			while(rs.next()) {
				pessoas.add(new Pessoa(rs.getInt("Codigo"),
						rs.getString("Nome"),
						rs.getString("Sexo").charAt(0),
						rs.getFloat("Salario")
						));
			}
			return pessoas; 
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.CONSULTA_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}

	public boolean excluiPessoa(int codigo) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("DELETE FROM " +
					"Pessoa WHERE Codigo = ?;");
			pst.setInt(1, codigo);
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.EXCLUI_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}
	
	public boolean excluiTodos() throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			conexao.setAutoCommit(false);
			PreparedStatement pst = conexao.prepareStatement("DELETE FROM Pessoa;");
			pst.executeUpdate();
			conexao.commit();
			return true;
		} catch (Exception e) {
			try {
				conexao.rollback();
			} catch (SQLException r) {
				throw new BancoDadosException(EErosBanco.ROLLBACK, r.getMessage());
			}
			throw new BancoDadosException(EErosBanco.EXCLUI_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}

	public boolean excluiVarios(List<Integer> codigos) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			conexao.setAutoCommit(false);
			for (Integer codigo : codigos) {
				PreparedStatement pst = conexao.prepareStatement("DELETE FROM Pessoa" +
						" WHERE Codigo = ?;");
				pst.setInt(1, codigo.intValue());
				pst.executeUpdate();
			}
			conexao.commit();
			return true;
		} catch (Exception e) {
			try {
				conexao.rollback();
			} catch (SQLException r) {
				throw new BancoDadosException(EErosBanco.ROLLBACK, r.getMessage());
			}
			throw new BancoDadosException(EErosBanco.EXCLUI_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}
	
	public boolean atualiza(Pessoa pessoa) throws BancoDadosException {
		Connection conexao = Conexao.getConexao();
		try {
			PreparedStatement pst = 
					conexao.prepareStatement("UPDATE Pessoa " +
							"SET Nome = ?, Sexo = ?, Salario = ? WHERE Codigo = ?;");
			pst.setString(1, pessoa.getNome());
			pst.setString(2, String.valueOf(pessoa.getSexo()));
			pst.setFloat(3, pessoa.getSalario());
			pst.setInt(4, pessoa.getCodigo());
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			throw new BancoDadosException(EErosBanco.ATUALIZA_DADO, e.getMessage());
		} finally {
			Conexao.closeConexao();
		}
	}

	public void exportaDados(String nomeArq, String separador) throws BancoDadosException {
		List<String> exporta = new ArrayList<String>();
		for (Pessoa pessoa : consultaTodos()) {
			exporta.add(pessoa.toStringBD(separador));
		} 
		Arquivo.gravaArquivo(nomeArq, exporta, false);
	}
}
