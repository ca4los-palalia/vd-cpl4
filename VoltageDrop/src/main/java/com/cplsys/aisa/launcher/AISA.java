package com.cplsys.aisa.launcher;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.main.MainFrame;

@Repository
public class AISA implements Runnable {

	@Autowired
	private MainFrame frame;

	@Override
	public void run() {
		frame.pack();
		frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
