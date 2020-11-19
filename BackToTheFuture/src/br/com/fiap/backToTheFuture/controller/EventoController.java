package br.com.fiap.backToTheFuture.controller;

import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.service.EventoService;

public class EventoController extends HttpServlet{

	private static final long serialVersionUID = -3594754254397466376L;
	
	public EventoController() {
		
	}
	
	protected void doGet(HttpServletRequest eventoRequest, HttpServletResponse eventoResponse) {
		
		Long idPersonagem = Long.parseLong(eventoRequest.getParameter("idPersonagem")) ;
		
		try {
		
		EventoService eventoService = new EventoService();
		Evento evento = new Evento();
		List<Evento> eventos = eventoService.buscarTodosOsEventosPorIdDoPersonagem(idPersonagem);
		
		
		eventoResponse.setStatus(200);
		
		} catch (DatabaseAccessException | IdException | ClassNotFoundException | ConnectionException e) {
			System.err.println(e.getMessage());
			eventoResponse.setStatus(404);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			eventoResponse.setStatus(500);
		}
		
	}
	
	
}
