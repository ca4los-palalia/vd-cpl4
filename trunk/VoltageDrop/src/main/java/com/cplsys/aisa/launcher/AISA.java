package com.cplsys.aisa.launcher;

import javax.swing.JFrame;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.ui.VoltageDropView;

@Repository
public class AISA implements Runnable {

	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new VoltageDropView());
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
