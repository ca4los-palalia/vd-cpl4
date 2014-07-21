package com.cplsys.aisa.domain.ui.main.utils;

import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public abstract class MaiFrameVariables extends JFrame implements
		DefaultUIStructure {

	private static final long serialVersionUID = -7508083727357748068L;

	protected GridBagConstraints gridBagConstraints = new GridBagConstraints();
	protected JMenuBar menuBar;
	
}
