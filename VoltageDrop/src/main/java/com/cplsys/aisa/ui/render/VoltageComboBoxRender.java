package com.cplsys.aisa.ui.render;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class VoltageComboBoxRender extends JComboBox implements
		TableCellRenderer {

	private static final long serialVersionUID = -5652290772283589119L;

	public VoltageComboBoxRender(String[] items) {
		super(items);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		
		if (isSelected) {
			setForeground(Color.WHITE);
			super.setBackground(new Color(28, 37, 63));
		} else {
			setForeground(Color.WHITE);
			setBackground(new Color(124, 139, 178));
		}
		setSelectedItem(value);
		return this;
	}

}
