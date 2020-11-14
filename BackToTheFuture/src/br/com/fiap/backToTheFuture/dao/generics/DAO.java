package br.com.fiap.backToTheFuture.dao.generics;

import java.util.List;

import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;

public interface DAO<T> {
	
	List<T> findAll() throws DatabaseAccessException;

	T findById(long id) throws DatabaseAccessException;
}
