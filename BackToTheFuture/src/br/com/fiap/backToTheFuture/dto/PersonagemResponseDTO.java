package br.com.fiap.backToTheFuture.dto;

import br.com.fiap.backToTheFuture.domain.Artista;
import br.com.fiap.backToTheFuture.domain.Personagem;

public class PersonagemResponseDTO {
	private Personagem personagem;
	private Artista artista;
	
	public Personagem getPersonagem() {
		return personagem;
	}
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}

}
