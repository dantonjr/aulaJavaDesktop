package edu.senai.a18.bancodados.dao;

import edu.senai.a18.bancodados.conexao.ConexaoException;

public interface IInstalaDAO {
	public abstract boolean criaTabela() throws ConexaoException, DAOException;
	public abstract boolean excluiTabela() throws ConexaoException, DAOException;
}
