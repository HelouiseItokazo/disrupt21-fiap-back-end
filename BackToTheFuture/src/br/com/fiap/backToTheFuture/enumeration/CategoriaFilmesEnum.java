package br.com.fiap.backToTheFuture.enumeration;

public enum CategoriaFilmesEnum {

	AVENTURA(1L, "AVENTURA"), FICCAO(2L, "FICÇÃO");

	private Long idCategoria;
	private String descricaoCategoria;

	private CategoriaFilmesEnum(long idCategoria, String descricaoCategoria) {
		this.idCategoria = idCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

}
