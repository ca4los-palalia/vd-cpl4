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
public class PLCDeviceType implements Serializable {
    
    private static final long serialVersionUID = -2598852058173267482L;
    private Long              idPLCDevice;
    private String            name;
    
    public PLCDeviceType() {
	
    }
    
    public PLCDeviceType(String name) {
	super();
	this.name = name;
    }
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdPLCDevice() {
	return idPLCDevice;
    }
    
    public void setIdPLCDevice(Long idPLCDevice) {
	this.idPLCDevice = idPLCDevice;
    }
    
    @Column
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
}
