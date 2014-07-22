package com.cplsys.aisa.domain.ui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.model.VoltageTableModel;
import com.cplsys.aisa.domain.ui.render.VoltageTableRender;

public abstract class VoltageDropViewVariables extends JPanel implements DefaultUIStructure {

	protected JTable voltageTable;
	protected DefaultTableModel voltageModel;
	protected VoltageTableModel voltageTableModel;
	protected VoltageTableRender voltageTableRender;
	protected JTable voltageTable2;
	protected JButton agregarFIlaButton;
	protected JButton eliminarFIlaButton;
}
