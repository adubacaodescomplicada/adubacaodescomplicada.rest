package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.dominio.Confirmacao;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Cultura")
@Table(name = "cultura")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Cultura extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "codigo")
	private String codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "formacao")
	@Enumerated(EnumType.STRING)
	private Confirmacao formacao;

	@Column(name = "producao")
	@Enumerated(EnumType.STRING)
	private Confirmacao producao;

	@Column(name = "recomendacao")
	private String recomendacao;
	
	@Column(name = "epoca")
	private String epoca;
	
	@Column(name = "tipo_folha")
	private String tipoFolha;
	
	@Column(name = "numero_folha")
	private String numeroFolha;
	
	@Column(name = "armazanamento_envio")
	private String armazanamentoEnvio;
	
	@Column(name = "observacao_coleta")
	private String observacaoColeta;
	
	@Column(name = "meta_saturacao_base")
    private Integer metaSaturacaoBase;
	
	@OneToMany(mappedBy = "cultura")
	private List<CulturaIdadePlantio> culturaIdadePlantioList;
	
	public String toString() {
		return String.format("%d. %s", this.getId(), this.getNome());
	}

}
