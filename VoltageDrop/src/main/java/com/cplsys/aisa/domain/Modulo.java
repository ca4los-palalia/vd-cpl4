package com.cplsys.aisa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Modulo implements Serializable {
    
    private static final long serialVersionUID = -3583988197843072663L;
    
    private Long              idModulo;
    private Long              serial;
    private Date              validUntil;
    private String            productName;
    private String            imageLocation;
    
    private Boolean           isParent;
    private Modulo            modulo;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdModulo() {
	return idModulo;
    }
    
    public void setIdModulo(Long idModulo) {
	this.idModulo = idModulo;
    }
    
    @Column
    public Long getSerial() {
	return serial;
    }
    
    public void setSerial(Long serial) {
	this.serial = serial;
    }
    
    @Column
    @Temporal(TemporalType.DATE)
    public Date getValidUntil() {
	return validUntil;
    }
    
    public void setValidUntil(Date validUntil) {
	this.validUntil = validUntil;
    }
    
    @Column
    public String getProductName() {
	return productName;
    }
    
    public void setProductName(String productName) {
	this.productName = productName;
    }
    
    @Column
    public String getImageLocation() {
	return imageLocation;
    }
    
    public void setImageLocation(String imageLocation) {
	this.imageLocation = imageLocation;
    }
    
    @Column
    public Boolean getIsParent() {
	return isParent;
    }
    
    public void setIsParent(Boolean isParent) {
	this.isParent = isParent;
    }
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "modulo")
    public Modulo getModulo() {
	return modulo;
    }
    
    public void setModulo(Modulo modulo) {
	this.modulo = modulo;
    }
    
}
