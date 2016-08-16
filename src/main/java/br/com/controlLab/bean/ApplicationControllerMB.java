package br.com.controlLab.bean;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

public abstract class ApplicationControllerMB implements Serializable, IBeanClass{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1684609375485418447L;
	
	abstract public String salvar() throws Exception;
	abstract public String deletar() throws Exception;
	abstract public String alterar() throws Exception;
	abstract public String novo() throws Exception;
	
	private String appName = "ControlLab-WEB";
	
	public String Validar(){
		return "";
	}
	
	@SuppressWarnings("unused")
	private HttpSession httpSession;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}	
}
