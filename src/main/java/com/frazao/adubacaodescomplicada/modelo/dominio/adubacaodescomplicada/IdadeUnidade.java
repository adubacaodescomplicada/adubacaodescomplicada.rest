package com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada;

public enum IdadeUnidade {

	DIA("dia"), MES("mes"), ANO("ano");

	private String descricao;

	private IdadeUnidade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

}