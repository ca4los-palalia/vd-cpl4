package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.ConduitTypeDAO;
import com.cplsys.aisa.domain.ConduitType;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class ConduitTypeDAOImpl extends HibernateDAOSuportUtil implements ConduitTypeDAO {

	@Transactional
	@Override
	public void save(ConduitType conduitType) {
		getHibernateTemplate().saveOrUpdate(conduitType);
	}

	@Transactional
	@Override
	public void delete(ConduitType conduitType) {
		getHibernateTemplate().delete(conduitType);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<ConduitType> getAll() {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConduitType.class);
		List<ConduitType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public ConduitType getById(Long idConduitType) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConduitType.class);
		List<ConduitType> lista = criteria.list();
		criteria.add(Restrictions.eq("idConduitType", idConduitType));
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public ConduitType getByNombre(String nombre) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConduitType.class);
		List<ConduitType> lista = criteria.list();
		criteria.add(Restrictions.eq("nombre", nombre));
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	
}
