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
		criteria.add(Restrictions.eq("idSystemType", idSystemType));
		List<SystemType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public SystemType getByNombre(String nombre) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(SystemType.class);
		criteria.add(Restrictions.eq("nombre", nombre));
		List<SystemType> lista = criteria.list();
		return lista != null && !lista.isEmpty() ? lista.get(0) : null;
	}

	@SuppressWarnings({ "unchecked", "null" })
	@Transactional(readOnly = true)
	@Override
	public String[] getAllOnlyNombres() {
		String[] items = null;
		
		Criteria criteria = getHibernateTemplate().getSessionFactory().openSession().
				createCriteria(SystemType.class);
		List<SystemType> lista = criteria.list();
		
		if(lista != null){
			int i = 0;
			for (SystemType item : lista) {
				items [i] = item.getNombre();
			}
		}
		return items != null && items.length > 0 ? items : null;
	}

	
}
