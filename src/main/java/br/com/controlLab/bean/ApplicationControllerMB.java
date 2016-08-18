package br.com.controlLab.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpSession;

@ManagedBean(name="beanApplication")
@SessionScoped
public class ApplicationControllerMB implements Serializable, IBeanClass{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1684609375485418447L;
	
//	abstract public String salvar() throws Exception;
//	abstract public String deletar() throws Exception;
//	abstract public String alterar() throws Exception;
//	abstract public String novo() throws Exception;
	
	private String appName = "ControlLab-WEB";
	
	public String Validar(){
		return "";
	}
	
	public String loginOK(){
		return "sucesso";
	}
	
	@SuppressWarnings("unused")
	private HttpSession httpSession;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Override
	public String salvar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String novo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String imprimir() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	
}
