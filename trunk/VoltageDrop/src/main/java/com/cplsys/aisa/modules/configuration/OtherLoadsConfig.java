package com.cplsys.aisa.modules.configuration;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.OtherLoadsVariables;

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
	
	typeCombo = new JComboBox<Object>();
	descriptionArea = new JTextArea();
	partNoField = new JTextField(15);
	wattsField = new JTextField(15);
	mfcField = new JTextField(15);
	scrollDescription = new JScrollPane(descriptionArea);
    }
    
    @Override
    public void initProperties() {
	descriptionArea.setLineWrap(true);
	descriptionArea.setPreferredSize(new Dimension(170, 20));
    }
    
    @Override
    public void initListeners() {
	// TODO Auto-generated method stub
	
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
	// TODO Auto-generated method stub
	
    }
    
    public static long getSerialversionuid() {
	return serialVersionUID;
    }
}
