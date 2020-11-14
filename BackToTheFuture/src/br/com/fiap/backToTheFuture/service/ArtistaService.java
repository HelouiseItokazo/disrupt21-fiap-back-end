package br.com.fiap.backToTheFuture.service;

import java.util.List;

import br.com.fiap.backToTheFuture.dao.ArtistaDAO;
import br.com.fiap.backToTheFuture.domain.Artista;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.service.generics.Service;
import br.com.fiap.backToTheFuture.validation.ArtistaValidator;

public class ArtistaService implements Service<Artista>{
	
	private ArtistaDAO artistaDAO;
	private ArtistaValidator artistaValidator;
	
	public ArtistaService() throws ClassNotFoundException, ConnectionException {
		this.artistaDAO = new ArtistaDAO();
		this.artistaValidator = new ArtistaValidator();
	}
	
	@Override
	public List<Artista> buscarTodos() throws DatabaseAccessException{
		List<Artista> elenco = artistaDAO.findAll();
		artistaValidator.validarLista(elenco);
		return elenco;
	}
	
	@Override
	public Artista buscarPorId(long id) throws DatabaseAccessException, IdException {
		Artista artista = artistaDAO.findById(id);
		artistaValidator.validarId(artista);
		return artista;
	}
	
}
