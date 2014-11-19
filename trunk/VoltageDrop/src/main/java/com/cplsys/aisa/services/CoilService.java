package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.CoilDAO;
import com.cplsys.aisa.domain.Coil;

@Service
public class CoilService {
    
    @Autowired
    private CoilDAO coilDAO;
    
    public void save(final Coil coil) {
	coilDAO.save(coil);
    }
    
    public void delete(final Coil coil) {
	coilDAO.delete(coil);
    }
    
    public List<Coil> getAll() {
	return coilDAO.getAll();
    }
    
}
