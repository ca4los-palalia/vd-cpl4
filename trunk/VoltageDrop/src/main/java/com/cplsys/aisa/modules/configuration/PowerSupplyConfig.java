package com.cplsys.aisa.modules.configuration;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.VoltageInputValues;
import com.cplsys.aisa.domain.VoltageOutputValues;
import com.cplsys.aisa.modules.variables.PowerSupplyConfigVariables;
import com.cplsys.aisa.ui.render.VoltageInputComboRender;
import com.cplsys.aisa.ui.render.VoltageOutputComboRender;

@Repository
public class PowerSupplyConfig extends PowerSupplyConfigVariables {

	private static final long serialVersionUID = 3357047582374837829L;

	@PostConstruct
	@Override
	public void init() {
		initObjects();
		initProperties();
		createUI();
	}

	@Override
	public void initObjects() {
		title = new JLabel("Power Supply");
		partNo = new JLabel("Part No.");
		partNoField = new JTextField(10);
		voltageInput = new JLabel("Voltage Input");
		voltageOutput = new JLabel("Voltage Output");
		voltageInputCombo = new JComboBox<VoltageInputValues>();
		voltageOutputCombo = new JComboBox<VoltageOutputValues>();
		mfcField = new JTextField(10);
		watts = new JLabel("Watts");
		wattsField = new JTextField(10);
		mfc = new JLabel("MFC");
	}

	@Override
	public void initProperties() {
		voltageInputCombo.setModel(new DefaultComboBoxModel<VoltageInputValues>(
				new Vector<VoltageInputValues>(servicesLayer.getVoltageInputValueService().getAll())));
		voltageOutputCombo.setModel(new DefaultComboBoxModel<VoltageOutputValues>(
				new Vector<VoltageOutputValues>(servicesLayer.getVoltageOutputValueService().getAll())));
		voltageInputCombo.setRenderer(new VoltageInputComboRender());
		voltageOutputCombo.setRenderer(new VoltageOutputComboRender());
	}

	@Override
	public void initListeners() {

	}

	@Override
	public void createUI() {

		JPanel panel = new JPanel();
		JPanel footer = new JPanel();

		panel.setSize(300, 300);
		footer.setSize(300, 30);

		footer.setLayout(new GridBagLayout());
		panel.setLayout(new GridBagLayout());

		GridBagConstraints panelConstraints = new GridBagConstraints();
		GridBagConstraints footerConstraints = new GridBagConstraints();

		panelConstraints.fill = GridBagConstraints.CENTER;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 0, 10, 0);
		panel.add(title, panelConstraints);
		panelConstraints = new GridBagConstraints();

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 1;
		panel.add(partNo, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 1;
		panel.add(partNoField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 2;
		panel.add(voltageInput, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 2;
		panel.add(voltageInputCombo, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 3;
		panel.add(voltageOutput, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 3;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(voltageOutputCombo, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 4;
		panel.add(watts, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 4;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(wattsField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 5;
		panel.add(mfc, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 5;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(mfcField, panelConstraints);

		footerConstraints.fill = GridBagConstraints.HORIZONTAL;
		footerConstraints.gridx = 0;
		footerConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 1, 0, 1);
		footer.add(new JButton("Save"), footerConstraints);

		footerConstraints.fill = GridBagConstraints.HORIZONTAL;
		footerConstraints.gridx = 1;
		footerConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 1, 0, 1);
		footer.add(new JButton("Cancel"), footerConstraints);

		footerConstraints.fill = GridBagConstraints.HORIZONTAL;
		footerConstraints.gridx = 2;
		footerConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 0, 0, 3);
		footer.add(new JButton("Close"), footerConstraints);

		panelConstraints.gridx = 0;
		panelConstraints.gridy = 6;
		panelConstraints.fill = GridBagConstraints.CENTER;
		panelConstraints.gridwidth = 3;
		panelConstraints.insets = new Insets(30, 0, 0, 0);
		panel.add(footer, panelConstraints);

		graphicInterfaceBuilder(panel);

	}

	@Override
	public void nuevo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abrirReciente() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exportar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salir() {
		// TODO Auto-generated method stub

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
