package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.domain.OtherLoads;
import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class OtherLoadsVariables extends JPanel implements
		DefaultUIStructure {

	private static final long serialVersionUID = 532677902885225808L;
	@Autowired
	protected ServicesLayer servicesLayer;
	protected JLabel title;
	protected JLabel typeLabel;
	protected JLabel descriptionLabel;
	protected JLabel partNoLabel;
	protected JLabel wattsLabel;
	protected JLabel mfcLabel;

	protected JComboBox<OtherLoads> typeCombo;
	protected JTextArea descriptionArea;
	protected JTextField partNoField;
	protected JTextField wattsField;
	protected JTextField mfcField;
	protected JScrollPane scrollDescription;

	public void graphicInterfaceBuilder(JComponent component) {
		this.add(component);
	}
}
