package com.cplsys.aisa.domain.ui;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.domain.CaidaVoltaje;
import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.domain.ConductorType;
import com.cplsys.aisa.domain.ConduitType;
import com.cplsys.aisa.domain.SystemType;
import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.model.VoltageTableModel;
import com.cplsys.aisa.domain.ui.render.VoltageTableRender;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class VoltageDropViewVariables extends JPanel implements DefaultUIStructure {

	private static final long serialVersionUID = 409925181214214806L;
	
	@Autowired
	protected ServicesLayer servicesLayer;
	
	protected JTable voltageTable;
	protected DefaultTableModel voltageModel;
	protected VoltageTableModel voltageTableModel;
	protected VoltageTableRender voltageTableRender;
	protected JTable voltageTable2;  
	protected JButton agregarFIlaButton;
	protected JButton eliminarFIlaButton;
	
	protected List<CaidaVoltaje> listaTablaVoltage;
	protected List<CircuitLenght> circuitLenghtLista;
	protected List<ConductorSize> conductorSizeLista;
	protected List<ConductorType> conductorTypeLista;
	protected List<ConduitType> conduitTypeLista;
	protected List<SystemType> systemTypeLista;
}