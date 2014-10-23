package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.domain.ConductorType;
import com.cplsys.aisa.domain.ConduitType;
import com.cplsys.aisa.domain.InformacionParaCalculo;

public interface InformacionParaCalculoDAO {

	public void save(InformacionParaCalculo informacionParaCalculo);

	public void delete(InformacionParaCalculo informacionParaCalculo);

	public List<InformacionParaCalculo> getAll();

	public InformacionParaCalculo getById(Long informacionParaCalculoId);

	public InformacionParaCalculo getInformacionCalculo(ConductorSize conductorSize,
			ConductorType conductorType, ConduitType conduitType, CircuitLenght circuitLenght);
}
