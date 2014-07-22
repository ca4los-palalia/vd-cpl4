package com.cplsys.aisa.domain.ui.main;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.main.utils.WorkSpacePanelVariables;

/** Panel principal del área de trabajo */
@Repository
public class WorkSpacePanel extends WorkSpacePanelVariables implements
		DefaultUIStructure {

	private static final long serialVersionUID = 5455708238231832629L;
	@Autowired
	private StatusBarPanel statusBarPanel;
	@Autowired
	private ModuleContainer moduleContainer;

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
		gridConstraint.weightx = 1.0;
		gridConstraint.weighty = 1.0;
		gridConstraint.gridx = 0;
		gridConstraint.gridy = 0;
		gridConstraint.gridheight = GridBagConstraints.PAGE_START;
		gridConstraint.fill = java.awt.GridBagConstraints.BOTH;
		this.add(moduleContainer, gridConstraint);
	}

	@Override
	public void initListeners() {

	}

	@Override
	public void initProperties() {

		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void initObjects() {

	}

}
