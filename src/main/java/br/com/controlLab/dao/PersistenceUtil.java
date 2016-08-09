package br.com.controlLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
	
	public static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("ControlLab");
	
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
	
	public void close(EntityManager em){
		em.close();
	}

}
