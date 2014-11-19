package com.cplsys.aisa.modules.configuration;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.ContactorConfigVariables;

@Repository
public class ContactorConfig extends ContactorConfigVariables {
    
    private static final long serialVersionUID = 3073823385587179424L;
    
    @PostConstruct
    @Override
    public void init() {
	initObjects();
	createUI();
    }
    
    @Override
    public void initObjects() {
	title = new JLabel("CONTACTOR");
	partNo = new JLabel("Part No");
	size = new JLabel("Size (A)");
	coilV = new JLabel("Coil (V)");
	coilVA = new JLabel("Coil (VA)");
	mfc = new JLabel("MFC");
	
	sizeField = new JTextField(15);
	partField = new JTextField(15);
	coildCombo = new JComboBox<Object>();
	coilVAField = new JTextField(15);
	mfcField = new JTextField(15);
    }
    
    @Override
    public void initProperties() {
	title.setAlignmentX(CENTER_ALIGNMENT);
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
	panel.add(size, panelConstraints);
	
	panelConstraints.gridx = 1;
	panelConstraints.gridy = 1;
	panelConstraints.insets = new Insets(3, 1, 0, 0);
	panel.add(sizeField, panelConstraints);
	
	panelConstraints.fill = GridBagConstraints.HORIZONTAL;
	// gbc.ipady = 20;
	panelConstraints.gridx = 0;
	panelConstraints.gridy = 2;
	panel.add(partNo, panelConstraints);
	
	panelConstraints.gridx = 1;
	panelConstraints.gridy = 2;
	panelConstraints.insets = new Insets(3, 1, 0, 0);
	panel.add(partField, panelConstraints);
	
	panelConstraints.fill = GridBagConstraints.HORIZONTAL;
	panelConstraints.gridx = 0;
	panelConstraints.gridy = 3;
	panel.add(coilV, panelConstraints);
	
	panelConstraints.gridx = 1;
	panelConstraints.gridy = 3;
	panelConstraints.insets = new Insets(3, 1, 0, 0);
	panel.add(coildCombo, panelConstraints);
	
	panelConstraints.fill = GridBagConstraints.HORIZONTAL;
	panelConstraints.gridx = 0;
	panelConstraints.gridy = 4;
	panel.add(coilVA, panelConstraints);
	
	panelConstraints.gridx = 1;
	panelConstraints.gridy = 4;
	panelConstraints.insets = new Insets(3, 1, 0, 0);
	panel.add(coilVAField, panelConstraints);
	
	panelConstraints.fill = GridBagConstraints.HORIZONTAL;
	panelConstraints.gridx = 0;
	panelConstraints.gridy = 5;
	panelConstraints.anchor = GridBagConstraints.PAGE_END;
	panel.add(mfc, panelConstraints);
	
	panelConstraints.gridx = 1;
	panelConstraints.gridy = 5;
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
	panelConstraints.insets = new Insets(50, 0, 0, 0);
	panel.add(footer, panelConstraints);
	
	graphicInterfaceBuilder(panel);
    }
    
    @Override
    public void nuevo() {
	
    }
    
    @Override
    public void abrir() {
	
    }
    
    @Override
    public void abrirReciente() {
	
    }
    
    @Override
    public void guardar() {
	
    }
    
    @Override
    public void exportar() {
	
    }
    
    @Override
    public void print() {
	
    }
    
    @Override
    public void salir() {
	
    }
    
    public static long getSerialversionuid() {
	return serialVersionUID;
    }
    
}
