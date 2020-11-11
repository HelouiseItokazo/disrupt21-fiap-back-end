package br.com.fiap.backToTheFuture.domain;

import br.com.fiap.backToTheFuture.enumeration.CategoriaFilmesEnum;

public class Categoria {
	private Long idCategoria;
	private CategoriaFilmesEnum categoria;

	public Categoria(CategoriaFilmesEnum categoria) {
		this.categoria = categoria;
	}

	public Categoria() {
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public CategoriaFilmesEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaFilmesEnum categoria) {
		this.categoria = categoria;
	}

}
