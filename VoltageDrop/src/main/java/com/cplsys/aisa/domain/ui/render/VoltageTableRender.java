package com.cplsys.aisa.domain.ui.render;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class VoltageTableRender extends DefaultTableCellRenderer{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		
		JLabel etiqueta = new JLabel();
		etiqueta.setOpaque(true);
		if (row % 2 == 0) {
			etiqueta.setBackground(new Color(255, 255, 200));
		} else {
			etiqueta.setBackground(Color.white);
		}
		return etiqueta;
	}

}
