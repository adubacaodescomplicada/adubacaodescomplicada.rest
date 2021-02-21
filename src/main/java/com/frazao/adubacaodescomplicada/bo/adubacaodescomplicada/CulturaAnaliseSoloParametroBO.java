package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaAnaliseSoloParametroDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaAnaliseSoloParametroFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaAnaliseSoloParametro;

@Service
public class CulturaAnaliseSoloParametroBO extends
		CRUDBO<CulturaAnaliseSoloParametro, Integer, CulturaAnaliseSoloParametroFiltroDTO, CulturaAnaliseSoloParametroDAO> {

	public CulturaAnaliseSoloParametroBO(@Autowired CulturaAnaliseSoloParametroDAO dao) {
		super(CulturaAnaliseSoloParametro.class, dao);
	}

}
