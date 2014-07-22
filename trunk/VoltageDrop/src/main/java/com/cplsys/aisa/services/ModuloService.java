package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.ModuloDAO;
import com.cplsys.aisa.domain.Modulo;

@Service
public class ModuloService {

	@Autowired
	private ModuloDAO moduloDAO;

	public void save(final Modulo modulo) {
		moduloDAO.save(modulo);
	}

	public void delete(final Modulo modulo) {
		moduloDAO.delete(modulo);
	}

	public List<Modulo> getAll() {
		return moduloDAO.getAll();
	}
}
