package com.cplsys.aisa.modules.configuration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.OtherLoads;
import com.cplsys.aisa.modules.variables.OtherLoadsVariables;
import com.cplsys.aisa.ui.render.OtherLoadsRender;

@Repository
public class OtherLoadsConfig extends OtherLoadsVariables {

	private static final long serialVersionUID = 8204122911914966685L;
	

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
		title = new JLabel("OTHER LOADS");
		typeLabel = new JLabel("TYPE");
		descriptionLabel = new JLabel("DESCRIPTION");
		partNoLabel = new JLabel("PART No");
		wattsLabel = new JLabel("WATTS");
		mfcLabel = new JLabel("MFC");

		typeCombo = new JComboBox<OtherLoads>();
		descriptionArea = new JTextArea(3, 15);
		partNoField = new JTextField(15);
		wattsField = new JTextField(15);
		mfcField = new JTextField(15);
		scrollDescription = new JScrollPane(descriptionArea);
		
		save = new JButton("Save");
		cancel = new JButton("Cancel");
		close = new JButton("Close");
	}

	@Override
	public void initProperties() {
		descriptionArea.setLineWrap(true);
		descriptionArea.setPreferredSize(new Dimension(170, 20));
		typeCombo.setModel(new DefaultComboBoxModel<OtherLoads>(
				new Vector<OtherLoads>(servicesLayer.getOtherLoadService()
						.getAll())));
		typeCombo.setRenderer(new OtherLoadsRender());
	}

	@Override
	public void initListeners() {
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(validateComponents(descriptionArea, partNoField, mfcField)) {
					OtherLoads load = (OtherLoads)typeCombo.getSelectedItem();
					String dscr =  descriptionArea.getText();
					String part = partNoField.getText();
					String mfc = mfcField.getText();	
					resetUIValues(descriptionArea, mfcField, partNoField);
				}
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resetUIValues(descriptionArea, mfcField, partNoField);
				unregisterPopUpListener(cancel.getActionListeners()[MAIN_POP_UP_LISTENER]);
			}
		});
		
		close.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				resetUIValues(descriptionArea, mfcField, partNoField);
				unregisterPopUpListener(cancel.getActionListeners()[MAIN_POP_UP_LISTENER]);
			}
		});

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
		panel.add(typeLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 1;
		panelConstraints.insets = new Insets(3, 1, 2, 0);
		panel.add(typeCombo, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 2;
		panelConstraints.insets = new Insets(0, 0, 20, 0);
		panel.add(descriptionLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 2;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(scrollDescription, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 3;
		panel.add(partNoLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 3;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(partNoField, panelConstraints);

		panelConstraints.fill = GridBagConstraints.HORIZONTAL;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 4;
		panel.add(mfcLabel, panelConstraints);

		panelConstraints.gridx = 1;
		panelConstraints.gridy = 4;
		panelConstraints.insets = new Insets(3, 1, 0, 0);
		panel.add(mfcField, panelConstraints);

		footerConstraints.fill = GridBagConstraints.HORIZONTAL;
		footerConstraints.gridx = 0;
		footerConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 1, 0, 1);
		footer.add(save, footerConstraints);

		footerConstraints.fill = GridBagConstraints.HORIZONTAL;
		footerConstraints.gridx = 1;
		footerConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 1, 0, 1);
		footer.add(cancel, footerConstraints);

		footerConstraints.fill = GridBagConstraints.HORIZONTAL;
		footerConstraints.gridx = 2;
		footerConstraints.gridy = 0;
		panelConstraints.insets = new Insets(0, 0, 0, 3);
		footer.add(close, footerConstraints);

		panelConstraints.gridx = 0;
		panelConstraints.gridy = 5;
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
		resetUIValues(descriptionArea, partNoField, mfcField);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public boolean validateComponents(JComponent... components) {
		boolean validated = true;
		for (int i = 0; i < components.length; i++) {
			if (components[i] instanceof JTextComponent ) {
				JTextComponent component = (JTextComponent) components[i]; 
				if (component.getText().isEmpty()) {
					component.setBorder(BorderFactory.createLineBorder(Color.RED));
					validated = false;
				}
			}
		}
		return validated;
	}

	@Override
	public void resetUIValues(JComponent... components) {
		for (int i = 0; i < components.length; i++) {
			components[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if (components[i] instanceof JTextComponent ) {
				((JTextComponent) components[i]).setText("");				
			}
		}
	}

	@Override
	public void registerPopUpExitListener(ActionListener actionListener) {
		close.addActionListener(actionListener);
		cancel.addActionListener(actionListener);
	}

	@Override
	public void unregisterPopUpListener(ActionListener actionListener) {
		close.removeActionListener(actionListener);
		cancel.addActionListener(actionListener);
	}
	
}
