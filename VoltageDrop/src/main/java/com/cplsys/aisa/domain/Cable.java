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
public class Cable implements Serializable {

	private static final long serialVersionUID = -5395974410802164778L;
	private Long idCable;
	private String conductorSize;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdCable() {
		return idCable;
	}

	public void setIdCable(Long idCable) {
		this.idCable = idCable;
	}

	@Column
	public String getConductorSize() {
		return conductorSize;
	}

	public void setConductorSize(String conductorSize) {
		this.conductorSize = conductorSize;
	}

}
