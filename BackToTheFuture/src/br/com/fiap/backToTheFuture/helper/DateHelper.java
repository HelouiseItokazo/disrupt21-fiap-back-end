package br.com.fiap.backToTheFuture.helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHelper {

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static String toText(LocalDate date) {
		return formatter.format(date);
	}
}