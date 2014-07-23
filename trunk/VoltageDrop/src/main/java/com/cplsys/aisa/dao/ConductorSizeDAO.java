package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.ConductorSize;

public interface ConductorSizeDAO {

	void save(ConductorSize conductorSize);

	void delete(ConductorSize conductorSize);

	public List<ConductorSize> getAll();
	
	public String[] getAllOnlyNombres();
	
	public ConductorSize getById(Long idConductorSize);
	
	public ConductorSize getByNombre(String nombre);

}
