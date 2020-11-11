package br.com.fiap.backToTheFuture.domain;

import java.time.LocalDate;
import java.util.List;

public class Artista {
	private Long idArtista;
	private String nome;
	private LocalDate dataNascimento;
	private String genero;
	private List<Personagem> personagens;

	public Artista(String nome, LocalDate dataNascimento, String genero, List<Personagem> personagens) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.personagens = personagens;
	}

	public Artista() {
	}

	public Long getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Long idArtista) {
		this.idArtista = idArtista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}

}
