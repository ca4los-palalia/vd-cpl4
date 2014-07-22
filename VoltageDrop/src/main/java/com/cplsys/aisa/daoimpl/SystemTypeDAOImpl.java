package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.SystemTypeDAO;
import com.cplsys.aisa.domain.SystemType;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class SystemTypeDAOImpl extends HibernateDAOSuportUtil implements SystemTypeDAO {

	@Transactional
	@Override
	public void save(SystemType systemType) {
		getHibernateTemplate().saveOrUpdate(systemType);
	}

	@Transactional
	@Override
	public void delete(SystemType systemType) {
		getHibernateTemplate().delete(systemType);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<SystemType> getAll() {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(SystemType.class);
		List<SystemType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public SystemType getById(Long idSystemType) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(SystemType.class);
		List<SystemType> lista = criteria.list();
		criteria.add(Restrictions.eq("idSystemType", idSystemType));
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public SystemType getByNombre(String nombre) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(SystemType.class);
		List<SystemType> lista = criteria.list();
		criteria.add(Restrictions.eq("nombre", nombre));
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	
}
