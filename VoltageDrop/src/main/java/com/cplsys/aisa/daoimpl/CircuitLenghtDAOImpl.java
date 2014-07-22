package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.CircuitLenghtDAO;
import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class CircuitLenghtDAOImpl extends HibernateDAOSuportUtil implements CircuitLenghtDAO {

	@Transactional
	@Override
	public void save(CircuitLenght circuitLenght) {
		getHibernateTemplate().saveOrUpdate(circuitLenght);
	}

	@Transactional
	@Override
	public void delete(CircuitLenght circuitLenght) {
		getHibernateTemplate().delete(circuitLenght);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<CircuitLenght> getAll() {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(CircuitLenght.class);
		List<CircuitLenght> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public CircuitLenght getById(Long idCircuitLenght) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(CircuitLenght.class);
		List<CircuitLenght> lista = criteria.list();
		criteria.add(Restrictions.eq("idCircuitLenght", idCircuitLenght));
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public CircuitLenght getByNombre(String nombre) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(CircuitLenght.class);
		List<CircuitLenght> lista = criteria.list();
		criteria.add(Restrictions.eq("nombre", nombre));
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	
}
