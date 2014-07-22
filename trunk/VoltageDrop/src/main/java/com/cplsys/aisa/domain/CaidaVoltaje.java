package com.cplsys.aisa.domain;

import java.io.Serializable;

public class CaidaVoltaje implements Serializable{

	private static final long serialVersionUID = -6672061745800845957L;
	
	private ConduitType conduitType;
	private ConductorType conductorType;
	private SystemType systemType;
	private ConductorSize conductorSize;
	private Integer spinner1;
	private CircuitLenght circuitLenght;
	private Float currentAmper;
	private Integer voltage;
	private Float powerFactor;
	private Float ze;
	private Float voltageDropVolts;
	private Float voltageDropPercentage;
	private Float finalVoltage;
	private String botonCalcular;
	
	public ConduitType getConduitType() {
		return conduitType;
	}
	public void setConduitType(ConduitType conduitType) {
		this.conduitType = conduitType;
	}
	public ConductorType getConductorType() {
		return conductorType;
	}
	public void setConductorType(ConductorType conductorType) {
		this.conductorType = conductorType;
	}
	public SystemType getSystemType() {
		return systemType;
	}
	public void setSystemType(SystemType systemType) {
		this.systemType = systemType;
	}
	public ConductorSize getConductorSize() {
		return conductorSize;
	}
	public void setConductorSize(ConductorSize conductorSize) {
		this.conductorSize = conductorSize;
	}
	public Integer getSpinner1() {
		return spinner1;
	}
	public void setSpinner1(Integer spinner1) {
		this.spinner1 = spinner1;
	}
	public CircuitLenght getCircuitLenght() {
		return circuitLenght;
	}
	public void setCircuitLenght(CircuitLenght circuitLenght) {
		this.circuitLenght = circuitLenght;
	}
	public Float getCurrentAmper() {
		return currentAmper;
	}
	public void setCurrentAmper(Float currentAmper) {
		this.currentAmper = currentAmper;
	}
	public Integer getVoltage() {
		return voltage;
	}
	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}
	public Float getPowerFactor() {
		return powerFactor;
	}
	public void setPowerFactor(Float powerFactor) {
		this.powerFactor = powerFactor;
	}
	public Float getZe() {
		return ze;
	}
	public void setZe(Float ze) {
		this.ze = ze;
	}
	public Float getVoltageDropVolts() {
		return voltageDropVolts;
	}
	public void setVoltageDropVolts(Float voltageDropVolts) {
		this.voltageDropVolts = voltageDropVolts;
	}
	public Float getVoltageDropPercentage() {
		return voltageDropPercentage;
	}
	public void setVoltageDropPercentage(Float voltageDropPercentage) {
		this.voltageDropPercentage = voltageDropPercentage;
	}
	public Float getFinalVoltage() {
		return finalVoltage;
	}
	public void setFinalVoltage(Float finalVoltage) {
		this.finalVoltage = finalVoltage;
	}
	public String getBotonCalcular() {
		return botonCalcular;
	}
	public void setBotonCalcular(String botonCalcular) {
		this.botonCalcular = botonCalcular;
	}
	
	
}
