package com.cplsys.aisa.domain.ui.main;

import javax.annotation.PostConstruct;
import javax.swing.JMenuBar;

import com.cplsys.aisa.domain.ui.main.utils.MaiFrameVariables;

public class MainFrame extends MaiFrameVariables {

	private static final long serialVersionUID = -6509304242603807376L;

	@PostConstruct
	@Override
	public void init() {
		menuBar = new JMenuBar();
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

}
