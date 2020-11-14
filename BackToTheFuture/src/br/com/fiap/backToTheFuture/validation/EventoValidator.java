package br.com.fiap.backToTheFuture.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;

import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.exception.DateException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.exception.FlagException;
import br.com.fiap.backToTheFuture.exception.IdException;
import br.com.fiap.backToTheFuture.helper.DateHelper;
import br.com.fiap.backToTheFuture.validation.generics.Validation;

public class EventoValidator implements Validation<Evento>{
	
	@Override
	public void validarId(Evento evento) throws IdException  {
		if (evento.getIdEvento() == null) {
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
			
			LocalDate.parse(DateHelper.toText(startDate), DateTimeFormatter.ofPattern("yyyy-MM-dd").withResolverStyle(ResolverStyle.STRICT));
			LocalDate.parse(DateHelper.toText(endDate), DateTimeFormatter.ofPattern("yyyy-MM-dd").withResolverStyle(ResolverStyle.STRICT));
			
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
			throw new DateException("Datas inválidas ou em formato inválido. Formato esperado dd/MM/yyyy.");
		} 
	}
	
	public void validarIntervaloEntreDatas(LocalDate startDate, LocalDate endDate) throws DateException {
		if (startDate.isAfter(endDate)) {
			throw new DateException("Data inicial não pode ser maior que data final.");
		} 
	}
	
	public void validarAnosExistentesNoFilme(LocalDate startDate, LocalDate endDate) throws DateException {
		if ((startDate.getYear() < 1955 && endDate.getYear() < 1985) || endDate.getYear() > 1985) {
			throw new DateException("O ano informado não existe no filme. Anos existentes 1955 e 1985.");
		}
	}
	
	public void validarFlag(Integer viagemNoTempo) throws FlagException {
		if(viagemNoTempo != 0 && viagemNoTempo != 1) {
			throw new FlagException("Flag inválida. Informe 0 para verdadeiro ou 1 para falso.");
		}
	}
	
}