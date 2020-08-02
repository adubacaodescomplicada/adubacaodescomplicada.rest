package com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada;

public enum PessoaTipo {

   PF("PF"), PJ("PJ");

   private String descricao;

   private PessoaTipo(String descricao) {
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