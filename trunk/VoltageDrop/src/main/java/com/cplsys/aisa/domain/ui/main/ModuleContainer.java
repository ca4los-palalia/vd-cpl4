package com.cplsys.aisa.domain.ui.main;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.main.utils.ModuleContainerVariables;

@Repository
public class ModuleContainer extends ModuleContainerVariables {

	private static final long serialVersionUID = 5483479917454960921L;

	@PostConstruct
	@Override
	public void init() {
		initObjects();
		initProperties();
		initListeners();
		createUI();
	}

	@Override
	public void createUI() {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void initListeners() {

	}

	@Override
	public void initProperties() {

	}

	@Override
	public void initObjects() {
		this.setLayout(new GridBagLayout());
	}

}
