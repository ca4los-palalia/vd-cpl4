package com.cplsys.aisa.modules;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.LenghtAccVoltageVariables;

@Repository
public class LenghtAccVoltageView extends LenghtAccVoltageVariables {

	private static final long serialVersionUID = 7509728603831286824L;

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
