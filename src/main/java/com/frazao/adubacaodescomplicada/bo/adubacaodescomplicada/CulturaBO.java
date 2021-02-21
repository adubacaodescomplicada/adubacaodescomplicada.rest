package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.BOException;
import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaDAO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaNecessidadeAduboFormacaoDAO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaNecessidadeAduboProducaoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Cultura;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboFormacao;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboProducao;

@Service
public class CulturaBO extends CRUDBO<Cultura, java.lang.Integer, CulturaFiltroDTO, CulturaDAO> {

	public CulturaBO(@Autowired CulturaDAO dao) {
		super(Cultura.class, dao);
	}

	@Autowired
	private CulturaNecessidadeAduboProducaoDAO culturaNecessidadeAduboProducaoDAO;

	@Autowired
	private CulturaNecessidadeAduboFormacaoDAO culturaNecessidadeAduboFormacaoDAO;

	@Override
	public Collection<Cultura> filter(@Valid final CulturaFiltroDTO filtro) throws BOException {
		Optional<Collection<Cultura>> result = null;
		result = Optional.ofNullable(super.filter(filtro));
		result.ifPresent(lista -> {
			lista.forEach(a -> {
				Collection<CulturaNecessidadeAduboFormacao> list1 = culturaNecessidadeAduboFormacaoDAO
						.findAllByCultura(a);
				a.getCulturaNecessidadeAduboFormacaoList().clear();
				if (list1 != null
						&& list1.iterator().hasNext()) {
					a.getCulturaNecessidadeAduboFormacaoList().addAll(list1);
				}
				Collection<CulturaNecessidadeAduboProducao> list2 = culturaNecessidadeAduboProducaoDAO
						.findAllByCultura(a);
				a.getCulturaNecessidadeAduboProducaoList().clear();
				if (list2 != null
						&& list2.iterator().hasNext()) {
					a.getCulturaNecessidadeAduboProducaoList().addAll(list2);
				}
			});
		});
		return result.orElse(null);
	}

}
