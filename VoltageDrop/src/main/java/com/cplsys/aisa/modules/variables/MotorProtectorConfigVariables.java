package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;

public abstract class MotorProtectorConfigVariables extends JPanel implements DefaultUIStructure {
    
    private static final long serialVersionUID = 7403598556136109724L;
    
    protected JLabel title;
    protected JLabel typeLabel;
    protected JComboBox<Object> type;
    protected JLabel partNoLabel;
    protected JSpinner partSpinner;
    protected JLabel sizeLabel;
    protected JSpinner sizeSpinner;
    protected JLabel mfcLabel;
    protected JTextField mfcField;
    
    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
    
}
