package br.com.controlLab.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name=Disciplina.FIND_ALL, query="select d from Disciplina d")
})
@Entity
@Table(name="TB_DISCIPLINA")
public class Disciplina {
	
	public static final String FIND_ALL = "Disciplina.findAll";
	
	public Disciplina() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Disciplina(String desc, Date dtInsert, Date dtUpdate){
		super();
		this.descricao = desc;
		this.dtInsert = dtInsert;
		this.dtUpdate = dtUpdate;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DESCRICAO", length=100)
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INSERT")
	private Date dtInsert;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_UPDATE")
	private Date dtUpdate;

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

}
