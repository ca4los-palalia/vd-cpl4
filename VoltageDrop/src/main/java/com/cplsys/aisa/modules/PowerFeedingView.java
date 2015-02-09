package com.cplsys.aisa.modules;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.PowerFeedingVariables;
import com.cplsys.aisa.ui.model.MagneticsHeatTableModel;

@Repository
public class PowerFeedingView extends PowerFeedingVariables {

	private static final long serialVersionUID = 3775741598821605876L;

	@PostConstruct
	@Override
	public void init() {
		initObjects();
		initProperties();
		initListeners();
		createUI();
	}

	@Override
	public void initListeners() {
		
	}

	@Override
	public void initProperties() {
		this.setLayout(new GridBagLayout());
		this.setSize(500, 400);
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		String[] columnNames = { "Quaitity", "Device",
				"Part number", "Manufacturer", "Watts",
				"Total Watts" };
		magneticsHeatTableModel = new MagneticsHeatTableModel(columnNames);
	}

	@Override
	public void initObjects() {
		magneticsHeatTable = new JTable();
		mhTableModel = (DefaultTableModel)magneticsHeatTable.getModel();
		
	}

	@Override
	public void createUI() {
		
		Panel panelBotones = new Panel(new FlowLayout());
		panelBotones.add(new JButton("Button a"));
		panelBotones.add(new JButton("Button b"));
		
		Panel panelTabla = new Panel();
		panelTabla.add(magneticsHeatTable);
		
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.gridheight = 2;
		this.add(panelBotones, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 2;
		this.add(panelTabla, constraints);
		
	
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public void print() {
		
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
