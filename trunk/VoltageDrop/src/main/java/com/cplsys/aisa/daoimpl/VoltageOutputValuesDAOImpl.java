package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.dao.VoltageOutputValuesDAO;
import com.cplsys.aisa.domain.VoltageOutputValues;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class VoltageOutputValuesDAOImpl extends HibernateDAOSuportUtil implements VoltageOutputValuesDAO {
    
    @Override
    public void save(VoltageOutputValues voltageOutputValues) {
	getHibernateTemplate().save(voltageOutputValues);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<VoltageOutputValues> getAll() {
	return getHibernateTemplate().find("FROM VoltageOutputValues as v ");
    }
    
}
