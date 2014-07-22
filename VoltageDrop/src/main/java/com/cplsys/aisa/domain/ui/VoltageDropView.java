package com.cplsys.aisa.domain.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.derby.tools.sysinfo;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.CaidaVoltaje;
import com.cplsys.aisa.domain.ui.editors.SpinnerEditor;
import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.model.VoltageTableModel;
import com.cplsys.aisa.domain.ui.render.VoltageTableRender;

@Repository
public class VoltageDropView extends VoltageDropViewVariables {

	private static final long serialVersionUID = 6576152466060289826L;

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

		voltageTable.getColumnModel().getColumn(4)
				.setCellEditor(new DefaultCellEditor(new JCheckBox()));

		voltageTable
				.getColumnModel()
				.getColumn(4)
				.setCellEditor(
						new SpinnerEditor(new String[] { "1", "2", "3" }));

	}

	

	

	@Override
	@PostConstruct
	public void init() {
		initObjects();
		initProperties();
		initListeners();
		createUI();
	}

	@Override
	public void initObjects() {
		agregarFIlaButton = new JButton("Nuevo registro");
		eliminarFIlaButton = new JButton("Eliminar registro");
		voltageTable = new JTable();
		voltageModel = (DefaultTableModel) voltageTable.getModel();
	}


	@Override
	public void initProperties() {
		this.setLayout(new GridBagLayout());
		this.setSize(500, 400);
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		loadInfoTabla2();
	}
	
	@Override
	public void createUI() {
		cargarComponentes();
		
	}
	
	@Override
	public void initListeners() {
		agregarFIlaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.err.println("agregar fila");
			}
		});
		
		eliminarFIlaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}

	private void loadInfoTabla2() {

		List<CaidaVoltaje> lista = new ArrayList<CaidaVoltaje>();
		CaidaVoltaje info = new CaidaVoltaje();

		info.setCurrentAmper(13F);
		info.setVoltage(120);
		info.setPowerFactor(0.9F);
		lista.add(info);

		String[] columnNames = { "Conduit Type", "Conductor Type",
				"System Type", "Conductor Size (AWG)", "Circuit Lenght",
				"Current (A)", "Voltage (V)", "Power Factor", "Ze (ohms)",
				"Voltage Drop Volts", "%", "Final Voltage (V)" };

		voltageTableModel = new VoltageTableModel(lista, columnNames);

		voltageTable2 = new JTable(voltageTableModel);

		voltageTable2.createDefaultColumnsFromModel();

		voltageTable2.getColumnModel().getColumn(0)
				.setCellEditor(new DefaultCellEditor(getCbConduitType()));

		voltageTable2.getColumnModel().getColumn(1)
				.setCellEditor(new DefaultCellEditor(getCbConductorType()));

		voltageTable2.getColumnModel().getColumn(2)
				.setCellEditor(new DefaultCellEditor(getCbSystemType()));

		voltageTable2.getColumnModel().getColumn(3)
				.setCellEditor(new DefaultCellEditor(getCbConductorSize()));

		voltageTable2
				.getColumnModel()
				.getColumn(4)
				.setCellEditor(
						new SpinnerEditor(new String[] { "1", "2", "3" }));

		voltageTable2.getColumnModel().getColumn(5)
				.setCellEditor(new DefaultCellEditor(getCbCircuitlenght()));

		voltageTable2
				.setDefaultRenderer(Object.class, new VoltageTableRender());

	}

	private JComboBox getCbConduitType() {
		String[] bloodGroups = { "PVC", "Steel", "Aluminum" };
		JComboBox comboBox = new JComboBox(bloodGroups);
		return comboBox;
	}

	private JComboBox getCbConductorType() {
		String[] bloodGroups = { "Cu", "Al" };
		JComboBox comboBox = new JComboBox(bloodGroups);
		return comboBox;
	}

	private JComboBox getCbSystemType() {
		String[] bloodGroups = { "1-phase", "3-phase" };
		JComboBox comboBox = new JComboBox(bloodGroups);
		return comboBox;
	}

	private JComboBox getCbConductorSize() {
		String[] bloodGroups = { "14", "10", "8", "6", "4", "3", "2", "1",
				"1/0", "2/0", "3/0", "4/0", "250", "300", "350", "400", "500",
				"600", "750", "1000" };
		JComboBox comboBox = new JComboBox(bloodGroups);
		return comboBox;
	}

	private JComboBox getCbCircuitlenght() {
		String[] bloodGroups = { "Feet", "Meters" };
		JComboBox comboBox = new JComboBox(bloodGroups);
		return comboBox;
	}

	private void cargarComponentes() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0; // El área de texto empieza en la columna cero.
		constraints.gridy = 0; // El área de texto empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
		constraints.gridheight = 2; // El área de texto ocupa 2 filas.
		this.add(voltageTable2, constraints);

		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;

		this.add(agregarFIlaButton, constraints);

		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;

		this.add(eliminarFIlaButton, constraints);
	}
}
