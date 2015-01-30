package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.OtherLoads;

public interface OtherLoadsDAO {

	public void save(final OtherLoads otherLoads);
	
	public List<OtherLoads> getAll();
}
