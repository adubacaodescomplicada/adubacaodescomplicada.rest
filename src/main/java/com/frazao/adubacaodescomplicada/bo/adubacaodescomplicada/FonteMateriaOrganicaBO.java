package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.FonteMateriaOrganicaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.FonteMateriaOrganicaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.FonteMateriaOrganica;

@Service
public class FonteMateriaOrganicaBO
		extends CRUDBO<FonteMateriaOrganica, Integer, FonteMateriaOrganicaFiltroDTO, FonteMateriaOrganicaDAO> {

	public FonteMateriaOrganicaBO(@Autowired FonteMateriaOrganicaDAO dao) {
		super(FonteMateriaOrganica.class, dao);
	}

}
