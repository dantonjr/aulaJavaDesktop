package edu.senai.a15.exercicio.banco;

import java.util.Map;

public class Regras {
	public static ContaCorrente validaConta(int numeroCta, Map<Integer, ContaCorrente> contas) throws AgenciaException {
		return validaConta(numeroCta, contas, EMensagensErro.CONTA_INEXISTENTE);
	}
	
	public static ContaCorrente validaConta(int numeroCta, Map<Integer, ContaCorrente> contas, EMensagensErro erro) throws AgenciaException {
		ContaCorrente conta = contas.get(new Integer(numeroCta));
		if (conta instanceof ContaCorrente) {
			return conta;
		}
		throw new AgenciaException(erro);
	}
	
	public static void validaValor(double valor, EMensagensErro erro) throws AgenciaException {
		if (valor < 0) throw new AgenciaException(erro);
	}
	
	public static void validaSenha(ContaCorrente conta, String senha) throws AgenciaException {
		if (!conta.getSenha().equals(senha)) throw new AgenciaException(EMensagensErro.SENHA_INCORRETA); 
	}
	
	public static void validaSaldo(ContaCorrente conta, double valor) throws AgenciaException {
		if (conta.getSaldo() < valor) throw new AgenciaException(EMensagensErro.SALDO_INSUFICIENTE);
	}
	
	public static void validaSenhaNova(String senha, String novaSenha) throws AgenciaException {
		if (!senha.equals(novaSenha)) throw new AgenciaException(EMensagensErro.VALIDACAO_SENHA_INCORRETA);
	}
}
