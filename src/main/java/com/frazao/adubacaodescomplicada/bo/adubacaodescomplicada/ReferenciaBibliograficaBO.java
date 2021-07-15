package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import java.security.Principal;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.BOException;
import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.ReferenciaBibliograficaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.ReferenciaBibliograficaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.ReferenciaBibliografica;

@Service
public class ReferenciaBibliograficaBO extends
		CRUDBO<ReferenciaBibliografica, java.lang.Integer, ReferenciaBibliograficaFiltroDTO, ReferenciaBibliograficaDAO> {

	public ReferenciaBibliograficaBO(@Autowired ReferenciaBibliograficaDAO dao) {
		super(ReferenciaBibliografica.class, dao);
	}

	@Autowired
	private AduboGarantiaBO aduboGarantiaBO;

	@Override
	public Collection<ReferenciaBibliografica> filter(@Valid ReferenciaBibliograficaFiltroDTO filtro, Principal usuario)
			throws BOException {

		Collection<ReferenciaBibliografica> result = super.filter(filtro, usuario);

//		AduboGarantiaFiltroDTO aduboGarantiaFiltroDTO = new AduboGarantiaFiltroDTO();

		for (ReferenciaBibliografica item : result) {
//			aduboGarantiaFiltroDTO.setGarantia(item);
//			List<AduboGarantia> aduboGarantiaList = (List<AduboGarantia>) aduboGarantiaBO
//					.filter(aduboGarantiaFiltroDTO);
//			aduboGarantiaList.forEach(r -> {
//				r.setGarantia(null);
//				r.getAdubo().setAduboGarantiaList(null);
//			});
//			item.setAduboGarantiaList(aduboGarantiaList);
			System.out.println(item.getId());
		}

		return result;
	}

}
