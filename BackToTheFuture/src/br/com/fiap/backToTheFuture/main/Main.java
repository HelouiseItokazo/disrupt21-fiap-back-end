package br.com.fiap.backToTheFuture.main;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.domain.Personagem;

public class Main {

	public static void main(String[] args) throws ParseException {

		Evento evento = new Evento(LocalDate.of(1985, 10, 26), "Primeira viagem no tempo",
				"Shopping Dois Pinheiros");

		List<Evento> eventos = new ArrayList<Evento>();

		eventos.add(evento);

		Personagem personagem = new Personagem("Martyn McFly", LocalDate.of(1985, 10, 26), eventos,
				"Personagem Principal");

	}

}
