package br.com.fiap.backToTheFuture.service;

import java.util.List;

import br.com.fiap.backToTheFuture.dao.PersonagemDAO;
import br.com.fiap.backToTheFuture.domain.Personagem;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.service.generics.Service;
import br.com.fiap.backToTheFuture.validation.PersonagemValidator;

public class PersonagemService implements Service<Personagem>{
	
	private PersonagemDAO personagemDAO;
	private PersonagemValidator personagemValidator;
	
	public PersonagemService() throws ClassNotFoundException, ConnectionException {
		this.personagemDAO = new PersonagemDAO();
		this.personagemValidator = new PersonagemValidator();
	}
	
	@Override
	public List<Personagem> buscarTodos() throws DatabaseAccessException{
		List<Personagem> personagens = personagemDAO.findAll();
		personagemValidator.validarLista(personagens);
		return personagens;
	}
	
	@Override
	public Personagem buscarPorId(long id) throws DatabaseAccessException, IdException {
		Personagem personagem = personagemDAO.findById(id);
		personagemValidator.validarId(personagem);
		return personagem;
	}
	
}
