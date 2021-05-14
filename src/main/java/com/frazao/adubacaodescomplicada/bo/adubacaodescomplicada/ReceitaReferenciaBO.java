package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.BOException;
import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.ReceitaReferenciaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.ReceitaReferenciaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.ReceitaReferencia;

@Service
public class ReceitaReferenciaBO extends CRUDBO<ReceitaReferencia, java.lang.Integer, ReceitaReferenciaFiltroDTO, ReceitaReferenciaDAO> {

	public ReceitaReferenciaBO(@Autowired ReceitaReferenciaDAO dao) {
		super(ReceitaReferencia.class, dao);
	}

	@Autowired
	private AduboGarantiaBO aduboGarantiaBO;

	@Override
	public Collection<ReceitaReferencia> filter(@Valid ReceitaReferenciaFiltroDTO filtro) throws BOException {

		Collection<ReceitaReferencia> result = super.filter(filtro);

//		AduboGarantiaFiltroDTO aduboGarantiaFiltroDTO = new AduboGarantiaFiltroDTO();

		for (ReceitaReferencia item : result) {
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
