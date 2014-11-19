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
public class TipoMaterialResistencia implements Serializable {
    
    private static final long serialVersionUID = 5318545160364805361L;
    private Long              idTipoMaterial;
    private String            nombre;
    private Resistencia       resistencia;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdTipoMaterial() {
	return idTipoMaterial;
    }
    
    public void setIdTipoMaterial(Long idTipoMaterial) {
	this.idTipoMaterial = idTipoMaterial;
    }
    
    @Column
    public String getNombre() {
	return nombre;
    }
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resistencia")
    public Resistencia getResistencia() {
	return resistencia;
    }
    
    public void setResistencia(Resistencia resistencia) {
	this.resistencia = resistencia;
    }
    
}
