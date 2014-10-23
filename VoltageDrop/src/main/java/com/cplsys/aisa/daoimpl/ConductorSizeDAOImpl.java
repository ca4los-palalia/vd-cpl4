package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.ConductorSizeDAO;
import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class ConductorSizeDAOImpl extends HibernateDAOSuportUtil implements ConductorSizeDAO {

	@Transactional
	@Override
	public void save(ConductorSize conductorSize) {
		getHibernateTemplate().saveOrUpdate(conductorSize);
	}

	@Transactional
	@Override
	public void delete(ConductorSize conductorSize) {
		getHibernateTemplate().delete(conductorSize);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<ConductorSize> getAll() {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorSize.class);
		List<ConductorSize> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public ConductorSize getById(Long idConductorSize) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorSize.class);
		criteria.add(Restrictions.eq("idConductorSize", idConductorSize));
		List<ConductorSize> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public ConductorSize getByNombre(String nombre) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorSize.class);
		criteria.add(Restrictions.eq("nombre", nombre));
		List<ConductorSize> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings({ "unchecked", "null" })
	@Transactional(readOnly = true)
	@Override
	public String[] getAllOnlyNombres() {
		String[] items = null;
		
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorSize.class);
		List<ConductorSize> lista = criteria.list();
		
		if(lista != null){
			int i = 0;
			for (ConductorSize item : lista) {
				items [i] = item.getNombre();
			}
		}
		return items != null && items.length > 0 ? items : null;
	}
}
