package br.com.controlLab.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EnumType;

@FacesConverter("enumTypeConverter")
public class EnumTypeConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String valor) {
		// TODO Auto-generated method stub
		if(valor!=null){
			return EnumType.valueOf(valor);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object valor) {
		// TODO Auto-generated method stub		
		if (valor != null && valor instanceof EnumType) {
			return ((EnumType) valor).name();
		}
		
		return null;
	}

}
