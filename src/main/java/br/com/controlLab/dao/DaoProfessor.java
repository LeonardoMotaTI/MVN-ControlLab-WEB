package br.com.controlLab.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.controlLab.modelo.Professor;

public class DaoProfessor extends DaoGeral<Professor> {
	
	public DaoProfessor(){
	}

	@Override
	public String insert(Professor entity) throws Exception {
		// TODO Auto-generated method stub
		manager.persist(entity);
		return getMSG_SUCESS_SAVE();
	}

	@Override
	public String update(Professor entity) throws Exception {
		// TODO Auto-generated method stub
		manager.merge(entity);
		return getMSG_SUCESS_UPD();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Professor> findAll() throws Exception {
		// TODO Auto-generated method stub
		Query query = manager.createNamedQuery(Professor.FIND_ALL);
		return query.getResultList();
	}

	@Override
	public Professor find(long codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
