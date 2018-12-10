package edu.senai.a7.construtores;

import edu.senai.a67.enumerador.ESexo;

public class PessoaFisica extends Pessoa {
	private byte idade;
	private ESexo sexo;
	private String cpf;

	public PessoaFisica() {
		super();
		setIdade((byte) 0);
		setSexo(ESexo.MASCULINO);
		setCpf("000.000.000-00");
	}
	
	public PessoaFisica(byte idade, ESexo sexo, String cpf, String nome, String endereco) {
		super(nome, endereco);
		setIdade(idade);
		setSexo(sexo);
		setCpf(cpf);
	}

	public PessoaFisica(byte idade, ESexo sexo, String cpf) {
		this(idade, sexo, cpf, null, null);
//		super();
//		setIdade(idade);
//		setSexo(sexo);
//		setCpf(cpf);
	}
	
	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public ESexo getSexo() {
		return sexo;
	}

	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tIdade\t: " + getIdade() + "\n\tSexo\t: " + getSexo().getDescricao()
				+ "\n\tCPF\t: " + getCpf();
	}
}
