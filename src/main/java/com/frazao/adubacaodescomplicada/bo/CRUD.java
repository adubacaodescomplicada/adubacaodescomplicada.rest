package com.frazao.adubacaodescomplicada.bo;

import java.security.Principal;
import java.util.Collection;

public interface CRUD<E, Id, F, D> {

	Id create(E t, Principal usuario) throws BOException;

	void delete(Id id, Principal usuario) throws BOException;

	Collection<E> filter(F filtro, Principal usuario) throws BOException;

	D getDAO();

	Class<E> getEntidadeClasse();

	E prepararForm(E modelo, Principal usuario) throws BOException;

	E restore(Id id, Principal usuario) throws BOException;

	E update(Id id, E t, Principal usuario) throws BOException;

}