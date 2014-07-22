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
public class CircuitLenght  implements Serializable{

	private static final long serialVersionUID = 4894104629298196953L;

	private Long idCircuitLenght;
	private String nombre;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdCircuitLenght() {
		return idCircuitLenght;
	}
	
	public void setIdCircuitLenght(Long idCircuitLenght) {
		this.idCircuitLenght = idCircuitLenght;
	}
	
	@Column
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
