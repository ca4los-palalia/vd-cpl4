package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.ConduitType;

public interface ConduitTypeDAO {

	void save(ConduitType conduitType);

	void delete(ConduitType conduitType);

	public List<ConduitType> getAll();
	
	public ConduitType getById(Long idConduitType);
	
	public ConduitType getByNombre(String nombre);

}
