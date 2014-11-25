package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.MotorProtectorTypes;

public interface MotorProtectorTypeDAO {
    
    void save(MotorProtectorTypes motorProtectorType);
    
    List<MotorProtectorTypes> getAll();
    
}
