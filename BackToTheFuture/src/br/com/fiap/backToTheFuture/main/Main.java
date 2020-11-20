package br.com.fiap.backToTheFuture.main;

import java.time.LocalDate;

import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.DateException;
import br.com.fiap.backToTheFuture.exception.FlagException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.service.EventoService;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, ConnectionException, DatabaseAccessException,
			DateException, FlagException, IdException {

		// BUSCAR UM EVENTO POR ID PERSONAGEM
//		EventoService eventoService = new EventoService();
//		try {
//			var a = eventoService.buscarPorId(1L);
//			System.out.println(a.toString());
//		} catch (DatabaseAccessException e) {
//			e.getMessage();
//			System.exit(1);
//		} catch (IdException e) {
//			e.getMessage();
//			System.exit(1);
//		}

		// BUSCAR TODOS OS EVENTOS RELACIONADOS AO ID DO PERSONAGEM
//		EventoService eventoService1 = new EventoService();
//		try {
//			var b = eventoService1.buscarTodosOsEventosPorIdDoPersonagem(1L);
//			System.out.println(b.toString());
//		} catch (DatabaseAccessException e) {
//			e.getMessage();
//			System.exit(1);
//		}

		// BUSCAR TODOS OS EVENTOS RELACIONADOR PERIODO E FLAG
		EventoService eventoService2 = new EventoService();
		var c = eventoService2.buscarEventoPorDataEFlag(LocalDate.of(1955, 11, 01), 0, 1L);
		System.out.println(c.toString());

		// BUSCAR TODOS OS PERSONAGENS
//		PersonagemService personService = new PersonagemService();
//		var d = personService.buscarTodos();
//		System.out.println(d.toString());

		// BUSCAR UM PERSONAGEM POR ID
//		PersonagemService personagemService = new PersonagemService();
//		var e = personagemService.buscarPorId(1L);
//		System.out.println(e.toString());
//		// BUSCAR UM ARTISTA1
//		ArtistaService artistaService1 = new ArtistaService();
//		var g = artistaService1.buscarPorId(1L);
//		System.out.println(g.toString());
//		PersonagemResponseDTO response = toPersonagemDTO(g, e);

		// BUSCAR TODOS OS ARTISTAS
//		ArtistaService artistaService = new ArtistaService();
//		var f = artistaService.buscarTodos();
//		System.out.println(f.toString());
		
		// BUSCAR TODOS OS PERSONAGENS VINCULADOS AO ARTISTA
//		PersonagemService ps = new PersonagemService();
//		var h = ps.buscarPersonagensPorIdArtista(1L);
//		System.out.println(h);
	}

//	private static PersonagemResponseDTO toPersonagemDTO(Artista g, Personagem e) {
//		PersonagemResponseDTO dto = new PersonagemResponseDTO();
//		dto.setArtista(g);
//		dto.setPersonagem(e);
//		return dto;
//	}

}
