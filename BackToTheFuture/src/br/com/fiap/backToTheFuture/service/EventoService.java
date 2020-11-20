package br.com.fiap.backToTheFuture.service;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.backToTheFuture.dao.EventoDAO;
import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.DateException;
import br.com.fiap.backToTheFuture.exception.FlagException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.service.generics.Service;
import br.com.fiap.backToTheFuture.validation.EventoValidator;

public class EventoService implements Service<Evento>{
	
	private EventoDAO eventoDAO;
	private EventoValidator eventoValidator;
	
	public EventoService() throws ClassNotFoundException, ConnectionException {
		this.eventoDAO = new EventoDAO();
		this.eventoValidator = new EventoValidator();
	}
	
	@Override
	public List<Evento> buscarTodos() throws DatabaseAccessException{
		List<Evento> eventos = eventoDAO.findAll();
		eventoValidator.validarLista(eventos);
		return eventos;
	}
	
	@Override
	public Evento buscarPorId(long id) throws IdException, DatabaseAccessException {
		eventoValidator.validarId(id);
		Evento evento = eventoDAO.findById(id);
		return evento;
	}
	
	public List<Evento> buscarTodosOsEventosPorIdDoPersonagem(long idPersonagem) throws IdException, DatabaseAccessException{
		eventoValidator.validarId(idPersonagem);
		List<Evento> eventos = eventoDAO.findAllById(idPersonagem);
		eventoValidator.validarLista(eventos);
		return eventos;
	}

	public List<Evento> buscarEventoPorDataEFlag(LocalDate date, Integer viagemNoTempo, Long idPersonagem) throws DateException, FlagException, DatabaseAccessException, IdException {
		eventoValidator.validarFormatoData(date);
		eventoValidator.validarFlag(viagemNoTempo);
		eventoValidator.validarId(idPersonagem);
		List<Evento> eventos = eventoDAO.findAllByDateAndFlag(date, viagemNoTempo, idPersonagem);
		eventoValidator.validarLista(eventos);
		return eventos;
	}
	
}
