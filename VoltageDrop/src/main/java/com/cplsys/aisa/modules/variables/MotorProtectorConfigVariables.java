package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.domain.MotorProtectorTypes;
import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class MotorProtectorConfigVariables extends JPanel implements DefaultUIStructure {
    
    private static final long serialVersionUID = 7403598556136109724L;
    @Autowired
    protected ServicesLayer   servicesLayer;
    protected JLabel title;
    protected JLabel typeLabel;
    protected JComboBox<MotorProtectorTypes> type;
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
