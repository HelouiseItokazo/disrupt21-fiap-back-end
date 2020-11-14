package br.com.fiap.backToTheFuture.domain;

import java.time.LocalDate;

public class Evento {
	private Long idEvento;
	private LocalDate dataEvento;
	private String descricao;
	private String local;
	private Integer viagemNoTempo;

	public Evento(LocalDate dataEvento, String descricao, String local) {
		this.dataEvento = dataEvento;
		this.descricao = descricao;
		this.local = local;
	}

	public Evento() {
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Integer getViagemNoTempo() {
		return viagemNoTempo;
	}

	public void setViagemNoTempo(Integer viagemNoTempo) {
		this.viagemNoTempo = viagemNoTempo;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", dataEvento=" + dataEvento + ", descricao=" + descricao + ", local="
				+ local + ", viagemNoTempo=" + viagemNoTempo + "]";
	}
	
	
}
