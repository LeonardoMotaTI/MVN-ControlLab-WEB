package br.com.controlLab.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.controlLab.modelo.Disciplina;

public class DaoDisciplina extends DaoGeral<Disciplina> {

	@Override
	public String insert(Disciplina entity) throws Exception {
		// TODO Auto-generated method stub
		manager.persist(entity);
		return getMSG_SUCESS_SAVE();
	}

	@Override
	public String update(Disciplina entity) throws Exception {
		// TODO Auto-generated method stub
		manager.merge(entity);
		return getMSG_SUCESS_UPD();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Disciplina> findAll() throws Exception {
		// TODO Auto-generated method stub
		Query query = manager.createNamedQuery(Disciplina.FIND_ALL);
		return query.getResultList();
	}

	@Override
	public Disciplina find(long codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	

}
