package com.cplsys.aisa.domain.ui.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.domain.ui.main.utils.MainFrameVariables;
import com.cplsys.aisa.utils.VoltageDropConstants;

@Repository
public class MainFrame extends MainFrameVariables {

	private static final long serialVersionUID = -6509304242603807376L;

	@Autowired
	private WorkSpacePanel workSpacePanel;
	
	@PostConstruct
	@Override
	public void init() {
		initObjects();
		initProperties();
		initListeners();
		createUI();
	}

	@Override
	public void initListeners() {
		ARCHIVO: {
			abrir.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.err.println("Abrir");
				}
			});
			guardar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Guardar");
				}
			});
			guardarTodo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Guardar todo");
				}
			});
			imprimir.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});

			salir.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});

			copiar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			cortar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			pegar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
		}
	}

	@Override
	public void initProperties() {
		menuGridBagConstraints.weightx = 1.0;
		
		MENU_ITEM: {
			abrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
					ActionEvent.CTRL_MASK));
			guardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
					ActionEvent.CTRL_MASK));
			guardarTodo = new JMenuItem("Guardar Todo");
			imprimir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,
					ActionEvent.CTRL_MASK));
			salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
					ActionEvent.CTRL_MASK));
			copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
					ActionEvent.CTRL_MASK));
			cortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
					ActionEvent.CTRL_MASK));
			pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
					ActionEvent.CTRL_MASK));
			caidaVoltaje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
					ActionEvent.ALT_MASK));
			acercaDe = new JMenuItem("Acerca de");
		}
	}

	@Override
	public void initObjects() {
		MENU: {
			menuBar = new JMenuBar();
			archivo = new JMenu("Archivo");
			edicion = new JMenu("Edición");
			modulos = new JMenu("Módulos");
			about = new JMenu("About");
		}
		MENU_ITEM: {
			abrir = new JMenuItem("Abrir");
			guardar = new JMenuItem("Guardar");
			guardarTodo = new JMenuItem("Guardar Todo");
			imprimir = new JMenuItem("Imprimir");
			salir = new JMenuItem("Salir");
			copiar = new JMenuItem("Copiar");
			cortar = new JMenuItem("Cortar");
			pegar = new JMenuItem("Pegar");
			caidaVoltaje = new JMenuItem("Caida de voltaje");
			acercaDe = new JMenuItem("Acerca de");
		}
	}

	@Override
	public void createUI() {
		TOOL_BAR: {
			menuBar.add(archivo);
			menuBar.add(edicion);
			menuBar.add(modulos);
			menuBar.add(about);
		}

		MENU_ITEMS: {
			ARCHIVO: {
				archivo.add(abrir);
				archivo.add(guardar);
				archivo.add(guardarTodo);
				archivo.add(imprimir);
				archivo.add(salir);
			}
			EDICION: {
				edicion.add(copiar);
				edicion.add(cortar);
				edicion.add(pegar);
			}

			MODULOS: {
				List<Modulo> modulos = loadModules();
				for (Modulo modulo : modulos) {
					JMenuItem item = new JMenuItem(modulo.getProductName());
					item.setIcon(VoltageDropConstants.moduleIcons.get(modulo
							.getSerial()));
					this.modulos.add(item);
				}
			}
			ABOUT: {
				about.add(acercaDe);
			}
		}

		this.setJMenuBar(menuBar);
		this.getContentPane().add(workSpacePanel);
		
	}
	
	private List<Modulo> loadModules() {
		return servicesLayer.getModuloService().getAll();
	}

}
