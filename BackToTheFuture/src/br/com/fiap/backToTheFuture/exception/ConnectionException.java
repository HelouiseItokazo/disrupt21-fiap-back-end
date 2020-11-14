package br.com.fiap.backToTheFuture.exception;

public class ConnectionException extends Exception {

	private static final long serialVersionUID = -1261772901628584752L;
	
	public ConnectionException() {
		this("Problemas na conex�o");
	}

	public ConnectionException(String msg) {
		super(msg);
	}

}
