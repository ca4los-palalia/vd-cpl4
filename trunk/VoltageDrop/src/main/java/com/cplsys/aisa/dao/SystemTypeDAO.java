package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.SystemType;

public interface SystemTypeDAO {

	void save(SystemType systemType);

	void delete(SystemType systemType);

	public List<SystemType> getAll();
	
	public String[] getAllOnlyNombres();
	
	public SystemType getById(final Long idSystemType);
	
	public SystemType getByNombre(final String nombre);

}
