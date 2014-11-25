package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.MotorProtectorTypeDAO;
import com.cplsys.aisa.domain.MotorProtectorTypes;

@Service
public class MotorProtectorTypeService {
    
    @Autowired
    private MotorProtectorTypeDAO motorProtectorTypeDAO;
    
    public void save(final MotorProtectorTypes motorProtectorType) {
	motorProtectorTypeDAO.save(motorProtectorType);
    }
    
    public List<MotorProtectorTypes> getAll() {
	return motorProtectorTypeDAO.getAll();
    }
}
