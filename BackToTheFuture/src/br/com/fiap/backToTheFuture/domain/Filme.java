package br.com.fiap.backToTheFuture.domain;

import java.time.LocalDate;
import java.util.List;

public class Filme {
	private Long idFilme;
	private String titulo;
	private String tituloIdiomaOriginal;
	private String sinopse;
	private LocalDate anoLancamento;
	private LocalDate duracao;
	private String diretor;
	private List<Artista> elenco;
	private List<Categoria> categorias;

	public Filme(String titulo, String tituloIdiomaOriginal, String sinopse, LocalDate anoLancamento,
			LocalDate duracao, String diretor, List<Artista> elenco, List<Categoria> categorias) {
		this.titulo = titulo;
		this.tituloIdiomaOriginal = tituloIdiomaOriginal;
		this.sinopse = sinopse;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.diretor = diretor;
		this.elenco = elenco;
		this.categorias = categorias;
	}

	public Filme() {
	}

	public Long getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Long idFilme) {
		this.idFilme = idFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloIdiomaOriginal() {
		return tituloIdiomaOriginal;
	}

	public void setTituloIdiomaOriginal(String tituloIdiomaOriginal) {
		this.tituloIdiomaOriginal = tituloIdiomaOriginal;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public LocalDate getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(LocalDate anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public LocalDate getDuracao() {
		return duracao;
	}

	public void setDuracao(LocalDate duracao) {
		this.duracao = duracao;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public List<Artista> getElenco() {
		return elenco;
	}

	public void setElenco(List<Artista> elenco) {
		this.elenco = elenco;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

}
