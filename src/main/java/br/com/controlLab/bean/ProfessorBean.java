package br.com.controlLab.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.controlLab.dao.DaoProfessor;
import br.com.controlLab.enums.EnumFlAtivo;
import br.com.controlLab.modelo.Professor;

@ManagedBean(name="professorBean")
@RequestScoped
public class ProfessorBean extends ApplicationControllerMB
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3698003524789796204L;
	//@ManagedProperty("#{daoProfessor}")
	private DaoProfessor daoProfessor;
	private EnumFlAtivo enumFlAtivo;
	private EnumFlAtivo[] enumFlAtivos;
	
	public EnumFlAtivo[] getEnumFlAtivos() {
		return enumFlAtivo.values();
	}

	public void setEnumFlAtivos(EnumFlAtivo[] enumFlAtivos) {
		this.enumFlAtivos = enumFlAtivos;
	}

	public DaoProfessor getDaoProfessor() {
		return daoProfessor;
	}

	public void setDaoProfessor(DaoProfessor daoProfessor) {
		this.daoProfessor = daoProfessor;
	}

	private Professor professor;
	
	@PostConstruct
	private void init(){
		professor = new Professor();
		daoProfessor = new DaoProfessor();
	}	
	
	@Override
	public String imprimir() throws Exception {
		// TODO Auto-generated method stub
		this.professor = daoProfessor.find(this.professor.getMatricula());
		//professor.
		return null;
	}

	@Override
	public String validar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String salvar() throws Exception {
		// TODO Auto-generated method stub
		String result = daoProfessor.insert(this.professor);
		System.out.println(result);
		this.professor = new Professor();
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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public EnumFlAtivo getEnumFlAtivo() {
		return enumFlAtivo;
	}

	public void setEnumFlAtivo(EnumFlAtivo enumFlAtivo) {
		this.enumFlAtivo = enumFlAtivo;
	}
}
