package edu.senai.a19.generics.com;

import java.util.List;

public interface IProcessa<T> {

	public abstract void cadastra(T classe);

	public abstract void exclui(int x);

	public abstract T consulta();
	
	public abstract List<T> varios();
	
	public abstract void exclui(T objeto);
}