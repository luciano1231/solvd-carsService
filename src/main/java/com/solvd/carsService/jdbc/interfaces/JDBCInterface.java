package com.solvd.carsService.jdbc.interfaces;

import java.util.List;

public interface JDBCInterface <T>{
	public boolean create(T t);
	public boolean delete(Object ob);
	public boolean update(T t);

	//Using GENERICS
	public T read(Object ob);
	public List<T> readAll();
}
