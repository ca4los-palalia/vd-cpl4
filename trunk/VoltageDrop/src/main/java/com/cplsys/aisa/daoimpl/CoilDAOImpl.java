package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.dao.CoilDAO;
import com.cplsys.aisa.domain.Coil;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class CoilDAOImpl extends HibernateDAOSuportUtil implements CoilDAO {
    
    @Override
    public void save(Coil coil) {
	getHibernateTemplate().save(coil);
    }
    
    @Override
    public void delete(Coil coil) {
	getHibernateTemplate().delete(coil);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Coil> getAll() {
	return getHibernateTemplate().find("FROM Coil as c");
    }
    
}
