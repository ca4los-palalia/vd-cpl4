package com.cplsys.aisa.modules;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.SizingConduitVariables;

@Repository
public class SizingConduitView extends SizingConduitVariables {

	private static final long serialVersionUID = -6478073798353657954L;

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
