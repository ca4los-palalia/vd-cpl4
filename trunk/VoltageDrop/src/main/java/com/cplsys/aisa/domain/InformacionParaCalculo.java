package com.cplsys.aisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class InformacionParaCalculo implements Serializable {
    
    private static final long serialVersionUID = 8195516513194447126L;
    private Long              InformacionParaCalculoId;
    private ConductorType     conductorType;
    private ConduitType       conduitType;
    private ConductorSize     conductorSize;
    private CircuitLenght     circuitLenght;
    private Float             valor;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getInformacionParaCalculoId() {
	return InformacionParaCalculoId;
    }
    
    public void setInformacionParaCalculoId(Long informacionParaCalculoId) {
	InformacionParaCalculoId = informacionParaCalculoId;
    }
    
    @OneToOne
    @JoinColumn(name = "conductorType")
    public ConductorType getConductorType() {
	return conductorType;
    }
    
    public void setConductorType(ConductorType conductorType) {
	this.conductorType = conductorType;
    }
    
    @OneToOne
    @JoinColumn(name = "conduitType")
    public ConduitType getConduitType() {
	return conduitType;
    }
    
    public void setConduitType(ConduitType conduitType) {
	this.conduitType = conduitType;
    }
    
    @OneToOne
    @JoinColumn(name = "conductorSize")
    public ConductorSize getConductorSize() {
	return conductorSize;
    }
    
    public void setConductorSize(ConductorSize conductorSize) {
	this.conductorSize = conductorSize;
    }
    
    @Column
    public Float getValor() {
	return valor;
    }
    
    public void setValor(Float valor) {
	this.valor = valor;
    }
    
    @OneToOne
    @JoinColumn(name = "circuitLenght")
    public CircuitLenght getCircuitLenght() {
	return circuitLenght;
    }
    
    public void setCircuitLenght(CircuitLenght circuitLenght) {
	this.circuitLenght = circuitLenght;
    }
    
}
