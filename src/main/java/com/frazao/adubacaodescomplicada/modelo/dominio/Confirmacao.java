package com.frazao.adubacaodescomplicada.modelo.dominio;

public enum Confirmacao {

   S("S"), N("N");

   private String descricao;

   private Confirmacao(String descricao) {
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