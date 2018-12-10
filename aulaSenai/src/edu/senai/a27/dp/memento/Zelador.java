package edu.senai.a27.dp.memento;

public class Zelador implements IZeladorCareTake {

	@Override
	public void addMemento(FuncionarioMemento m) {
		pilhaEstados.push(m);
	}

	@Override
	public FuncionarioMemento getMemento() {
		return pilhaEstados.pop();
	}

}
