package br.com.fiap.backToTheFuture.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import br.com.fiap.backToTheFuture.domain.Artista;
import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.domain.Personagem;

public class PersonagemController extends HttpServlet{

	private static final long serialVersionUID = 5325899467937477904L;
	
	private Personagem nomePersonagem;
	private Artista nomeArtista;
	private List<Evento> eventos;
	private String descricao;
	
	

}
