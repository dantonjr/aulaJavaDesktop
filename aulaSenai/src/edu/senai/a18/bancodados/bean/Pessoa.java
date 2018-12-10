package edu.senai.a18.bancodados.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import edu.senai.a67.enumerador.ESexo;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	private int codigo;
	private String nome;
	private Date dataNascimento;
	private ESexo sexo;
	private double salario;
	private boolean ativo;

	public Pessoa() {
		this(0, "Sem nome", new Date(), ESexo.MASCULINO, 0, false);
	}

	public Pessoa(int codigo, String nome, Date dataNascimento, ESexo sexo, double salario, boolean ativo) {
		setCodigo(codigo);
		setNome(nome);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setSalario(salario);
		setAtivo(ativo);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ESexo getSexo() {
		return sexo;
	}

	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object pessoa) {
		if (this == pessoa)
			return true;
		if (pessoa == null)
			return false;
		if (getClass() != pessoa.getClass())
			return false;
		return (getCodigo() == ((Pessoa) pessoa).getCodigo());
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		return "Código: " + getCodigo() + "\nNome: " + getNome() +
				"\nNascimento: " + sdf.format(getDataNascimento()) +
				"\nSexo: " + getSexo().getDescricao() +
				"\nSalário: " + df.format(getSalario()) + "\nAtivo: " + (isAtivo() ? "S" : "N");
	}

	public String toString(String separador) {
		separador = separador instanceof String ? separador : "#"; 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		return getCodigo() + separador + getNome() + separador + sdf.format(getDataNascimento()) +
				separador + getSexo().getSigla() + separador + df.format(getSalario()) + separador +
				(isAtivo() ? "Sim" : "Não");
	}
}
