package com.cplsys.aisa.ui.main;

import java.awt.CardLayout;
import java.awt.Color;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.ui.main.utils.WorkSpacePanelVariables;
import com.cplsys.aisa.utils.SpannngSession;

/** Panel principal del �rea de trabajo */
@Repository
public class WorkSpacePanel extends WorkSpacePanelVariables implements
		DefaultUIStructure {

	private static final long serialVersionUID = 5455708238231832629L;
	@Autowired
	private StatusBarPanel statusBarPanel;
	@Autowired
	private SpannngSession spannungSession;

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
		spannungSession.addVariableToSession(SpannngSession.CURRENT_MODULE, serial);
	}

	@Override
	public void print() {
		
	}

	@Override
	public void nuevo() {
		
	}

	@Override
	public void abrir() {
		
	}

	@Override
	public void abrirReciente() {
		
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportar() {
		
	}

	@Override
	public void salir() {
		
	}

}
