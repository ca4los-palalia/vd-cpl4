package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.Coil;

public interface CoilDAO {
    
    void save(Coil coil);
    
    void delete(Coil coil);
    
    List<Coil> getAll();
    
}
