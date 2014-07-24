package com.cplsys.aisa.domain.ui.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.VoltageDropView;
import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.main.utils.WorkSpacePanelVariables;

/** Panel principal del área de trabajo */
@Repository
public class WorkSpacePanel extends WorkSpacePanelVariables implements
		DefaultUIStructure {

	private static final long serialVersionUID = 5455708238231832629L;
	@Autowired
	private StatusBarPanel statusBarPanel;

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

	}

	@Override
	public void initListeners() {

	}

	@Override
	public void initProperties() {

		this.setLayout(new CardLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void initObjects() {

	}

	public void updateWorkSpace(Long serial) {
		cardManager = (CardLayout) this.getLayout();
		cardManager.show(this, String.valueOf(serial));
	}

}
