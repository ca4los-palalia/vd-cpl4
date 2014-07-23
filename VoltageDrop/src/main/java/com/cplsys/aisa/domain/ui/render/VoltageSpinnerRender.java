package com.cplsys.aisa.domain.ui.render;

import java.awt.Component;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.table.TableCellRenderer;

public class VoltageSpinnerRender extends JSpinner implements TableCellRenderer {

	private static final long serialVersionUID = -1432007893607486042L;

	public VoltageSpinnerRender() {
		setOpaque(true);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if(value != null)
			setModel((SpinnerModel) value);

		return this;
	}

}
