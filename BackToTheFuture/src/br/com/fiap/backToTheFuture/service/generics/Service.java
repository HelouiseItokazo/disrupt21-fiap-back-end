package br.com.fiap.backToTheFuture.service.generics;

import java.util.List;

import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;

public interface Service<T> {
	
	public List<T> buscarTodos() throws DatabaseAccessException;
	
	public T buscarPorId(long id) throws DatabaseAccessException, IdException;
}
