package com.cplsys.aisa.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.dao.OtherLoadsDAO;
import com.cplsys.aisa.domain.OtherLoads;
import com.cplsys.aisa.utils.HibernateDAOSuportUtil;

@Repository
public class OtherLoadsDAOImpl extends HibernateDAOSuportUtil implements
		OtherLoadsDAO {

	@Override
	public void save(OtherLoads otherLoads) {
		getHibernateTemplate().save(otherLoads);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OtherLoads> getAll() {
		return getHibernateTemplate().find("FROM OtherLoads as o");
	}

}
