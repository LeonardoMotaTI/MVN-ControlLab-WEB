package br.com.controlLab.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.controlLab.enums.EnumFlAtivo;

@NamedQueries({
	@NamedQuery(name=Usuario.FIND_ALL, query="Select U from Usuario U")
})

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	protected static final String FIND_ALL = "Usuario.findAll";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NOME", length=100)
	private String nome;
		
	@Column(name="LOGIN", length=100)
	private String login;
	
	@Column(name="SENHA", length=100)
	private String senha;
	
	@Column(name="ULTIMA_SENHA", length=100)
	private String ultimaSenha;
	
	@Column(name="EMAIL", length=200)
	private String email;
	
	@Column(name="OBSERVACAO", length=200)
	private String observacao;
		
	@Column(name="FL_ATIVO")
	private EnumFlAtivo ativo;	
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INSERT")
	private Date dtInsert;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_UPDATE")
	private Date dtUpdate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATIVACAO")
	private Date dtAtivacao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_DESATIVACAO")
	private Date dtDesativacao;
	
	public Usuario(){
		super();
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUltimaSenha() {
		return ultimaSenha;
	}

	public void setUltimaSenha(String ultimaSenha) {
		this.ultimaSenha = ultimaSenha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	@Enumerated(EnumType.ORDINAL)
	public EnumFlAtivo getAtivo() {
		return ativo;
	}

	public void setAtivo(EnumFlAtivo ativo) {
		this.ativo = ativo;
	}

	public Date getDtInsert() {
		return dtInsert;
	}

	public void setDtInsert(Date dtInsert) {
		this.dtInsert = dtInsert;
	}

	public Date getDtUpdate() {
		return dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

	public Date getDtAtivacao() {
		return dtAtivacao;
	}

	public void setDtAtivacao(Date dtAtivacao) {
		this.dtAtivacao = dtAtivacao;
	}

	public Date getDtDesativacao() {
		return dtDesativacao;
	}

	public void setDtDesativacao(Date dtDesativacao) {
		this.dtDesativacao = dtDesativacao;
	}
	
}
