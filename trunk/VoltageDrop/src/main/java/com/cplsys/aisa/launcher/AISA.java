package com.cplsys.aisa.launcher;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.VoltageDropView;

@Repository
public class AISA implements Runnable {

	@Autowired
	private VoltageDropView voltageDropView;
	
	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.getContentPane().add(voltageDropView);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
