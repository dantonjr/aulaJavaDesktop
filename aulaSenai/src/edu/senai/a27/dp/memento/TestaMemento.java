package edu.senai.a27.dp.memento;

public class TestaMemento {
	public static void main(String[] args) {
		Zelador zelador = new Zelador();
		FuncionarioOriginador func = new FuncionarioOriginador("Danton Junior", "Blumenau", 500, "123-123");
		FuncionarioMemento memento = func.salvaMemento();

		zelador.addMemento(memento);
		
		func.setEndereco("Gaspar");
		func.setTelefone("999-999");
		zelador.addMemento(func.salvaMemento());
		
		func.setSalario(1000);
		memento = func.salvaMemento();
		zelador.addMemento(memento);
		
		func.setSalario(2000);
		
		zelador.addMemento(func.salvaMemento());
		
		System.out.println("ultimo objeto");
		System.out.println(func.toString());
		
		System.out.println("Recuperando mementos...");
		
		memento = zelador.getMemento();
		func.recuperaMemento(memento);
		System.out.println(func.toString());
		
		memento = zelador.getMemento();
		func.recuperaMemento(memento);
		System.out.println(func.toString());

		memento = zelador.getMemento();
		func.recuperaMemento(memento);
		System.out.println(func.toString());
		
		memento = zelador.getMemento();
		func.recuperaMemento(memento);
		System.out.println(func.toString());

		memento = zelador.getMemento();
		func.recuperaMemento(memento);
		System.out.println(func.toString());


	}
}
