package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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

	@Column(name = "armazanamento_envio")
	private String armazanamentoEnvio;

	@Column(name = "classificacao")
	private String classificacao;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "cultivo_em_solo")
	@Enumerated(EnumType.STRING)
	private Confirmacao cultivoEmSolo;

	@Column(name = "cultivo_fora_solo")
	@Enumerated(EnumType.STRING)
	private Confirmacao cultivoForaSolo;

	@OneToMany(mappedBy = "cultura")
	private List<CulturaIdadePlantio> culturaIdadePlantioList = new ArrayList<>();

	@Transient
	private List<CulturaNecessidadeAduboFormacao> culturaNecessidadeAduboFormacaoList = new ArrayList<>();

	@Transient
	private List<CulturaNecessidadeAduboProducao> culturaNecessidadeAduboProducaoList = new ArrayList<>();

	@Column(name = "epoca")
	private String epoca;

	@Column(name = "espacamento_duplo")
	@Enumerated(EnumType.STRING)
	private Confirmacao espacamentoDuplo;

	@Column(name = "formacao")
	@Enumerated(EnumType.STRING)
	private Confirmacao formacao;

	@Column(name = "forma_plantio")
	private String formaPlantio;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "meta_saturacao_base")
	private Integer metaSaturacaoBase;

	@Column(name = "nome")
	private String nome;

	@Column(name = "numero_folha")
	private String numeroFolha;

	@Column(name = "observacao_coleta")
	private String observacaoColeta;

	@Column(name = "producao")
	@Enumerated(EnumType.STRING)
	private Confirmacao producao;

	@Column(name = "recomendacao")
	private String recomendacao;

	@Column(name = "tipo_folha")
	private String tipoFolha;

	@Column(name = "unidade_produtividade")
	private String unidadeProdutividade;

	public Cultura(Integer id) {
		super(id);
	}

	@SuppressWarnings("unchecked")
	public Set<String> getFormaPlantio() {
		return this.formaPlantio == null ? Collections.EMPTY_SET
				: Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(this.formaPlantio.split(","))));
	}
	
	public void setFormaPlantio(Set<String> formaPlantio) {
		 this.formaPlantio = String.join(",", formaPlantio);
	}
}
