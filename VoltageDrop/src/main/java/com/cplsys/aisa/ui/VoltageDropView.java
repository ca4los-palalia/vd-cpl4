package com.cplsys.aisa.ui;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.CaidaVoltaje;
import com.cplsys.aisa.modules.variables.VoltageDropViewVariables;
import com.cplsys.aisa.ui.editors.ComboBoxEditor;
import com.cplsys.aisa.ui.editors.SpinnerEditor;
import com.cplsys.aisa.ui.model.VoltageTableModel;
import com.cplsys.aisa.ui.render.VoltageComboBoxRender;
import com.cplsys.aisa.ui.render.VoltageSpinnerRender;
import com.cplsys.aisa.ui.render.VoltageTableRender;

@Repository
public class VoltageDropView extends VoltageDropViewVariables {

	private static final long serialVersionUID = 6576152466060289826L;

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
		listaTablaVoltage = new ArrayList<CaidaVoltaje>();
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
				agregarRowVoltaje();
			}
		});

		eliminarFIlaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (voltageTable2.getSelectedRow() > -1)
					voltageTableModel.deleteRow(voltageTable2.getSelectedRow());
			}
		});

	}

	private void loadInfoTabla2() {

		CaidaVoltaje info = new CaidaVoltaje();

		info.setCurrentAmper(13F);
		info.setVoltage(120);
		info.setPowerFactor(0.9F);
		listaTablaVoltage.add(info);

		String[] columnNames = { "Conduit Type", "Conductor Type",
				"System Type", "Conductor Size (AWG)", "Circuit Lenght",
				"Current (A)", "Voltage (V)", "Power Factor", "Ze (ohms)",
				"Voltage Drop Volts", "%", "Final Voltage (V)" };

		voltageTableModel = new VoltageTableModel(listaTablaVoltage,
				columnNames);

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

		List<Integer> items = new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);

		TableColumn col = voltageTable2.getColumnModel().getColumn(4);
		col.setCellRenderer(new VoltageSpinnerRender());
		col.setCellEditor(new SpinnerEditor(items));

		voltageTable2.getColumnModel().getColumn(5)
				.setCellEditor(new DefaultCellEditor(getCbCircuitlenght()));
		voltageTable2
				.setDefaultRenderer(Object.class, new VoltageTableRender());

	}

	private void agregarRowVoltaje() {
		CaidaVoltaje info = new CaidaVoltaje();
		info.setCurrentAmper(13F);
		info.setVoltage(120);
		info.setPowerFactor(0.9F);
		voltageTableModel.addRow(info);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox getCbConduitType() {
		String[] items = servicesLayer.getCircuitLenghtService()
				.getAllOnlyNombres();
		JComboBox comboBox = null;
		if (items != null)
			comboBox = new JComboBox(items);
		else
			comboBox = new JComboBox();
		return comboBox;
	}

	private JComboBox getCbConductorType() {
		String[] bloodGroups = { "Cu", "Al" };
		JComboBox comboBox = new JComboBox(bloodGroups);

		TableColumn col = voltageTable2.getColumnModel().getColumn(1);
		col.setCellEditor(new ComboBoxEditor(bloodGroups));
		col.setCellRenderer(new VoltageComboBoxRender(bloodGroups));
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
		
		Panel panelBotones = new Panel(new FlowLayout());
		panelBotones.add(agregarFIlaButton);
		panelBotones.add(eliminarFIlaButton);
		
		Panel panelTabla = new Panel();
		panelTabla.add(voltageTable2);
		
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.gridheight = 2;
		this.add(panelBotones, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 2;
		this.add(panelTabla, constraints);
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public void print() {
		System.err.println("Impresion desde VoltageDropView");
	}

	@Override
	public void nuevo() {
		System.err.println("Nuevo documento desde VoltageDropView");
	}

	@Override
	public void abrir() {
		System.err.println("Abrir documento desde VoltageDropView");
	}

	@Override
	public void abrirReciente() {
		System.err.println("Abrir documento reciente desde VoltageDropView");
	}

	@Override
	public void guardar() {
		System.err.println("Guardar documento desde VoltageDropView");
	}

	@Override
	public void exportar() {
		System.err.println("Exportar PDF desde VoltageDropView");
	}

	@Override
	public void salir() {
		System.err.println("Salir del sistema desde VoltageDropView");
	}

	@Override
	public boolean validateComponents(JComponent... component) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetUIValues(JComponent... components) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerPopUpExitListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterPopUpListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}
