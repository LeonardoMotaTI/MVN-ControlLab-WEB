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
	@NamedQuery(name=Laboratorio.FIND_ALL, query="Select L from Laboratorio L")
})

@Entity
@Table(name="TB_LABORATORIO")
public class Laboratorio {
	
	protected static final String FIND_ALL = "Laboratorio.findAll";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DESCRICAO", length=200)
	private String descricao;
	
	@Column(name="NUMERO")
	private long numero;
	
	@Column(name="LOCALIZACAO", length=200)
	private String localizacao;
	
	@Column(name="QTD_MAQUINAS")
	private int qtdMaquinas;
	
	@Column(name="FL_ATIVO")
	private EnumFlAtivo ativo;
	
	@Column(name="OBSERVACAO", length=200)
	private String observacao;
	
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
	
	public Laboratorio(){
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getQtdMaquinas() {
		return qtdMaquinas;
	}

	public void setQtdMaquinas(int qtdMaquinas) {
		this.qtdMaquinas = qtdMaquinas;
	}
	@Enumerated(EnumType.ORDINAL)
	public EnumFlAtivo getAtivo() {
		return ativo;
	}

	public void setAtivo(EnumFlAtivo ativo) {
		this.ativo = ativo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
