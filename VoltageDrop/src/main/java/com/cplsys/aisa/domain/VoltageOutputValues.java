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
public class VoltageOutputValues implements Serializable {
    
    private static final long serialVersionUID = 2498811809126572035L;
    private Long              idVoltageOutput;
    private String            voltage;
    
    public VoltageOutputValues() {
	
    }
    
    public VoltageOutputValues(String voltage) {
	super();
	this.voltage = voltage;
    }
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdVoltageOutput() {
	return idVoltageOutput;
    }
    
    public void setIdVoltageOutput(Long idVoltageOutput) {
	this.idVoltageOutput = idVoltageOutput;
    }
    
    public String getVoltage() {
	return voltage;
    }
    
    public void setVoltage(String voltage) {
	this.voltage = voltage;
    }
    
}
