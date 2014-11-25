package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.VoltageOutputValuesDAO;
import com.cplsys.aisa.domain.VoltageOutputValues;

@Service
public class VoltageOutputValueService {
    
    @Autowired
    private VoltageOutputValuesDAO voltageOutputValuesDAO;
    
    public void save(final VoltageOutputValues voltageOutputValues) {
	voltageOutputValuesDAO.save(voltageOutputValues);
    }
    
    public List<VoltageOutputValues> getAll() {
	return voltageOutputValuesDAO.getAll();
    }
}
