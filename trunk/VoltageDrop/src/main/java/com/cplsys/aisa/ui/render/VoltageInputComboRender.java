package com.cplsys.aisa.ui.render;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.cplsys.aisa.domain.VoltageInputValues;

public class VoltageInputComboRender extends JLabel implements
		ListCellRenderer<VoltageInputValues> {

	private static final long serialVersionUID = -5385505452215969374L;

	public VoltageInputComboRender() {
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}

	@Override
	public Component getListCellRendererComponent(
			JList<? extends VoltageInputValues> list, VoltageInputValues value,
			int index, boolean isSelected, boolean cellHasFocus) {
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
