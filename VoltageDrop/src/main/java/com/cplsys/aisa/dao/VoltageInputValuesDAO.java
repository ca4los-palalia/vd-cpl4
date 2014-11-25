package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.VoltageInputValues;


public interface VoltageInputValuesDAO {

    List<VoltageInputValues> getAll();

    void save(VoltageInputValues voltageInputValues);
    
}
