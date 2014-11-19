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
public class SystemType implements Serializable {
    
    private static final long serialVersionUID = -1952924447851125974L;
    
    private Long              idSystemType;
    private String            nombre;
    private Integer           valor;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdSystemType() {
	return idSystemType;
    }
    
    public void setIdSystemType(Long idSystemType) {
	this.idSystemType = idSystemType;
    }
    
    @Column
    public String getNombre() {
	return nombre;
    }
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
    
    @Column
    public Integer getValor() {
	return valor;
    }
    
    public void setValor(Integer valor) {
	this.valor = valor;
    }
    
}
