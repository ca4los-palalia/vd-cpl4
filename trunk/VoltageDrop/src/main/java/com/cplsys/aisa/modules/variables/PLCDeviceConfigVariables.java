package com.cplsys.aisa.modules.variables;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.domain.PLCDeviceType;
import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.utils.ServicesLayer;

public abstract class PLCDeviceConfigVariables extends JPanel implements DefaultUIStructure {
    
    private static final long   serialVersionUID = -8737701557429103624L;
    @Autowired
    protected ServicesLayer   servicesLayer;
    protected JLabel            title;
    protected JLabel            type;
    protected JComboBox<PLCDeviceType> typeCombo;
    protected JLabel            description;
    protected JTextArea         descriptionArea;
    protected JLabel            partNoLabel;
    protected JTextField        partNoField;
    protected JLabel            voltageLabel;
    protected JTextField        voltage;
    protected JLabel            watts;
    protected JTextField        wattsField;
    protected JLabel            mfcLabel;
    protected JTextField        mfcField;
    protected JScrollPane       scrollDescription;
    
    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
    
}
