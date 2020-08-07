package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.NutrienteDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.NutrienteFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Nutriente;

@Service
public class NutrienteBO extends CRUDBO<Nutriente, java.lang.Integer, NutrienteFiltroDTO, NutrienteDAO> {

   public NutrienteBO(@Autowired NutrienteDAO dao) {
	   super(Nutriente.class, dao);
   }

}

