package com.cplsys.aisa.ui.main;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.ui.main.utils.StatusBarPanelVariables;

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
		
	}

	@Override
	public void exportar() {
		
	}

	@Override
	public void salir() {
		
	}

	@Override
	public boolean validateComponents(JComponent... component) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetUIValues(JComponent... components) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerPopUpExitListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterPopUpListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}
