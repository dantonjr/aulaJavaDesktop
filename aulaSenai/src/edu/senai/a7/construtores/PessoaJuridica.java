package edu.senai.a7.construtores;

public class PessoaJuridica extends Pessoa {
	private int ie;
	private String CNPJ;

	public PessoaJuridica() {
		super();
		setIe(0);
		setCNPJ("00-000.000/0000-00");
	}
	
	public PessoaJuridica(int ie, String CNPJ, String nome, String endereco) {
		super(nome, endereco);
		setIe(ie);
		setCNPJ(CNPJ);
	}

	public PessoaJuridica(int ie, String CNPJ) {
		super();
//		this(ie, CNPJ, null, null);
		setIe(ie);
		setCNPJ(CNPJ);
	}

	public int getIe() {
		return ie;
	}

	public void setIe(int ie) {
		this.ie = ie;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tIE\t: " + getIe() + "\n\tCNPJ\t: " + getCNPJ();
	}
}
