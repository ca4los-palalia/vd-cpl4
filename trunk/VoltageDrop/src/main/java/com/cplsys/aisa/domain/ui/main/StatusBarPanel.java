package com.cplsys.aisa.domain.ui.main;

import java.awt.Color;
import java.awt.Component;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.main.utils.StatusBarPanelVariables;

@Repository
public class StatusBarPanel extends StatusBarPanelVariables implements
		DefaultUIStructure {

	private static final long serialVersionUID = -6761485738624042855L;

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
		this.getSize().setSize(this.getSize().getWidth(), 60);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void initListeners() {

	}

	@Override
	public void initObjects() {

	}

	@Override
	public void initProperties() {

	}

	@Override
	public void print() {
		
	}

}
