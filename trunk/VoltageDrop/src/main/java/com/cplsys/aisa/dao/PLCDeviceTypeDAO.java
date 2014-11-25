package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.PLCDeviceType;


public interface PLCDeviceTypeDAO {

    void save(PLCDeviceType plcDeviceType);

    List<PLCDeviceType> getAll();
    
}
