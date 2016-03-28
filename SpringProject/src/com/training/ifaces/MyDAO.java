package com.training.ifaces;

import java.io.Serializable;

public interface MyDAO<T> extends Serializable {

	public Object find(Serializable obj);
	public Object add(T t);
	public T findAll();
}
