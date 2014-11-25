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
public class MotorProtectorTypes implements Serializable {
    
    private static final long serialVersionUID = 6954771322173337798L;
    private Long              idMotorProtector;
    private String            name;
    
    public MotorProtectorTypes() {
	
    }
    
    public MotorProtectorTypes(String name) {
	super();
	this.name = name;
    }
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdMotorProtector() {
	return idMotorProtector;
    }
    
    public void setIdMotorProtector(Long idMotorProtector) {
	this.idMotorProtector = idMotorProtector;
    }
    
    @Column
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
}
