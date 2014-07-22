package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.CircuitLenghtDAO;
import com.cplsys.aisa.domain.CircuitLenght;

@Service
public class CircuitLenghtService {

	@Autowired
	private CircuitLenghtDAO circuitLenghtDAO;

	void save(CircuitLenght circuitLenght){
		circuitLenghtDAO.save(circuitLenght);
	}

	void delete(CircuitLenght circuitLenght){
		circuitLenghtDAO.delete(circuitLenght);
	}

	public List<CircuitLenght> getAll(){
		return circuitLenghtDAO.getAll();
	}
	
	public CircuitLenght getById(Long idCircuitLenght){
		return circuitLenghtDAO.getById(idCircuitLenght);
	}
	
	public CircuitLenght getByNombre(String nombre){
		return circuitLenghtDAO.getByNombre(nombre);
	}
	
}
