package com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada;

public enum ClassificacaoNecessidadeAdubo {

	MUITO_BAIXO("muito_baixo"), BAIXO("baixo"), MEDIO("medio"), ADEQUADO("adequado"), MUITO_ALTO("muito_alto");

	private String descricao;

	private ClassificacaoNecessidadeAdubo(String descricao) {
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