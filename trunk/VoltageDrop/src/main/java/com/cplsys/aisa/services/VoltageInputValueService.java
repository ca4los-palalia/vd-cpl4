package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.VoltageInputValuesDAO;
import com.cplsys.aisa.domain.VoltageInputValues;

@Service
public class VoltageInputValueService {
    
    @Autowired
    private VoltageInputValuesDAO voltageInputValuesDAO;
    
    public void save(final VoltageInputValues voltageInputValues) {
	voltageInputValuesDAO.save(voltageInputValues);
    }
    
    public List<VoltageInputValues> getAll() {
	return voltageInputValuesDAO.getAll();
    }
}
