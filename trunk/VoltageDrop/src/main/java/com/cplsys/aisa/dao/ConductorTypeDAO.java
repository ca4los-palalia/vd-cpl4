package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.ConductorType;

public interface ConductorTypeDAO {

	void save(ConductorType conductorType);

	void delete(ConductorType conductorType);

	public List<ConductorType> getAll();
	
	public String[] getAllOnlyNombres();
	
	public ConductorType getById(Long idConductorType);
	
	public ConductorType getByNombre(String nombre);

}
