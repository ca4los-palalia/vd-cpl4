package com.cplsys.aisa.ui.render;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.cplsys.aisa.domain.OtherLoads;

public class OtherLoadsRender extends JLabel implements
		ListCellRenderer<OtherLoads> {

	private static final long serialVersionUID = 1L;

	public OtherLoadsRender() {
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}

	@Override
	public Component getListCellRendererComponent(
			JList<? extends OtherLoads> list, OtherLoads value,
			int index, boolean isSelected, boolean cellHasFocus) {
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
