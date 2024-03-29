package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.ConductorSizeDAO;
import com.cplsys.aisa.domain.ConductorSize;

@Service
public class ConductorSizeService {

	@Autowired
	private ConductorSizeDAO conductorSizeDAO;

	public void save(ConductorSize conductorSize){
		conductorSizeDAO.save(conductorSize);
	}

	public void delete(ConductorSize conductorSize){
		conductorSizeDAO.delete(conductorSize);
	}

	public List<ConductorSize> getAll(){
		return conductorSizeDAO.getAll();
	}
	
	public String[] getAllOnlyNombres(){
		return conductorSizeDAO.getAllOnlyNombres();
	}
	
	public ConductorSize getById(Long idConductorSize){
		return conductorSizeDAO.getById(idConductorSize);
	}
	
	public ConductorSize getByNombre(String nombre){
		return conductorSizeDAO.getByNombre(nombre);
	}
	
}
