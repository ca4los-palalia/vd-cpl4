package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.dao.MotorProtectorTypeDAO;
import com.cplsys.aisa.domain.MotorProtectorTypes;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class MotorProtectorDAOImpl extends HibernateDAOSuportUtil implements MotorProtectorTypeDAO {
    
    @Override
    public void save(MotorProtectorTypes motorProtectorType) {
	getHibernateTemplate().save(motorProtectorType);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<MotorProtectorTypes> getAll() {
	return getHibernateTemplate().find("FROM MotorProtectorTypes as m");
    }
    
}
