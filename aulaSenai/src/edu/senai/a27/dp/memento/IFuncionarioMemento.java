package edu.senai.a27.dp.memento;

public abstract interface IFuncionarioMemento {
	public abstract FuncionarioMemento salvaMemento();

	public abstract void recuperaMemento(FuncionarioMemento memento);
}
