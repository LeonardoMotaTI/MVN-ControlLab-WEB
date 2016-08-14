package br.com.controlLab.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.controlLab.dao.DaoGeral;
import br.com.controlLab.modelo.Professor;

@ManagedBean(name="professorBean")
@ViewScoped
public class ProfessorBean 
{
	private Professor professor = new Professor();
	
	public Professor getProfessor(){
		return professor;
	}
	
	public void gravarProfessor(){
		System.out.println("gravando professor!");
		
		new DaoGeral<Professor>(Professor.class).adicionar(this.professor);
		
		this.professor = new Professor();
		
	}
}
