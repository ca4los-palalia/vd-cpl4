package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.ConductorTypeDAO;
import com.cplsys.aisa.domain.ConductorType;

@Service
public class ConductorTypeService {

	@Autowired
	private ConductorTypeDAO conductorTypeDAO;

	public void save(ConductorType conductorType){
		conductorTypeDAO.save(conductorType);
	}

	public void delete(ConductorType conductorType){
		conductorTypeDAO.delete(conductorType);
	}

	public List<ConductorType> getAll(){
		return conductorTypeDAO.getAll();
	}
	
	public String[] getAllOnlyNombres(){
		return conductorTypeDAO.getAllOnlyNombres();
	}
	
	public ConductorType getById(Long idConductorType){
		return conductorTypeDAO.getById(idConductorType);
	}
	
	public ConductorType getByNombre(String nombre){
		return conductorTypeDAO.getByNombre(nombre);
	}
	
}
