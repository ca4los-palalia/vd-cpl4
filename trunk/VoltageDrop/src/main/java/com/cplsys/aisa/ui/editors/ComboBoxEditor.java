package com.cplsys.aisa.ui.editors;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

public class ComboBoxEditor extends DefaultCellEditor {

	private static final long serialVersionUID = 2398494298161980945L;

	public ComboBoxEditor(String[] items) {
		super(new JComboBox(items));
	}
}