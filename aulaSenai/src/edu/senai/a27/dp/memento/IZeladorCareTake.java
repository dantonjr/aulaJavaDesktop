package edu.senai.a27.dp.memento;

import java.util.Stack;

public interface IZeladorCareTake {
	public Stack<FuncionarioMemento> pilhaEstados = new Stack<FuncionarioMemento>();

	public void addMemento(FuncionarioMemento m);

	public FuncionarioMemento getMemento();
}
