package com.cplsys.aisa.ui.render;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.cplsys.aisa.domain.PLCDeviceType;

public class PLCDeviceComboRender extends JLabel implements ListCellRenderer<PLCDeviceType> {
    
    private static final long serialVersionUID = 1L;
    
    @Override
    public Component getListCellRendererComponent(JList<? extends PLCDeviceType> list, PLCDeviceType value, int index, boolean isSelected, boolean cellHasFocus) {
	if (isSelected) {
	    setBackground(list.getSelectionBackground());
	    setForeground(list.getSelectionForeground());
	} else {
	    setBackground(list.getBackground());
	    setForeground(list.getForeground());
	}
	
	setText(value.getName());
	return this;
    }
    
}
