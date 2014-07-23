package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.ConduitTypeDAO;
import com.cplsys.aisa.domain.ConduitType;

@Service
public class ConduitTypeService {

	@Autowired
	private ConduitTypeDAO conduitTypeDAO;

	void save(ConduitType conduitType){
		conduitTypeDAO.save(conduitType);
	}

	void delete(ConduitType conduitType){
		conduitTypeDAO.delete(conduitType);
	}

	public List<ConduitType> getAll(){
		return conduitTypeDAO.getAll();
	}
	
	public String[] getAllOnlyNombres(){
		return conduitTypeDAO.getAllOnlyNombres();
	}
	
	public ConduitType getById(Long idConduitType){
		return conduitTypeDAO.getById(idConduitType);
	}
	
	public ConduitType getByNombre(String nombre){
		return conduitTypeDAO.getByNombre(nombre);
	}
	
}
