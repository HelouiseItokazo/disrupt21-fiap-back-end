package br.com.fiap.backToTheFuture.validation;

import java.util.List;

import br.com.fiap.backToTheFuture.domain.Artista;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.validation.generics.Validation;

public class ArtistaValidator implements Validation<Artista>{
	
	@Override
	public void validarId(Long idArtista) throws IdException {
		if (idArtista == null) {
			throw new IdException("Id do artista é inválido.");
		}
	}
	
	@Override
	public void validarLista(List<Artista> elenco) throws DatabaseAccessException {
		if (elenco.isEmpty()) {
			throw new DatabaseAccessException("Nenhum dado localizado. Por favor reveja os critérios de busca.");
		}
	}
	
}
