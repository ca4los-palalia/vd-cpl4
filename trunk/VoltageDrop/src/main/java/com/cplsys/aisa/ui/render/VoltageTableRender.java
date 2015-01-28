package com.cplsys.aisa.ui.render;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class VoltageTableRender extends DefaultTableCellRenderer {

	private static final long serialVersionUID = -5652290772283589119L;

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {

		JLabel etiqueta = new JLabel();
		etiqueta.setOpaque(true);

		if (row % 2 == 0) {
			etiqueta.setBackground(new Color(124, 139, 178));
			etiqueta.setForeground(Color.WHITE);
		} else {
			etiqueta.setBackground(new Color(195, 211, 254));
			etiqueta.setForeground(Color.BLACK);
		}

		if (isSelected) {
			etiqueta.setBackground(new Color(28, 37, 63));
			etiqueta.setForeground(Color.RED);
		}

		return etiqueta;
	}

}
