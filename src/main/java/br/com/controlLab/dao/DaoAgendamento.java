package br.com.controlLab.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.controlLab.modelo.Agendamento;

public class DaoAgendamento extends DaoGeral<Agendamento> {

	@Override
	public String insert(Agendamento entity) throws Exception {
		// TODO Auto-generated method stub
		manager.persist(entity);
		return getMSG_SUCESS_SAVE();
	}

	@Override
	public String update(Agendamento entity) throws Exception {
		// TODO Auto-generated method stub
		manager.merge(entity);
		return getMSG_SUCESS_UPD();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Agendamento> findAll() throws Exception {
		// TODO Auto-generated method stub
		Query qry = manager.createNamedQuery(Agendamento.FIND_ALL);
		return qry.getResultList();
	}

	@Override
	public Agendamento find(long codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
