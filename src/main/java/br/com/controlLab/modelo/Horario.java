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
	@NamedQuery(name=Horario.FIND_ALL, query="select h from Horario h")
})
@Entity
@Table(name="TB_HORARIO")
public class Horario {
	
	public static final String FIND_ALL = "Horario.findAll";
	
	public Horario(){
		super();
	}
	
	public Horario(Date hrIni, Date hrFim, Date dtInsert, Date dtUpdate){
		super();
		this.dtInsert = dtInsert;
		this.dtUpdate = dtUpdate;
		this.hrInicio = hrIni;
		this.hrFim = hrFim;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Temporal(TemporalType.TIME)
	@Column(name="HR_INICIO")
	private Date hrInicio = new Date();
	
	@Temporal(TemporalType.TIME)
	@Column(name="HR_FIM")
	private Date hrFim = new Date();
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INSERT")
	private Date dtInsert = new Date();

	@Temporal(TemporalType.DATE)
	@Column(name="DT_UPDATE")
	private Date dtUpdate = new Date();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getHrInicio() {
		return hrInicio;
	}

	public void setHrInicio(Date hrInicio) {
		this.hrInicio = hrInicio;
	}

	public Date getHrFim() {
		return hrFim;
	}

	public void setHrFim(Date hrFim) {
		this.hrFim = hrFim;
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
