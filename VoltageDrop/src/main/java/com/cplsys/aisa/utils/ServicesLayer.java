package com.cplsys.aisa.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.services.CircuitLenghtService;
import com.cplsys.aisa.services.ConductorSizeService;
import com.cplsys.aisa.services.ConductorTypeService;
import com.cplsys.aisa.services.ConduitTypeService;
import com.cplsys.aisa.services.InformacionParaCalculoService;
import com.cplsys.aisa.services.ModuloService;
import com.cplsys.aisa.services.SystemTypeService;

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

	public ModuloService getModuloService() {
		return moduloService;
	}

	public void setModuloService(ModuloService moduloService) {
		this.moduloService = moduloService;
	}

	public CircuitLenghtService getCircuitLenghtService() {
		return circuitLenghtService;
	}

	public void setCircuitLenghtService(CircuitLenghtService circuitLenghtService) {
		this.circuitLenghtService = circuitLenghtService;
	}

	public ConductorSizeService getConductorSizeService() {
		return conductorSizeService;
	}

	public void setConductorSizeService(ConductorSizeService conductorSizeService) {
		this.conductorSizeService = conductorSizeService;
	}

	public ConductorTypeService getConductorTypeService() {
		return conductorTypeService;
	}

	public void setConductorTypeService(ConductorTypeService conductorTypeService) {
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
	
	
}
