package com.cplsys.aisa.modules;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.MotorScheduleVariables;

@Repository
public class MotorScheduleView extends MotorScheduleVariables {

	private static final long serialVersionUID = -1758049454375352918L;

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
