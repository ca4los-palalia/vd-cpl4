package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.domain.VoltageInputValues;
import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class PilotLampVariables extends JPanel implements
		DefaultUIStructure {

	private static final long serialVersionUID = -4777303461441110688L;
	@Autowired
	protected ServicesLayer servicesLayer;
	protected JLabel title;
	protected JLabel partNoLabel;
	protected JTextField partNoField;
	protected JLabel voltageLabel;
	protected JComboBox<VoltageInputValues> voltageCombo;

	protected JLabel watts;
	protected JTextField wattsField;
	protected JTextField mfcField;
	protected JLabel mfcLabel;

	public void graphicInterfaceBuilder(JComponent component) {
		this.add(component);
	}
}
