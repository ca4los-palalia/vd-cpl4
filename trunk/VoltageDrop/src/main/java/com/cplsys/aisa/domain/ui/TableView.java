package com.cplsys.aisa.domain.ui;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import com.cplsys.aisa.domain.ui.editors.SpinnerEditor;

public class TableView extends JPanel {

	private static final long serialVersionUID = 6576152466060289826L;
	private JTable voltageTable;
	private DefaultTableModel voltageModel;

	public TableView() {
		createObjects();
		fillModel();
		initProperties();
		initUI();
	}

	private void initUI() {
		this.add(voltageTable);
	}

	private void initProperties() {
		this.setSize(500, 400);
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	}

	private void createObjects() {
		voltageTable = new JTable();
		voltageModel = (DefaultTableModel) voltageTable.getModel();
	}

	private void fillModel() {
		HEADER: {
			voltageModel.addColumn("Conduit Type");
			voltageModel.addColumn("Conductor Type");
			voltageModel.addColumn("System Type");
			voltageModel.addColumn("Conductor Size (AWG)");
			voltageModel.addColumn("Circuit Lenght");
			voltageModel.addColumn("Current (A)");
			voltageModel.addColumn("Voltage (V)");
			voltageModel.addColumn("Power Factor");
			voltageModel.addColumn("Ze (ohms)");
			voltageModel.addColumn("Voltage Drop");
			voltageModel.addColumn("%");
			voltageModel.addColumn("Fina voltage (V)");
		}

		ROWS: {
			voltageModel.addRow(new Object[][] { { null, null, null, null,
					null, null, null, null, 1, 1, 1, 1 } });
		}

		voltageTable.setModel(voltageModel);

		voltageTable.getColumnModel().getColumn(0)
				.setCellEditor(new DefaultCellEditor(new JComboBox()));
		voltageTable.getColumnModel().getColumn(1)
				.setCellEditor(new DefaultCellEditor(new JComboBox()));
		voltageTable.getColumnModel().getColumn(2)
				.setCellEditor(new DefaultCellEditor(new JComboBox()));
		voltageTable.getColumnModel().getColumn(3)
				.setCellEditor(new DefaultCellEditor(new JComboBox()));
		voltageTable
				.getColumnModel()
				.getColumn(4)
				.setCellEditor(
						new SpinnerEditor(new String[] { "1", "2", "3" }));
		//prueba
	}
}
