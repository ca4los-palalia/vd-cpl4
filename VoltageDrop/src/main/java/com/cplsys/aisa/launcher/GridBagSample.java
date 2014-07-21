package com.cplsys.aisa.launcher;

import javax.swing.JFrame;

public class GridBagSample extends JFrame {

	private static final long serialVersionUID = -2227131117727286858L;

	public GridBagSample() {
		initComponents();
	}

	private void initComponents() {
		javax.swing.JLabel jLabel1;
		javax.swing.JLabel jLabel2;
		javax.swing.JTextField jTextField2;

		java.awt.GridBagConstraints gridBagConstraints;

		jLabel1 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.GridBagLayout());
		
		jLabel1.setText("Nombre:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
		getContentPane().add(jLabel1, gridBagConstraints);

		jTextField2.setText("Texto demostrativo para redimensión");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.weightx = 1.0; 
		getContentPane().add(jTextField2, gridBagConstraints);
		
		jLabel2.setText("ABC");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
		getContentPane().add(jLabel2, gridBagConstraints);

		pack();
	}
}