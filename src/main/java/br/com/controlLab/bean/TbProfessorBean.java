package br.com.controlLab.bean;

import javax.faces.bean.ManagedBean;

import br.com.controlLab.modelo.TbProfessor;

@ManagedBean
public class TbProfessorBean 
{
	private TbProfessor professor = new TbProfessor();
	
	public TbProfessor getNome(){
		return professor;
	}
}
