package com.cplsys.aisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class VoltageInputValues implements Serializable {
    
    private static final long serialVersionUID = -4595181885093825970L;
    private Long              idVoltageInputValues;
    private String            voltage;
    
    public VoltageInputValues() {
	
    }
    
    public VoltageInputValues(String voltage) {
	super();
	this.voltage = voltage;
    }
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdVoltageInputValues() {
	return idVoltageInputValues;
    }
    
    public void setIdVoltageInputValues(Long idVoltageInputValues) {
	this.idVoltageInputValues = idVoltageInputValues;
    }
    
    @Column
    public String getVoltage() {
	return voltage;
    }
    
    public void setVoltage(String voltage) {
	this.voltage = voltage;
    }
    
}
