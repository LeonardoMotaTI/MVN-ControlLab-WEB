package br.com.controlLab.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TbProfessor 
{
	@Id
	@GeneratedValue	
	private Integer id;
	
	private String nome;
	private String sobreNome;
	private String matricula;
	private String email;
	private int ativo;
	private String telefone;
	private String observacao;
	private String Login;
	private String senha;
	private String foto;
		
	@Temporal(TemporalType.DATE)
	private Calendar dtInsert = Calendar.getInstance();
	@Temporal(TemporalType.DATE)
	private Calendar dtUpdate = Calendar.getInstance();
	@Temporal(TemporalType.DATE)
	private Calendar dtAtivacao = Calendar.getInstance();
	
	public TbProfessor(){		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Calendar getDtInsert() {
		return dtInsert;
	}
	public void setDtInsert(Calendar dtInsert) {
		this.dtInsert = dtInsert;
	}
	public Calendar getDtUpdate() {
		return dtUpdate;
	}
	public void setDtUpdate(Calendar dtUpdate) {
		this.dtUpdate = dtUpdate;
	}
	public Calendar getDtAtivacao() {
		return dtAtivacao;
	}
	public void setDtAtivacao(Calendar dtAtivacao) {
		this.dtAtivacao = dtAtivacao;
	}
	
	

}
