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
public class ConductorSize implements Serializable {

	private static final long serialVersionUID = 7126010135543281710L;

	private Long idConductorSize;
	private String nombre;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdConductorSize() {
		return idConductorSize;
	}
	
	public void setIdConductorSize(Long idConductorSize) {
		this.idConductorSize = idConductorSize;
	}
	
	@Column
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
