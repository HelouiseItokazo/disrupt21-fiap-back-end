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
	
	public void validarFormatoData(LocalDate startDate, LocalDate endDate) throws DateException {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			LocalDate.parse(DateHelper.toText(startDate), formatter);
			LocalDate.parse(DateHelper.toText(endDate), formatter);
			
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
			throw new DateException("Formato de data inválido. Formato esperado dd/MM/yyyy.");
		} 
	}
	
	public void validarIntervaloEntreDatas(LocalDate startDate, LocalDate endDate) throws DateException {
		if (startDate.isAfter(endDate)) {
			throw new DateException("Data inicial não pode ser maior que data final.");
		} 
	}
	
	public void validarAnosExistentesNoFilme(LocalDate startDate, LocalDate endDate) throws DateException {
		if ((startDate.getYear() != 1955 && startDate.getYear() != 1985) 
				&& (endDate.getYear() != 1955 && endDate.getYear() != 1985)){
			throw new DateException("O período informado não existe no filme. Informe um período que compreenda os anos de 1955 e/ou 1985.");
		}
	}
	
	public void validarFlag(Integer viagemNoTempo) throws FlagException {
		if(viagemNoTempo != 0 && viagemNoTempo != 1) {
			throw new FlagException("Flag inválida. Informe 0 para verdadeiro ou 1 para falso.");
		}
	}
	
}