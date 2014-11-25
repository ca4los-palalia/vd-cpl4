package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.PLCDeviceTypeDAO;
import com.cplsys.aisa.domain.PLCDeviceType;

@Service
public class PLCDeviceTypeService {
    
    @Autowired
    private PLCDeviceTypeDAO plcDeviceDAO;
    
    public void save(final PLCDeviceType plcDeviceType) {
	plcDeviceDAO.save(plcDeviceType);
    }
    
    public List<PLCDeviceType> getAll() {
	return plcDeviceDAO.getAll();
    }
    
}
