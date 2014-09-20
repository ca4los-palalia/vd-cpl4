package com.cplsys.aisa.ui.main.utils;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;

public abstract class WorkSpacePanelVariables extends JPanel {

	private static final long serialVersionUID = 4870991280083441743L;

	protected GridBagConstraints globalConstraint = new GridBagConstraints();
	protected GridBagConstraints gridConstraint = new GridBagConstraints();
	protected CardLayout cardManager;
}
