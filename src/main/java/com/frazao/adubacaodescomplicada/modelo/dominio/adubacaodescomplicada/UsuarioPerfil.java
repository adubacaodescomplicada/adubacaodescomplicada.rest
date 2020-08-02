package com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada;

public enum UsuarioPerfil {

   ADMIN("Admin"), PARCEIRO("Parceiro"), CLIENTE("Cliente");

   private String descricao;

   private UsuarioPerfil(String descricao) {
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