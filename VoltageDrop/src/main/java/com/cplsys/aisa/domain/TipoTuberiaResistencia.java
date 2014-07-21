package com.cplsys.aisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class TipoTuberiaResistencia implements Serializable {

	private static final long serialVersionUID = -5825791060809404499L;
	private Long idTipoTuberiaResistencia;
	private String nombre;
	private TipoMaterialResistencia tipoMaterialResistencia;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdTipoTuberiaResistencia() {
		return idTipoTuberiaResistencia;
	}

	public void setIdTipoTuberiaResistencia(Long idTipoTuberiaResistencia) {
		this.idTipoTuberiaResistencia = idTipoTuberiaResistencia;
	}

	@Column
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipoMaterialResistencia")
	public TipoMaterialResistencia getTipoMaterialResistencia() {
		return tipoMaterialResistencia;
	}

	public void setTipoMaterialResistencia(
			TipoMaterialResistencia tipoMaterialResistencia) {
		this.tipoMaterialResistencia = tipoMaterialResistencia;
	}

}
