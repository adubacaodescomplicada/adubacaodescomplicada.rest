package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import java.security.Principal;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.BOException;
import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.GarantiaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboGarantiaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.GarantiaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Garantia;

@Service
public class GarantiaBO extends CRUDBO<Garantia, java.lang.Integer, GarantiaFiltroDTO, GarantiaDAO> {

	public GarantiaBO(@Autowired GarantiaDAO dao) {
		super(Garantia.class, dao);
	}

	@Autowired
	private AduboGarantiaBO aduboGarantiaBO;

	@Override
	public Collection<Garantia> filter(@Valid GarantiaFiltroDTO filtro, Principal usuario) throws BOException {

		Collection<Garantia> result = super.filter(filtro, usuario);

		AduboGarantiaFiltroDTO aduboGarantiaFiltroDTO = new AduboGarantiaFiltroDTO();

		for (Garantia item : result) {
			aduboGarantiaFiltroDTO.setGarantia(item);
			List<AduboGarantia> aduboGarantiaList = (List<AduboGarantia>) aduboGarantiaBO
					.filter(aduboGarantiaFiltroDTO, usuario);
			aduboGarantiaList.forEach(r -> {
				r.setGarantia(null);
				r.getAdubo().setAduboGarantiaList(null);
			});
			item.setAduboGarantiaList(aduboGarantiaList);
		}

		return result;
	}

}
