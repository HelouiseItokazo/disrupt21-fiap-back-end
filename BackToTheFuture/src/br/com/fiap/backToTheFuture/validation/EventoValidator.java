package br.com.fiap.backToTheFuture.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.DateException;
import br.com.fiap.backToTheFuture.exception.FlagException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.helper.DateHelper;
import br.com.fiap.backToTheFuture.validation.generics.Validation;

public class EventoValidator implements Validation<Evento>{
	
	@Override
	public void validarId(Long idEvento) throws IdException  {
		if (idEvento == null) {
			throw new IdException("Id do evento é inválido");
		}
	}
	
	@Override
	public void validarLista(List<Evento> eventos) throws DatabaseAccessException {
		if(eventos.isEmpty()) {
			throw new DatabaseAccessException("Nenhum dado localizado. Por favor reveja os critérios de busca.");
		}
	}
	
	public void validarFormatoData(LocalDate date) throws DateException {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			LocalDate.parse(DateHelper.toText(date), formatter);
			
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
			throw new DateException("Formato de data inválido. Formato esperado dd/MM/yyyy.");
		} 
	}
	
	public void validarData(LocalDate date) throws DateException {
		if (date.getYear() != 01/11/1985 && date.getYear() != 01/11/1955) {
			throw new DateException("Data invalida.");
		} 
	}
	
	public void validarFlag(Integer viagemNoTempo) throws FlagException {
		if(viagemNoTempo != 0 && viagemNoTempo != 1) {
			throw new FlagException("Flag inválida. Informe 0 para verdadeiro ou 1 para falso.");
		}
	}
	
}