package com.cplsys.aisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class ReactanciaXLInformacion implements Serializable  {

	private static final long serialVersionUID = -5291840896561813339L;
	
	private Long idReactanciaXLInformacion;
	private ConduitType conduitType;
	private ConductorSize conductorSize;
	private Float valor;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdReactanciaXLInformacion() {
		return idReactanciaXLInformacion;
	}
	public void setIdReactanciaXLInformacion(Long idReactanciaXLInformacion) {
		this.idReactanciaXLInformacion = idReactanciaXLInformacion;
	}
	@OneToOne
	@JoinColumn(name = "conduitType")
	public ConduitType getConduitType() {
		return conduitType;
	}
	public void setConduitType(ConduitType conduitType) {
		this.conduitType = conduitType;
	}
	@OneToOne
	@JoinColumn(name = "conductorSize")
	public ConductorSize getConductorSize() {
		return conductorSize;
	}
	public void setConductorSize(ConductorSize conductorSize) {
		this.conductorSize = conductorSize;
	}
	@Column
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	
}
