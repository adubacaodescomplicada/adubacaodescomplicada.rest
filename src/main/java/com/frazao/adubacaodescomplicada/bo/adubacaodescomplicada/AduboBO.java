package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import java.security.Principal;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.BOException;
import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboDAO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboPrecoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboPreco;

@Service
public class AduboBO extends CRUDBO<Adubo, java.lang.Integer, AduboFiltroDTO, AduboDAO> {

	public AduboBO(@Autowired AduboDAO dao) {
		super(Adubo.class, dao);
	}

	@Autowired
	private AduboPrecoDAO aduboPrecoDAO;

	@Override
	public Collection<Adubo> filter(@Valid final AduboFiltroDTO filtro, Principal usuario) throws BOException {
		Optional<Collection<Adubo>> result = null;
		result = Optional.ofNullable(super.filter(filtro, usuario));
		result.ifPresent(lista -> {
			lista.forEach(a -> {
				Collection<AduboPreco> aduboPrecoList = aduboPrecoDAO.findTop1ByAduboAndDataBeforeOrderByDataDesc(a,
						new Date());
				if (aduboPrecoList != null && aduboPrecoList.iterator().hasNext()) {
					a.getAduboPrecoList().add(aduboPrecoList.iterator().next());
				}
			});
		});
		return result.orElse(null);
	}

}
