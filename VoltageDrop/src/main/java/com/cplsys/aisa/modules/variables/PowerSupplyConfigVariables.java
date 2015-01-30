package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.domain.VoltageInputValues;
import com.cplsys.aisa.domain.VoltageOutputValues;
import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;


public abstract class PowerSupplyConfigVariables extends JPanel implements DefaultUIStructure {

    private static final long serialVersionUID = -7396692176570209290L;
    
    @Autowired
    protected ServicesLayer servicesLayer;
    protected JLabel title;
    protected JSeparator separator;
    protected JLabel partNo;
    protected JTextField partNoField;
    protected JLabel voltageInput;
    protected JComboBox<VoltageInputValues> voltageInputCombo;
    protected JLabel voltageOutput;
    protected JComboBox<VoltageOutputValues> voltageOutputCombo;
    protected JLabel watts;
    protected JTextField wattsField;
    protected JLabel mfc;
    protected JTextField mfcField;
    
    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
    
}
