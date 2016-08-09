package br.com.controlLab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;


public class DaoGeral<T> {
	
	private final Class<T> classe;
	
	public DaoGeral(Class<T> classe){
		this.classe = classe;
	}
	
	public void adicionar(T t)
	{
		//obtem a entity manager
		EntityManager em = new PersistenceUtil().getEntityManager();
		//inicia a transação
		em.getTransaction().begin();
		//persiste os dados
		em.persist(t);
		//commit
		em.getTransaction().commit();
		//fecha a transação
		em.close();			
	}
	
	public List<T> listaTodos()
	{
		EntityManager em = new PersistenceUtil().getEntityManager();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		
		List<T> lista = em.createQuery(query).getResultList();
		
		em.close();
		return lista;
	}

}
