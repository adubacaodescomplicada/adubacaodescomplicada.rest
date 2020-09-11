package com.frazao.adubacaodescomplicada.modelo.dominio;

public enum CulturaIdadePlantioUnidade {

   anos("anos"), dias("dias");

   private String descricao;

   private CulturaIdadePlantioUnidade(String descricao) {
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