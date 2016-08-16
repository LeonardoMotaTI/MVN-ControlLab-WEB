package br.com.controlLab.dao;

import java.util.List;

public interface DaoInterface<T> {
	
	public String insert(T entity) throws Exception;
	public String delete(long codigo) throws Exception;
	public String update(T entity) throws Exception;
	public T find(long codigo) throws Exception;
	public List<T> findAll() throws Exception;

}
