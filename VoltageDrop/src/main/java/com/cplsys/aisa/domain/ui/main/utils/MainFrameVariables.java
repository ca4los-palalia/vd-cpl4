package com.cplsys.aisa.domain.ui.main.utils;

import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.springframework.beans.factory.annotation.Autowired;

import com.cplsys.aisa.utils.ServicesLayer;

public abstract class MainFrameVariables extends JFrame implements
		DefaultUIStructure {

	private static final long serialVersionUID = -7508083727357748068L;

	@Autowired
	protected ServicesLayer servicesLayer;

	protected GridBagConstraints menuGridBagConstraints = new GridBagConstraints();

	protected JMenuBar menuBar;
	protected JMenu archivo;
	protected JMenuItem abrir;
	protected JMenuItem guardar;
	protected JMenuItem guardarTodo;
	protected JMenuItem imprimir;
	protected JMenuItem salir;

	protected JMenu edicion;
	protected JMenuItem copiar;
	protected JMenuItem cortar;
	protected JMenuItem pegar;

	protected JMenu modulos;
	protected JMenuItem caidaVoltaje;

	protected JMenu about;
	protected JMenuItem acercaDe;

}
