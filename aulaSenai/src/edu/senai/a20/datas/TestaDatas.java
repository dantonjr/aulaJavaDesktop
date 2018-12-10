package edu.senai.a20.datas;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import edu.senai.a18.bancodados.bean.Pessoa;
import edu.senai.a18.bancodados.conexao.ConexaoException;
import edu.senai.a18.bancodados.dao.DAOException;
import edu.senai.a18.bancodados.dao.PessoaDAO;
import edu.senai.a67.enumerador.ESexo;

public class TestaDatas {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		System.out.println(sdf.format(data));
		Instant inicio = Instant.now(); 
		Calendar calendario = Calendar.getInstance();
		System.out.println(sdf.format(calendario.getTime()));
		
		Calendar meuCalendario = new GregorianCalendar(1977, Calendar.FEBRUARY, 27);
		System.out.println(sdf.format(meuCalendario.getTime()));
		
		Instant fim = Instant.now();
		LocalDate local = LocalDate.now();
		System.out.println(local);
		
		
		Duration duracao = Duration.between(inicio, fim);
		System.out.println(duracao.toMillis());
		Pessoa pessoa = new Pessoa(1, "Danton Cavalcanti Franco Junior", meuCalendario.getTime(), ESexo.MASCULINO, 569.89, true);
		PessoaDAO  pessoaDAO = new PessoaDAO();
		try {
			pessoaDAO.insere(pessoa);
		} catch (ConexaoException | DAOException e) {
			System.out.println(e.getMessage());
		}
	}
}
