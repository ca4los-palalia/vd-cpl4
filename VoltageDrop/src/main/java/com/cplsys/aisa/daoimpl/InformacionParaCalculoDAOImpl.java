package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.InformacionParaCalculoDAO;
import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.domain.ConductorType;
import com.cplsys.aisa.domain.ConduitType;
import com.cplsys.aisa.domain.InformacionParaCalculo;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class InformacionParaCalculoDAOImpl extends HibernateDAOSuportUtil implements InformacionParaCalculoDAO {

	@Transactional
	@Override
	public void save(InformacionParaCalculo informacionParaCalculo) {
		getHibernateTemplate().saveOrUpdate(informacionParaCalculo);
	}

	@Transactional
	@Override
	public void delete(InformacionParaCalculo informacionParaCalculo) {
		getHibernateTemplate().delete(informacionParaCalculo);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<InformacionParaCalculo> getAll() {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(InformacionParaCalculo.class);
		List<InformacionParaCalculo> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public InformacionParaCalculo getById(Long informacionParaCalculoId) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(InformacionParaCalculo.class);
		criteria.add(Restrictions.eq("InformacionParaCalculoId", informacionParaCalculoId));
		List<InformacionParaCalculo> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public InformacionParaCalculo getInformacionCalculo(
			ConductorSize conductorSize, ConductorType conductorType,
			ConduitType conduitType, CircuitLenght circuitLenght) {
		
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(InformacionParaCalculo.class);
		
		criteria.add(Restrictions.eq("conductorSize", conductorSize));
		criteria.add(Restrictions.eq("conductorType", conductorType));
		criteria.add(Restrictions.eq("conduitType", conduitType));
		criteria.add(Restrictions.eq("circuitLenght", circuitLenght));
		List<InformacionParaCalculo> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

}
