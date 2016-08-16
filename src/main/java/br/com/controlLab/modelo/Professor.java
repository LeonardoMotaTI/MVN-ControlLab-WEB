package br.com.controlLab.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.controlLab.enums.EnumFlAtivo;


@NamedQueries({
	@NamedQuery(name=Professor.FIND_ALL, query="select p from Professor p")
})
@Entity
@Table(name="TB_PROFESSOR")
public class Professor 
{	
	public static final String FIND_ALL = "Professor.findAll";
	@Id
	//@SequenceGenerator(name="pk_sequence", sequenceName="pk_id_sequence")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pk_sequence")	
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="ID", unique=true, nullable=false)
	private Integer id = 1;
	
	@Column(name="NOME", length=100)
	private String nome;
	
	@Column(name="SOBRE_NOME", length=100)
	private String sobreNome;
	
	@Column(name="MATRICULA", length=100)
	private String matricula;
	
	@Column(name="EMAIL",length=100)
	private String email;
	
	@Column(name="FL_ATIVO")	
	private EnumFlAtivo ativo;
	
	@Column(length=100)
	private String telefone;
	
	@Column(length=100)
	private String observacao;
	
	@Column(length=100)
	private String Login;
	
	@Column(length=100)
	private String senha;
	
	@Column(length=100)
	private String foto;
	
	@Temporal(TemporalType.DATE)
	private Calendar dtInsert = Calendar.getInstance();
	
	@Temporal(TemporalType.DATE)
	private Calendar dtUpdate = Calendar.getInstance();
	
	@Temporal(TemporalType.DATE)
	private Calendar dtAtivacao = Calendar.getInstance();
	
	public Professor(){		
		super();
	}
	
	public Professor(String nome, String sobreNome, String matric, String email, EnumFlAtivo ativo, 
			String fone, String obs, String usu, String senha, String foto, Calendar dtInsert, Calendar dtUpdat, Calendar dtAtiva){
		super();
		this.ativo = ativo;
		this.matricula = matric;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dtAtivacao = dtAtiva;
		this.dtInsert = dtInsert;
		this.dtUpdate = dtUpdat;
		this.email = email;
		this.foto = foto;
		this.Login = usu;
		this.observacao = obs;
		this.senha = senha;
		this.telefone = fone;
	}
	
	public Integer getId() {
		return id;
	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
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
	@Enumerated(EnumType.ORDINAL)
	public EnumFlAtivo getAtivo() {
		return ativo;
	}

	public void setAtivo(EnumFlAtivo ativo) {
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
