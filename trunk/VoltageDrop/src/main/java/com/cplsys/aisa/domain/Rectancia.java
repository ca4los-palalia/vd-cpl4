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
public class Rectancia implements Serializable {
    
    private static final long serialVersionUID = 6973982733779781473L;
    
    private Long              idRectancia;
    private String            nombre;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdRectancia() {
	return idRectancia;
    }
    
    public void setIdRectancia(Long idRectancia) {
	this.idRectancia = idRectancia;
    }
    
    @Column
    public String getNombre() {
	return nombre;
    }
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
    
}
