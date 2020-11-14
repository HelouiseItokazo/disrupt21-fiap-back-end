package br.com.fiap.backToTheFuture.exception;

public class DatabaseAccessException extends Exception {

	private static final long serialVersionUID = -8369582480387506070L;
	
	public DatabaseAccessException() {
		this("Falha ao realizar consulta");
	}

	public DatabaseAccessException(String msg) {
		super(msg);
	}
	
}
