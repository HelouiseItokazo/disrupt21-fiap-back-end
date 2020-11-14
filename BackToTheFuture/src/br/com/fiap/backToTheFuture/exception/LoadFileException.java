package br.com.fiap.backToTheFuture.exception;

public class LoadFileException extends Exception {

	private static final long serialVersionUID = 65845037882641160L;

	public LoadFileException() {
		this("Não foi posssível carregar o arquivo.");
	}

	public LoadFileException(String msg) {
		super(msg);
	}
}
