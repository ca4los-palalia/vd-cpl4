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
public class TipoTuberiaRectancia implements Serializable {

	private static final long serialVersionUID = 1972438060369815708L;
	private Long idTipoTuberiaRectancia;
	private String nombre;
	private Rectancia rectancia;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdTipoTuberiaRectancia() {
		return idTipoTuberiaRectancia;
	}

	public void setIdTipoTuberiaRectancia(Long idTipoTuberiaRectancia) {
		this.idTipoTuberiaRectancia = idTipoTuberiaRectancia;
	}

	@Column
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column
	public Rectancia getRectancia() {
		return rectancia;
	}

	public void setRectancia(Rectancia rectancia) {
		this.rectancia = rectancia;
	}

}
