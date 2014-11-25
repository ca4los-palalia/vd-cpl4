package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.dao.VoltageInputValuesDAO;
import com.cplsys.aisa.domain.VoltageInputValues;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class VoltageInputValuesDAOImpl extends HibernateDAOSuportUtil implements VoltageInputValuesDAO {
    
    @SuppressWarnings("unchecked")
    @Override
    public List<VoltageInputValues> getAll() {
	return getHibernateTemplate().find("FROM VoltageInputValues as v");
    }
    
    @Override
    public void save(VoltageInputValues voltageInputValues) {
	getHibernateTemplate().save(voltageInputValues);
    }
    
}
