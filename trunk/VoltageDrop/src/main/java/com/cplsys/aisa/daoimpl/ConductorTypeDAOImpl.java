package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cplsys.aisa.dao.ConductorTypeDAO;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.domain.ConductorType;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class ConductorTypeDAOImpl extends HibernateDAOSuportUtil implements ConductorTypeDAO {

	@Transactional
	@Override
	public void save(ConductorType conductorType) {
		getHibernateTemplate().saveOrUpdate(conductorType);
	}

	@Transactional
	@Override
	public void delete(ConductorType conductorType) {
		getHibernateTemplate().delete(conductorType);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<ConductorType> getAll() {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorType.class);
		List<ConductorType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public ConductorType getById(Long idConductorType) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorType.class);
		criteria.add(Restrictions.eq("idConductorType", idConductorType));
		List<ConductorType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public ConductorType getByNombre(String nombre) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorType.class);
		criteria.add(Restrictions.eq("nombre", nombre));
		List<ConductorType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings({ "unchecked", "null" })
	@Transactional(readOnly = true)
	@Override
	public String[] getAllOnlyNombres() {
		String[] items = null;
		
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(ConductorType.class);
		List<ConductorType> lista = criteria.list();
		
		if(lista != null){
			int i = 0;
			for (ConductorType item : lista) {
				items [i] = item.getNombre();
			}
		}
		return items != null && items.length > 0 ? items : null;
	}
}
