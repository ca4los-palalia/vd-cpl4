package com.cplsys.aisa.modules.configuration;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.ControlTransformerVariables;

@Repository
public class ControlTransformer extends ControlTransformerVariables {

	private static final long serialVersionUID = -3064932842249392725L;

	@PostConstruct
	@Override
	public void init() {
		initObjects();
		initProperties();
		initListeners();
		createUI();
	}

	@Override
	public void initObjects() {
		title = new JLabel("CONTROL TRANSFORMER");
		kwalabel = new JLabel("KWA");
		primaryVoltageLabel = new JLabel("PRIMARY VOLTAGE");
		secondaryLabel = new JLabel("SECONDARY VOLTAGE");
		partNoLabel = new JLabel("PART No");
		mfcLabel = new JLabel("MFC");

		kwaField = new JTextField(5);
		primaryVoltageField = new JTextField(5);
		secondaryField = new JTextField(5);
		partNoField = new JTextField(5);
		mfcField = new JTextField(5);

	}

	@Override
	public void initProperties() {
		System.err.println(char[].class);
		System.out.println(byte[].class);
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
		panel.add(kwalabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 1;
		panelConstraints.insets = new Insets(3, 1, 2, 0);
		panel.add(kwaField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 2;
		panelConstraints.insets = new Insets(0, 0, 0, 0);
		panel.add(primaryVoltageLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 2;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(primaryVoltageField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 3;
		panel.add(secondaryLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 3;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(secondaryField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 4;
		panel.add(partNoLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 4;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(partNoField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 5;
		panel.add(mfcLabel, panelConstraints);

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
		panelConstraints.insets = new Insets(15, 0, 0, 0);
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

}
