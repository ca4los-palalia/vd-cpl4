package com.cplsys.aisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table
public class ConductorType implements Serializable {

	private Long idConductorType;
	private String nombre;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdConductorType() {
		return idConductorType;
	}
	public void setIdConductorType(Long idConductorType) {
		this.idConductorType = idConductorType;
	}
	@Column
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
