package com.cplsys.aisa.modules.variables;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;

public abstract class ControlTransformerVariables extends JPanel implements DefaultUIStructure {
    
    private static final long serialVersionUID = -7817198134356860327L;
    
    protected JLabel          title;
    protected JLabel          kwalabel;
    protected JLabel          primaryVoltageLabel;
    protected JLabel          secondaryLabel;
    protected JLabel          partNoLabel;
    protected JLabel          mfcLabel;
    protected JTextField      kwaField;
    protected JTextField      primaryVoltageField;
    protected JTextField      secondaryField;
    protected JTextField      partNoField;
    protected JTextField      mfcField;
    
    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
    
}
