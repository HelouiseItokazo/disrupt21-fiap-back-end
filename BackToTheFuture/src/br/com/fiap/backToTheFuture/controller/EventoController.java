package br.com.fiap.backToTheFuture.controller;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.service.EventoService;

@WebServlet("/Event")
public class EventoController extends HttpServlet {

	private static final long serialVersionUID = -3594754254397466376L;

	public EventoController() {

	}

	protected void doGet(HttpServletRequest eventoRequest, HttpServletResponse eventoResponse) {

		Long idPersonagem = Long.parseLong(eventoRequest.getParameter("id"));
		String codData = eventoRequest.getParameter("ano");

		LocalDate data = LocalDate.now();
		// 0 = Sim - 1 = Não
		int viagemNoTempo = 1;

		switch (codData) {
		case "year1985":
			data = LocalDate.of(1985, 1, 1);
			viagemNoTempo = 1;
			break;
		case "year1955":
			data = LocalDate.of(1955, 1, 1);
			viagemNoTempo = 1;
			break;
		case "year1985alt":
			data = LocalDate.of(1985, 1, 1);
			viagemNoTempo = 0;
		}

		try {

			EventoService eventoService = new EventoService();
			List<Evento> eventos = eventoService.buscarEventoPorDataEFlag(data, viagemNoTempo, idPersonagem);
			List<String> descEventos = new ArrayList<String>();

			eventos.forEach(str -> descEventos.add(str.getDescricao()));

			descEventos.add("Registro 1");
			descEventos.add("Registro 2");

			Gson gson = new Gson();

			String json = gson.toJson(descEventos);

			eventoResponse.setContentType("application/json");
			eventoResponse.setCharacterEncoding("UTF-8");
			PrintWriter out = eventoResponse.getWriter();
			out.write(json);
			out.close();
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
