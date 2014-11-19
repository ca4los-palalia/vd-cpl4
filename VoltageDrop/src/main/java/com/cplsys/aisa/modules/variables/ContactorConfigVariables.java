package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;


public abstract class ContactorConfigVariables extends JPanel implements DefaultUIStructure {

    private static final long serialVersionUID = 1L;
    
    protected JLabel title;
    protected JLabel partNo;
    protected JLabel size;
    protected JLabel coilV;
    protected JLabel coilVA;
    protected JLabel mfc;
    
    protected JTextField sizeField;
    protected JTextField partField;
    protected JComboBox<Object> coildCombo;
    protected JTextField coilVAField;
    protected JTextField mfcField;

    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
    
}
