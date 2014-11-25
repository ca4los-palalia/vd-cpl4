package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;

public abstract class OtherLoadsVariables extends JPanel implements DefaultUIStructure {
    
    private static final long   serialVersionUID = 532677902885225808L;
    
    protected JLabel            title;
    protected JLabel            typeLabel;
    protected JLabel            descriptionLabel;
    protected JLabel            partNoLabel;
    protected JLabel            wattsLabel;
    protected JLabel            mfcLabel;
    
    protected JComboBox<Object> typeCombo;
    protected JTextArea         descriptionArea;
    protected JTextField        partNoField;
    protected JTextField        wattsField;
    protected JTextField        mfcField;
    protected JScrollPane       scrollDescription;
    
    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
}
