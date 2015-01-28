package com.cplsys.aisa.ui.render;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.cplsys.aisa.domain.VoltageOutputValues;

public class VoltageOutputComboRender extends JLabel implements ListCellRenderer<VoltageOutputValues> {
    
    private static final long serialVersionUID = 2780453918342941184L;
    
    @Override
    public Component getListCellRendererComponent(JList<? extends VoltageOutputValues> list, VoltageOutputValues value, int index, boolean isSelected, boolean cellHasFocus) {
	if (isSelected) {
	    setBackground(list.getSelectionBackground());
	    setForeground(list.getSelectionForeground());
	} else {
	    setBackground(list.getBackground());
	    setForeground(list.getForeground());
	}
	
	setText(value.getVoltage());
	return this;
    }
    
}
