package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.FonteMateriaOrganicaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.FonteMateriaOrganicaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.FonteMateriaOrganica;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "fonte-materia-organica")
public class FonteMateriaOrganicaCRUDREST
		extends CRUDREST<FonteMateriaOrganica, Integer, FonteMateriaOrganicaFiltroDTO, FonteMateriaOrganicaBO> {

	public FonteMateriaOrganicaCRUDREST(@Autowired FonteMateriaOrganicaBO bo) {
		super(bo);
	}

	@Override
	public FonteMateriaOrganica prepararForm(FonteMateriaOrganica modelo) throws Exception {
		return modelo == null ? new FonteMateriaOrganica() : modelo;
	}

}
