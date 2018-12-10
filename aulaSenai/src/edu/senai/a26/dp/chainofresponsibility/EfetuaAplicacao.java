package edu.senai.a26.dp.chainofresponsibility;

public class EfetuaAplicacao {
	public static void main(String[] args) {
		Poupanca gerenciadorDeAplicacao = new Poupanca();
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		Acoes acoes = new Acoes();
		gerenciadorDeAplicacao.setProximaAplicacao(cdb);
		cdb.setProximaAplicacao(lci);
		lci.setProximaAplicacao(lca);
		lca.setProximaAplicacao(acoes);
		
		SolicitacaoDeAplicacao aplicacao5 =new SolicitacaoDeAplicacao(200000.00, "Festa", 3000);
		SolicitacaoDeAplicacao aplicacao2 =new SolicitacaoDeAplicacao(50.00, "Natal", 30);
		SolicitacaoDeAplicacao aplicacao1 =new SolicitacaoDeAplicacao(3000.00, "Presentes da familia", 100);
		SolicitacaoDeAplicacao aplicacao3 =new SolicitacaoDeAplicacao(2500.00, "Reserva", 550);
		SolicitacaoDeAplicacao aplicacao4 =new SolicitacaoDeAplicacao(50000.00, "Carro", 1500);
		
		System.out.println(gerenciadorDeAplicacao.solicitaAplicacao(aplicacao3));
		System.out.println(gerenciadorDeAplicacao.solicitaAplicacao(aplicacao4));
		System.out.println(gerenciadorDeAplicacao.solicitaAplicacao(aplicacao5));
		System.out.println(gerenciadorDeAplicacao.solicitaAplicacao(aplicacao1));
		System.out.println(gerenciadorDeAplicacao.solicitaAplicacao(aplicacao2));
		
		
	}
}
