package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.SystemTypeDAO;
import com.cplsys.aisa.domain.SystemType;

@Service
public class SystemTypeService {

	@Autowired
	private SystemTypeDAO systemTypeDAO;

	void save(SystemType systemType){
		systemTypeDAO.save(systemType);
	}

	void delete(SystemType systemType){
		systemTypeDAO.delete(systemType);
	}

	public List<SystemType> getAll(){
		return systemTypeDAO.getAll();
	}
	
	public String[] getAllOnlyNombres(){
		return systemTypeDAO.getAllOnlyNombres();
	}
	
	public SystemType getById(Long idSystemType){
		return systemTypeDAO.getById(idSystemType);
	}
	
	public SystemType getByNombre(String nombre){
		return systemTypeDAO.getByNombre(nombre);
	}
	
}
