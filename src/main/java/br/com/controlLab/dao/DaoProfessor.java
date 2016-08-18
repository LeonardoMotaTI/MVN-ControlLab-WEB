package br.com.controlLab.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.controlLab.modelo.Professor;

public class DaoProfessor extends DaoGeral<Professor> {

	public DaoProfessor() {
	}

	@Override
	public String insert(Professor entity) throws Exception {
		// TODO Auto-generated method stub
		try {
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			return getMSG_SUCESS_SAVE();
		} catch (Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
			return getMSG_ERRO_SAVE();
		}
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
	public Professor find(String string) throws Exception {
		// TODO Auto-generated method stub
		Query qry = manager.createNamedQuery(Professor.MATRICULA)
				.setParameter("matricula", string);
		return (Professor) qry.getSingleResult();
	}

	@Override
	public Professor find(long codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
