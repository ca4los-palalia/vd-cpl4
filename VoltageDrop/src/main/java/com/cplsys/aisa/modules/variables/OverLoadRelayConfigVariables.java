package com.cplsys.aisa.modules.variables;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class OverLoadRelayConfigVariables extends JPanel implements
		DefaultUIStructure {

	private static final long serialVersionUID = 1L;
	protected static final int MAIN_POP_UP_LISTENER = 0;
	
	@Autowired
	private ServicesLayer servicesLayer;
	protected JLabel title;
	protected JLabel size;
	protected JLabel rangeA;
	protected JLabel partNoLabel;
	protected JLabel mfcLabel;
	protected JTextField sizeField;
	protected JTextField rangeField;
	protected JTextField partField;
	protected JTextField mfcField;

	protected JButton save;
	protected JButton cancel;
	protected JButton close;

	public void graphicInterfaceBuilder(JComponent component) {
		this.add(component);
	}

}
