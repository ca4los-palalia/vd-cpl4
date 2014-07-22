package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.CircuitLenght;

public interface CircuitLenghtDAO {

	void save(CircuitLenght circuitLenght);

	void delete(CircuitLenght circuitLenght);

	public List<CircuitLenght> getAll();
	
	public CircuitLenght getById(Long idCircuitLenght);
	
	public CircuitLenght getByNombre(String nombre);

}
