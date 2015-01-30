package com.cplsys.aisa.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.services.CircuitLenghtService;
import com.cplsys.aisa.services.CoilService;
import com.cplsys.aisa.services.ConductorSizeService;
import com.cplsys.aisa.services.ConductorTypeService;
import com.cplsys.aisa.services.ConduitTypeService;
import com.cplsys.aisa.services.InformacionParaCalculoService;
import com.cplsys.aisa.services.ModuloService;
import com.cplsys.aisa.services.MotorProtectorTypeService;
import com.cplsys.aisa.services.OtherLoadService;
import com.cplsys.aisa.services.PLCDeviceTypeService;
import com.cplsys.aisa.services.SystemTypeService;
import com.cplsys.aisa.services.VoltageInputValueService;
import com.cplsys.aisa.services.VoltageOutputValueService;

@Service
public class ServicesLayer {

	@Autowired
	private ModuloService moduloService;

	@Autowired
	private CircuitLenghtService circuitLenghtService;

	@Autowired
	private ConductorSizeService conductorSizeService;

	@Autowired
	private ConductorTypeService conductorTypeService;

	@Autowired
	private ConduitTypeService conduitTypeService;

	@Autowired
	private SystemTypeService systemTypeService;

	@Autowired
	private InformacionParaCalculoService informacionParaCalculoService;

	@Autowired
	private CoilService coilService;

	@Autowired
	private MotorProtectorTypeService motorProtectorTypeService;

	@Autowired
	private PLCDeviceTypeService plcDeviceTypeService;

	@Autowired
	private VoltageInputValueService voltageInputValueService;

	@Autowired
	private VoltageOutputValueService voltageOutputValueService;
	
	@Autowired
	private OtherLoadService otherLoadService;

	public ModuloService getModuloService() {
		return moduloService;
	}

	public void setModuloService(ModuloService moduloService) {
		this.moduloService = moduloService;
	}

	public CircuitLenghtService getCircuitLenghtService() {
		return circuitLenghtService;
	}

	public void setCircuitLenghtService(
			CircuitLenghtService circuitLenghtService) {
		this.circuitLenghtService = circuitLenghtService;
	}

	public ConductorSizeService getConductorSizeService() {
		return conductorSizeService;
	}

	public void setConductorSizeService(
			ConductorSizeService conductorSizeService) {
		this.conductorSizeService = conductorSizeService;
	}

	public ConductorTypeService getConductorTypeService() {
		return conductorTypeService;
	}

	public void setConductorTypeService(
			ConductorTypeService conductorTypeService) {
		this.conductorTypeService = conductorTypeService;
	}

	public ConduitTypeService getConduitTypeService() {
		return conduitTypeService;
	}

	public void setConduitTypeService(ConduitTypeService conduitTypeService) {
		this.conduitTypeService = conduitTypeService;
	}

	public SystemTypeService getSystemTypeService() {
		return systemTypeService;
	}

	public void setSystemTypeService(SystemTypeService systemTypeService) {
		this.systemTypeService = systemTypeService;
	}

	public InformacionParaCalculoService getInformacionParaCalculoService() {
		return informacionParaCalculoService;
	}

	public void setInformacionParaCalculoService(
			InformacionParaCalculoService informacionParaCalculoService) {
		this.informacionParaCalculoService = informacionParaCalculoService;
	}

	public CoilService getCoilService() {
		return coilService;
	}

	public void setCoilService(CoilService coilService) {
		this.coilService = coilService;
	}

	public MotorProtectorTypeService getMotorProtectorTypeService() {
		return motorProtectorTypeService;
	}

	public PLCDeviceTypeService getPlcDeviceTypeService() {
		return plcDeviceTypeService;
	}

	public VoltageInputValueService getVoltageInputValueService() {
		return voltageInputValueService;
	}

	public OtherLoadService getOtherLoadService() {
		return otherLoadService;
	}

	public VoltageOutputValueService getVoltageOutputValueService() {
		return voltageOutputValueService;
	}
}
