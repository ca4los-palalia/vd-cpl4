package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.dao.PLCDeviceTypeDAO;
import com.cplsys.aisa.domain.PLCDeviceType;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;


@Repository
public class PLCDeviceTypeDAOImpl extends HibernateDAOSuportUtil implements PLCDeviceTypeDAO {
    
    @Override
    public void save(PLCDeviceType plcDeviceType) {
	getHibernateTemplate().save(plcDeviceType);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<PLCDeviceType> getAll() {
	return getHibernateTemplate().find("FROM PLCDeviceType as p");
    }
    
}
