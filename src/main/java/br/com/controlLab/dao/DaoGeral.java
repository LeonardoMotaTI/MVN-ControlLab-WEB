package br.com.controlLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;

import org.hibernate.Session;

//@Transactional
public abstract class DaoGeral<T> implements DaoInterface<T>{	

	private final String MSG_SUCESS_SAVE = "Registro salvo com sucesso!";
	private final String MSG_SUCESS_DEL  = "Registro excluido!";
	private final String MSG_SUCESS_UPD  = "Registro atualizado com sucesso!";
	private final String MSG_ERRO_SAVE	 = "Erro ao tentar salvar o registro.";
	private final String MSG_ERRO_DEL	 = "Erro ao tentar excluir o registro.";
	private final String MSG_NOT_FOUND	 = "Registro nÃ£o encontrado.";
	
	@PersistenceContext
	protected EntityManager manager;
	private Session session;
//	private final Class<T> classe;
//	
	public DaoGeral(){
		//this.classe = classe;
	}
	
	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public String getMSG_SUCESS_SAVE() {
		return MSG_SUCESS_SAVE;
	}

	public String getMSG_SUCESS_DEL() {
		return MSG_SUCESS_DEL;
	}

	public String getMSG_SUCESS_UPD() {
		return MSG_SUCESS_UPD;
	}

	public String getMSG_ERRO_SAVE() {
		return MSG_ERRO_SAVE;
	}

	public String getMSG_ERRO_DEL() {
		return MSG_ERRO_DEL;
	}

	public String getMSG_NOT_FOUND() {
		return MSG_NOT_FOUND;
	}	

	public abstract T find(long codigo) throws Exception;
	
	public String delete (long codigo) throws Exception{
		try{
			T entity = this.find(codigo);
			if(entity!=null)
				manager.remove(entity);
			return "true";
		}catch(Exception e){
			return "";
		}
	}

}
