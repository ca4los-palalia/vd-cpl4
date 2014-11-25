package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.VoltageOutputValues;

public interface VoltageOutputValuesDAO {
    
    void save(VoltageOutputValues voltageOutputValues);
    
    List<VoltageOutputValues> getAll();
    
}
