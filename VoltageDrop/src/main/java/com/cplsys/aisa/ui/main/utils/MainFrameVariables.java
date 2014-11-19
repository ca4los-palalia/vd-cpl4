package com.cplsys.aisa.ui.main.utils;

import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.utils.ServicesLayer;

public abstract class MainFrameVariables extends JFrame implements
		DefaultUIStructure {

	private static final long serialVersionUID = -7508083727357748068L;

	@Autowired
	protected ServicesLayer servicesLayer;

	protected GridBagConstraints menuGridBagConstraints = new GridBagConstraints();

	protected JMenuBar menuBar;
	protected JMenu file;
	protected JMenuItem newFile;
	protected JMenuItem open;
	protected JMenuItem openRecent;
	protected JMenuItem save;
	protected JMenuItem saveAs;
	protected JMenuItem exportTo;
	protected JMenuItem printReport;
	protected JMenuItem exit;

	protected JMenu edition;
	protected JMenuItem copy;
	protected JMenuItem cut;
	protected JMenuItem paste;

	protected JMenu dataBase;
	protected JMenuItem contactors;
	protected JMenuItem guardaMotores;
	protected JMenuItem circuitBreaker;
	protected JMenuItem fuses;
	protected JMenuItem safetySwitches;

	protected JMenu calculations;
	protected JMenuItem voltageDrop;
	protected JMenuItem powerFeeding;
	protected JMenuItem lenghtAccVoltage;
	protected JMenuItem wireSize;
	protected JMenuItem sizingConduit;
	protected JMenuItem circuitProtections;
	protected JMenuItem motorSchedule;
	protected JMenuItem controlPanel;
	protected JMenuItem loadsSchedule;

	protected JMenu settings;
	protected JMenuItem language;

	protected JMenu about;
	protected JMenuItem acercaDe;
	protected JMenuItem help;
	
	protected JDialog controlPanelDialog;

	
}
