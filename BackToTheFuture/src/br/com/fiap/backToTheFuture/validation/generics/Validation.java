package br.com.fiap.backToTheFuture.validation.generics;

import java.util.List;

import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;

public interface Validation<T> {

	void validarLista(List<T> t) throws DatabaseAccessException;

	void validarId(Long id) throws IdException;
}
