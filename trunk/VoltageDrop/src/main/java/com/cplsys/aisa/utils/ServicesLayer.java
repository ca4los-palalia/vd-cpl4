package com.cplsys.aisa.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.services.ModuloService;

@Service
public class ServicesLayer {
	@Autowired
	private ModuloService moduloService;

	public ModuloService getModuloService() {
		return moduloService;
	}

	public void setModuloService(ModuloService moduloService) {
		this.moduloService = moduloService;
	}

}
