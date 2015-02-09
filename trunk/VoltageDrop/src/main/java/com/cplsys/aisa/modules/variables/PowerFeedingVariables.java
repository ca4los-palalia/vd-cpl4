package com.cplsys.aisa.modules.variables;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.ui.model.MagneticsHeatTableModel;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class PowerFeedingVariables extends JPanel implements
		DefaultUIStructure {

	private static final long serialVersionUID = -3011852858434279136L;
	@Autowired
	protected ServicesLayer servicesLayer;
	protected JTable magneticsHeatTable;
	
	protected DefaultTableModel mhTableModel;
	protected JTextField totalwattsField;
	protected JLabel totalWatts;
	protected JButton saveChanges;
	protected JLabel titlemodule;
	protected MagneticsHeatTableModel magneticsHeatTableModel;
}
