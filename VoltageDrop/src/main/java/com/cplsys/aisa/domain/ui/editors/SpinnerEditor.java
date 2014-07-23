package com.cplsys.aisa.domain.ui.editors;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.List;

import javax.swing.AbstractCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.table.TableCellEditor;

public class SpinnerEditor extends AbstractCellEditor implements
		TableCellEditor {
	private static final long serialVersionUID = 6837560818315967262L;

	final JSpinner spinner = new JSpinner();

	public SpinnerEditor(List<Integer> items) {
        spinner.setModel(new SpinnerListModel(items));
    }
	
	public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        spinner.setValue(value);
        return spinner;
    }
	
	public boolean isCellEditable(EventObject evt) {
        if (evt instanceof MouseEvent) {
            return ((MouseEvent)evt).getClickCount() >= 2;
        }
        return true;
    }
	
	public Object getCellEditorValue() {
        return spinner.getValue();
    }
	/*
	 * final JSpinner spinner = new JSpinner();
	 * 
	 * public SpinnerEditor(List<Integer> items) { spinner.setModel(new
	 * SpinnerListModel(items)); }
	 * 
	 * public Component getTableCellEditorComponent(JTable table, Object value,
	 * boolean isSelected, int row, int column) { spinner.setValue(value);
	 * return spinner; }
	 * 
	 * public boolean isCellEditable(EventObject evt) { if (evt instanceof
	 * MouseEvent) { return ((MouseEvent) evt).getClickCount() >= 2; } return
	 * true; }
	 * 
	 * public Object getCellEditorValue() { return spinner.getValue(); }
	 */
}