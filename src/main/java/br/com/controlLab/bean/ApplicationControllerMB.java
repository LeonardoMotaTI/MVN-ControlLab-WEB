package br.com.controlLab.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="controllerMB")
public class ApplicationControllerMB {
	
	private String appName = "ControlLab-WEB";

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}	
}
