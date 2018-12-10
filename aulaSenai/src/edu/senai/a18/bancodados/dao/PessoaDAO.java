package edu.senai.a18.bancodados.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.senai.a18.bancodados.bean.Pessoa;
import edu.senai.a18.bancodados.conexao.Conexao;
import edu.senai.a18.bancodados.conexao.ConexaoException;
import edu.senai.a67.enumerador.ESexo;

public class PessoaDAO implements IInstalaDAO, ICRUDPadraoDAO<Pessoa> {

	@Override
	public boolean criaTabela() throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("CREATE TABLE pessoas (" + "Codigo			INT(11) NOT NULL PRIMARY KEY,"
					+ "Nome			VARCHAR(100) NOT NULL," + "DataNascimento	DATE NOT NULL,"
					+ "Sexo			INT(11) NOT NULL," + "Salario		DOUBLE NOT NULL,"
					+ "ATIVO			CHAR(1) NULL DEFAULT NULL" + ");");
			return true;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.CRIA_TABELA, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public boolean excluiTabela() throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			Statement st = conexao.createStatement();
			st.execute("DROP TABLE pessoas;");
			return true;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.EXCLUI_TABELA, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public Pessoa consulta(int codigo) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("SELECT * FROM Pessoas WHERE Codigo = ?;");
			pst.setInt(1, codigo);
			ResultSet rs = pst.executeQuery();
			return rs.first() ? new Pessoa(rs.getInt("Codigo"),
										   rs.getString("Nome"),
										   rs.getDate("DataNascimento"),
										   ESexo.values()[rs.getInt("Sexo")],
										   rs.getDouble("Salario"),
										   rs.getString("Ativo").charAt(0) == 'S')
					 		  : null;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.CONSULTA_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public Map<Integer, Pessoa> consultaTodos() throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Pessoas;");
			while(rs.next()) {
				pessoas.put(Integer.valueOf(rs.getInt("Codigo")), new Pessoa(rs.getInt("Codigo"),
														    rs.getString("Nome"),
														    rs.getDate("DataNascimento"),
														    ESexo.values()[rs.getInt("Sexo")],
														    rs.getDouble("Salario"),
														    rs.getString("Ativo").charAt(0) == 'S'));
			}
			return pessoas;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.CONSULTA_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public List<Pessoa> consultaFaixa(int ... codigos) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			PreparedStatement pst = conexao.prepareStatement("SELECT * FROM Pessoas WHERE Codigo = ?;");
			for (int codigo : codigos) {
				try {
					pst.setInt(1, codigo);
					ResultSet rs = pst.executeQuery();
					if (rs.first()) {
						pessoas.add(new Pessoa(rs.getInt("Codigo"),
										   rs.getString("Nome"),
										   rs.getDate("DataNascimento"),
										   ESexo.values()[rs.getInt("Sexo")],
										   rs.getDouble("Salario"),
										   rs.getString("Ativo").charAt(0) == 'S'));
					}
				} catch (Exception c) {
					new DAOException(EErrosDAO.CONSULTA_DADO, c.getMessage(), this.getClass());
				}
			}
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.CONSULTA_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
		return pessoas;
	}

	@Override
	public boolean insere(Pessoa objeto) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement(
					"INSERT INTO Pessoas (Codigo, Nome, DataNascimento, Sexo, Salario, Ativo) VALUES (?, ?, ?, ?, ?, ?);");
			pst.setInt(1, objeto.getCodigo());
			pst.setString(2, objeto.getNome());
			pst.setDate(3, new java.sql.Date(objeto.getDataNascimento().getTime()));
			pst.setInt(4, objeto.getSexo().ordinal());
			pst.setDouble(5, objeto.getSalario());
			pst.setString(6, objeto.isAtivo() ? "S" : "N");
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.INSERE_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public List<Pessoa> insereVarios(Map<Integer, Pessoa> objetos) throws ConexaoException, DAOException {
		return insereVarios(new ArrayList<Pessoa>(objetos.values()));
	}

	@Override
	public List<Pessoa> insereVarios(List<Pessoa> objetos) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		List<Pessoa> falhados = new ArrayList<Pessoa>();
		try {
			PreparedStatement pst = conexao.prepareStatement(
					"INSERT INTO Pessoas (Codigo, Nome, DataNascimento, Sexo, Salario, Ativo) VALUES (?, ?, ?, ?, ?, ?);");
			for (Pessoa pessoa : objetos) {
				try {
					pst.setInt(1, pessoa.getCodigo());
					pst.setString(2, pessoa.getNome());
					pst.setDate(3, new java.sql.Date(pessoa.getDataNascimento().getTime()));
					pst.setInt(4, pessoa.getSexo().ordinal());
					pst.setDouble(5, pessoa.getSalario());
					pst.setString(6, pessoa.isAtivo() ? "S" : "N");
					pst.executeUpdate();
				} catch (SQLException i) {
					new DAOException(EErrosDAO.INSERE_DADO, i.getMessage(), this.getClass());
					falhados.add(pessoa);
				}
			}
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.INSERE_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
		return falhados;
	}

	@Override
	public boolean insereVariosTransacao(List<Pessoa> objetos) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			conexao.setAutoCommit(false);
//			Savepoint sp =  conexao.setSavepoint();
			PreparedStatement pst = conexao.prepareStatement(
					"INSERT INTO Pessoas (Codigo, Nome, DataNascimento, Sexo, Salario, Ativo) VALUES (?, ?, ?, ?, ?, ?);");
			for (Pessoa pessoa : objetos) {
					pst.setInt(1, pessoa.getCodigo());
					pst.setString(2, pessoa.getNome());
					pst.setDate(3, new java.sql.Date(pessoa.getDataNascimento().getTime()));
					pst.setInt(4, pessoa.getSexo().ordinal());
					pst.setDouble(5, pessoa.getSalario());
					pst.setString(6, pessoa.isAtivo() ? "S" : "N");
					pst.executeUpdate();
			}
			conexao.commit();
			return true;
		} catch (Exception e) {
			try {
				conexao.rollback();
			} catch (Exception r) {
				throw new DAOException(EErrosDAO.ROLLBACK, e.getMessage(), this.getClass());
			}
			throw new DAOException(EErrosDAO.INSERE_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public boolean altera(Pessoa objeto) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("UPDATE Pessoas SET Nome = ?, DataNascimento = ?, Sexo = ?, Salario = ?, Ativo = ? WHERE Codigo = ?;");
			pst.setString(1, objeto.getNome());
			pst.setDate(2, new java.sql.Date(objeto.getDataNascimento().getTime()));
			pst.setInt(3, objeto.getSexo().ordinal());
			pst.setDouble(4, objeto.getSalario());
			pst.setString(5, objeto.isAtivo() ? "S" : "N");
			pst.setInt(6, objeto.getCodigo());
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.ALTERA_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public boolean exclui(int codigo) throws ConexaoException, DAOException {
		Connection conexao = Conexao.abreConexao();
		try {
			PreparedStatement pst = conexao.prepareStatement("DELETE FROM Pessoas WHERE Codigo = ?;");
			pst.setInt(1, codigo);
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			throw new DAOException(EErrosDAO.EXCLUI_DADO, e.getMessage(), this.getClass());
		} finally {
			Conexao.fechaConexao();
		}
	}

	@Override
	public boolean exclui(Pessoa objeto) throws ConexaoException, DAOException {
		return exclui(objeto.getCodigo());
	}
}
