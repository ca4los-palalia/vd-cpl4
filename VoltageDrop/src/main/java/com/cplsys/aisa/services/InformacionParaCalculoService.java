package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.InformacionParaCalculoDAO;
import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.domain.ConductorType;
import com.cplsys.aisa.domain.ConduitType;
import com.cplsys.aisa.domain.InformacionParaCalculo;

@Service
public class InformacionParaCalculoService {

	@Autowired
	private InformacionParaCalculoDAO informacionParaCalculoDAO;

	public void save(final InformacionParaCalculo informacionParaCalculo) {
		informacionParaCalculoDAO.save(informacionParaCalculo);
	}

	public void delete(final InformacionParaCalculo informacionParaCalculo) {
		informacionParaCalculoDAO.delete(informacionParaCalculo);
	}

	public List<InformacionParaCalculo> getAll(){
		return informacionParaCalculoDAO.getAll();
	}

	public InformacionParaCalculo getById(Long informacionParaCalculoId){
		return informacionParaCalculoDAO.getById(informacionParaCalculoId);
	}

	public InformacionParaCalculo getInformacionCalculo(ConductorSize conductorSize,
			ConductorType conductorType, ConduitType conduitType, CircuitLenght circuitLenght){
		return informacionParaCalculoDAO.getInformacionCalculo(conductorSize, conductorType, conduitType, circuitLenght);
	}
}
