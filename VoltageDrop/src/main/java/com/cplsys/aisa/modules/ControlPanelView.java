package com.cplsys.aisa.modules;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.ControlPanelVariables;

@Repository
public class ControlPanelView extends ControlPanelVariables {

	private static final long serialVersionUID = -2644859945680670748L;

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

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
