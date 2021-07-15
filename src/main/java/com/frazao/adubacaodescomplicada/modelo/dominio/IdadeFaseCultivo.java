package com.frazao.adubacaodescomplicada.modelo.dominio;

public enum IdadeFaseCultivo {

   FORMACAO("Formação"), MANUTENCAO("Manutenção"), PRODUCAO("Produção");

   private String descricao;

   private IdadeFaseCultivo(String descricao) {
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