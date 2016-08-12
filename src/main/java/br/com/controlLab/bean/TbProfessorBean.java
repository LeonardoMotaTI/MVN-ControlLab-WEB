package br.com.controlLab.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.controlLab.dao.DaoGeral;
import br.com.controlLab.modelo.TbProfessor;

@ManagedBean(name="professorBean")
@ViewScoped
public class TbProfessorBean 
{
	private TbProfessor professor = new TbProfessor();
	
	public TbProfessor getProfessor(){
		return professor;
	}
	
	public void gravarProfessor(){
		System.out.println("gravando professor!");
		
		new DaoGeral<TbProfessor>(TbProfessor.class).adicionar(this.professor);
		
		this.professor = new TbProfessor();
		
	}
}
