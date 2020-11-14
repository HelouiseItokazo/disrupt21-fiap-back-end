package br.com.fiap.backToTheFuture.domain;

import java.time.LocalDate;
import java.util.List;

public class Personagem {
	private Long idPersonagem;
	private String nome;
	private LocalDate dataNascimento;
	private List<Evento> eventos;
	private String descricao;
	
	public Personagem(String nome, LocalDate dataNascimento, List<Evento> eventos,
			String descricao) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.eventos = eventos;
		this.descricao = descricao;
	}

	public Personagem() {
	}

	public Long getIdPersonagem() {
		return idPersonagem;
	}

	public void setIdPersonagem(Long idPersonagem) {
		this.idPersonagem = idPersonagem;
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

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Personagem [idPersonagem=" + idPersonagem + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", eventos=" + eventos + ", descricao=" + descricao + "]";
	}
	
}
