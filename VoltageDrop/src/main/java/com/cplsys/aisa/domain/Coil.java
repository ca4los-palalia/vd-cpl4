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
public class Coil implements Serializable {
    
    private static final long serialVersionUID = 2214059889994193835L;
    
    private Long              idCoil;
    private String            range;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdCoil() {
	return idCoil;
    }
    
    public void setIdCoil(Long idCoil) {
	this.idCoil = idCoil;
    }
    
    @Column
    public String getRange() {
	return range;
    }
    
    public void setRange(String range) {
	this.range = range;
    }
    
}
