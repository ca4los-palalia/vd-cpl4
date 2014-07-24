package com.cplsys.aisa.utils;

import java.awt.event.ActionListener;

import com.cplsys.aisa.domain.Modulo;

public abstract class ModuloActionListener implements ActionListener {
	private Modulo modulo;

	public ModuloActionListener() {
		modulo = new Modulo();
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

}
