package br.com.fiap.backToTheFuture.validation;

import java.util.List;

import br.com.fiap.backToTheFuture.domain.Personagem;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.validation.generics.Validation;

public class PersonagemValidator implements Validation<Personagem>{
	
	@Override
	public void validarId(Personagem personagem) throws IdException {
		if (personagem.getIdPersonagem() == null) {
			throw new IdException("Id do personagem é inválido.");
		}
	}
	
	@Override
	public void validarLista(List<Personagem> personagens) throws DatabaseAccessException {
		if (personagens.isEmpty()) {
			throw new DatabaseAccessException("Nenhum dado localizado. Por favor reveja os critérios de busca.");
		}
	}
	
}
