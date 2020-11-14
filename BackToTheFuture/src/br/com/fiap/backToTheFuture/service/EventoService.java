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
	public Evento buscarPorId(long id) throws DatabaseAccessException, IdException {
		Evento evento = eventoDAO.findById(id);
		eventoValidator.validarId(evento);
		return evento;
	}
	
	public List<Evento> buscarTodosOsEventosPorIdDoPersonagem(long id) throws DatabaseAccessException{
		List<Evento> eventos = eventoDAO.findAllById(id);
		eventoValidator.validarLista(eventos);
		return eventos;
	}
	
	public List<Evento> buscarEventoPorDataEFlag(LocalDate startDate, LocalDate endDate, Integer viagemNoTempo) throws DatabaseAccessException, DateException, FlagException {
		List<Evento> eventos = eventoDAO.findAllByDateAndFlag(startDate, endDate, viagemNoTempo);
		eventoValidator.validarLista(eventos);
		//eventoValidator.validarFormatoData(startDate, endDate);
		eventoValidator.validarIntervaloEntreDatas(startDate, endDate);
		eventoValidator.validarAnosExistentesNoFilme(startDate, endDate);
		eventoValidator.validarFlag(viagemNoTempo);
		return eventos;
	}
	
}
