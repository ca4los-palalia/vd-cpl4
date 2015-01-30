package com.cplsys.aisa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cplsys.aisa.dao.OtherLoadsDAO;
import com.cplsys.aisa.domain.OtherLoads;

@Service
public class OtherLoadService {

	@Autowired
	private OtherLoadsDAO otherLoadsDAO;

	public void save(final OtherLoads otherLoads) {
		otherLoadsDAO.save(otherLoads);
	}

	public List<OtherLoads> getAll() {
		return otherLoadsDAO.getAll();
	}

}
