package com.cplsys.aisa.modules;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.LoadScheduleVariables;

@Repository
public class LoadsScheduleView extends LoadScheduleVariables {

	private static final long serialVersionUID = -3142283501643462972L;

	@PostConstruct
	@Override
	public void init() {

	}

	@Override
	public void initListeners() {

	}

	@Override
	public void initProperties() {

	}

	@Override
	public void initObjects() {

	}

	@Override
	public void createUI() {

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
