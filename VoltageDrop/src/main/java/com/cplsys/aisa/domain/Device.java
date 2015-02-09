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
public class Device implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idDevice;
	private String name;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(Long idDevice) {
		this.idDevice = idDevice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
