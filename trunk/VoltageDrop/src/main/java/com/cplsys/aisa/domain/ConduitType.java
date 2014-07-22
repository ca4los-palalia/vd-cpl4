package com.cplsys.aisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ConduitType implements Serializable {

	private static final long serialVersionUID = 6445314862914317L;
	
	private Long idConduitType;
	private String nombre;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdConduitType() {
		return idConduitType;
	}
	
	public void setIdConduitType(Long idConduitType) {
		this.idConduitType = idConduitType;
	}
	
	@Column
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
