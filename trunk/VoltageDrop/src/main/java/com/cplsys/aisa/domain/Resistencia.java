package com.cplsys.aisa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Resistencia {
    
    private Long  idResistencia;
    private Float ohmXFt;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdResistencia() {
	return idResistencia;
    }
    
    public void setIdResistencia(Long idResistencia) {
	this.idResistencia = idResistencia;
    }
    
    @Column
    public Float getOhmXFt() {
	return ohmXFt;
    }
    
    public void setOhmXFt(Float ohmXFt) {
	this.ohmXFt = ohmXFt;
    }
    
}
