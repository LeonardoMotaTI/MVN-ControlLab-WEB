package br.com.controlLab.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.controlLab.modelo.Horario;

public class DaoHorario extends DaoGeral<Horario> {

	@Override
	public String insert(Horario entity) throws Exception {
		// TODO Auto-generated method stub
		manager.persist(entity);
		return getMSG_SUCESS_SAVE();
	}

	@Override
	public String update(Horario entity) throws Exception {
		// TODO Auto-generated method stub
		manager.merge(entity);
		return getMSG_SUCESS_UPD();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Horario> findAll() throws Exception {
		// TODO Auto-generated method stub
		Query qry = manager.createNamedQuery(Horario.FIND_ALL);
		return qry.getResultList();
	}

	@Override
	public Horario find(long codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
