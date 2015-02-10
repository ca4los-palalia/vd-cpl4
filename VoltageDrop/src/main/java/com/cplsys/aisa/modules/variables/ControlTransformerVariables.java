package com.cplsys.aisa.modules.variables;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class ControlTransformerVariables extends JPanel implements
		DefaultUIStructure {

	private static final long serialVersionUID = -7817198134356860327L;
	protected static final int MAIN_POP_UP_LISTENER = 0;

	@Autowired
	protected ServicesLayer servicesLayer;
	protected JLabel title;
	protected JLabel kwalabel;
	protected JLabel primaryVoltageLabel;
	protected JLabel secondaryLabel;
	protected JLabel partNoLabel;
	protected JLabel mfcLabel;
	protected JTextField kwaField;
	protected JTextField primaryVoltageField;
	protected JTextField secondaryField;
	protected JTextField partNoField;
	protected JTextField mfcField;
	protected JButton save;
	protected JButton cancel;
	protected JButton close;

	public void graphicInterfaceBuilder(JComponent component) {
		this.add(component);
	}

}
