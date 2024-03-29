package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.ModuloDAO;
import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class ModuloDAOImpl extends HibernateDAOSuportUtil implements ModuloDAO {
    
    @Transactional
    @Override
    public void save(Modulo modulo) {
	getHibernateTemplate().saveOrUpdate(modulo);
    }
    
    @Transactional
    @Override
    public void delete(Modulo modulo) {
	getHibernateTemplate().delete(modulo);
    }
    
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Modulo> getAll() {
	List<Modulo> modulos = getHibernateTemplate().find("FROM Modulo as m");
	return modulos.size() > 0 ? modulos : null;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Modulo> getChildren(Modulo modulo) {
	List<Modulo> modulos = getHibernateTemplate().find("FROM Modulo as m WHERE m.modulo = ?", modulo);
	return modulos.size() > 0 ? modulos : null;
    }
    
}
