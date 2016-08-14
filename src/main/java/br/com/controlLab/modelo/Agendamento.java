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
	@NamedQuery(name=Agendamento.FIND_ALL, query="select a from Agendamento a")
})
@Entity
@Table(name="TB_AGENDAMENTO")
public class Agendamento {
	
	public static final String FIND_ALL = "Agendamento.findAll";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="ST_AGENDAMENTO", length=100)
	private String statusAgendamento;
	@Column(name="OBSERVACAO", length=500)
	private String observacao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INSERT")
	private Date dtInsert;
	@Temporal(TemporalType.DATE)
	@Column(name="DT_UPDATE")
	private Date dtUpdate;
	
	public Agendamento(){
		super();
	}
	
	public Agendamento(String status, String obs, Date dtInclud, Date dtAlter){
		super();
		this.statusAgendamento = status;
		this.observacao = obs;
		this.dtInsert = dtInclud;
		this.dtUpdate = dtAlter;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatusAgendamento() {
		return statusAgendamento;
	}
	public void setStatusAgendamento(String statusAgendamento) {
		this.statusAgendamento = statusAgendamento;
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

}
