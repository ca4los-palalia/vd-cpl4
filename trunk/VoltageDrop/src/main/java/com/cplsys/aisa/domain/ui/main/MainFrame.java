package com.cplsys.aisa.domain.ui.main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.domain.ui.VoltageDropView;
import com.cplsys.aisa.domain.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.domain.ui.main.utils.MainFrameVariables;
import com.cplsys.aisa.modules.CircuitProtectionsView;
import com.cplsys.aisa.modules.ControlPanelView;
import com.cplsys.aisa.modules.LenghtAccVoltageView;
import com.cplsys.aisa.modules.LoadsScheduleView;
import com.cplsys.aisa.modules.MotorScheduleView;
import com.cplsys.aisa.modules.PowerFeedingView;
import com.cplsys.aisa.modules.SizingConduitView;
import com.cplsys.aisa.modules.WireSizeView;
import com.cplsys.aisa.utils.ModuloActionListener;
import com.cplsys.aisa.utils.VoltageDropConstants;
import com.cplsys.aisa.utils.VoltageDropSession;

@Repository
public class MainFrame extends MainFrameVariables {

	private static final long serialVersionUID = -6509304242603807376L;

	@Autowired
	private WorkSpacePanel workSpacePanel;
	@Autowired
	private VoltageDropView voltageDropView;
	@Autowired
	private CircuitProtectionsView circuitProtectionsView;
	@Autowired
	private ControlPanelView controlPanelView;
	@Autowired
	private LenghtAccVoltageView lenghtAccVoltageView;
	@Autowired
	private LoadsScheduleView loadsScheduleView;
	@Autowired
	private MotorScheduleView motorScheduleView;
	@Autowired
	private PowerFeedingView powerFeedingView;
	@Autowired
	private SizingConduitView sizingConduitView;
	@Autowired
	public WireSizeView wireSizeView;

	@Autowired
	private VoltageDropSession voltageDropSession;

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
		MENU: {
			menuBar = new JMenuBar();
			file = new JMenu("File");
			edition = new JMenu("Edit");
			calculations = new JMenu("Calculations");
			dataBase = new JMenu("Database");
			settings = new JMenu("Settings");
			about = new JMenu("About");
		}
		MENU_ITEM: {
			open = new JMenuItem("Open");
			openRecent = new JMenuItem("Open recent");
			newFile = new JMenuItem("New");
			save = new JMenuItem("Save");
			saveAs = new JMenuItem("Save as");
			exportTo = new JMenuItem("Export to");
			printReport = new JMenuItem("Print Report");
			exit = new JMenuItem("Exit");

			copy = new JMenuItem("Copy");
			cut = new JMenuItem("Cut");
			paste = new JMenuItem("Paste");

			contactors = new JMenuItem("Contactors");
			guardaMotores = new JMenuItem("Guardamotores");
			circuitBreaker = new JMenuItem("Circuit Breaker");
			fuses = new JMenuItem("Fuses");
			safetySwitches = new JMenuItem("Safety Switches");

			powerFeeding = new JMenuItem("Power Feeding");
			voltageDrop = new JMenuItem("Caida de voltaje");
			lenghtAccVoltage = new JMenuItem("Lenght Acc. Voltabe");
			wireSize = new JMenuItem("Wire Size");
			sizingConduit = new JMenuItem("Sizing conduit");
			circuitProtections = new JMenuItem("Circuit Protections");
			motorSchedule = new JMenuItem("Motor Schedule");
			controlPanel = new JMenuItem("Control Panel");
			loadsSchedule = new JMenuItem("Loads Schedule");

			language = new JMenuItem("Language");

			acercaDe = new JMenuItem("About...");
			help = new JMenuItem("Help");
		}
	}

	@Override
	public void initListeners() {
		ARCHIVO: {
			open.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.err.println("Abrir");
				}
			});
			save.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Guardar");
				}
			});
			saveAs.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Guardar todo");
				}
			});
			printReport.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Long numeroSerie = (Long) voltageDropSession
							.getValueFromSession(VoltageDropSession.CURRENT_MODULE);
					Class<?> classToLoad = VoltageDropConstants.MODULE_MAP
							.get(numeroSerie);

					try {
						Object modulo = Class.forName(classToLoad.getName())
								.newInstance();
						if (modulo instanceof DefaultUIStructure) {
							DefaultUIStructure iFace = (DefaultUIStructure) modulo;
							iFace.print();
						}

					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});

			exit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});

			copy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			cut.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			paste.addActionListener(new ActionListener() {
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
			open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
					ActionEvent.CTRL_MASK));
			save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
					ActionEvent.CTRL_MASK));
			saveAs = new JMenuItem("Guardar Todo");
			printReport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,
					ActionEvent.CTRL_MASK));
			exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
					ActionEvent.CTRL_MASK));
			copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
					ActionEvent.CTRL_MASK));
			cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
					ActionEvent.CTRL_MASK));
			paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
					ActionEvent.CTRL_MASK));
			voltageDrop.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
					ActionEvent.ALT_MASK));
			acercaDe = new JMenuItem("Acerca de");
		}
	}

	@Override
	public void createUI() {
		TOOL_BAR: {
			menuBar.add(file);
			menuBar.add(edition);
			menuBar.add(calculations);
			menuBar.add(about);
		}

		MENU_ITEMS: {
			ARCHIVO: {
				file.add(newFile);
				file.add(open);
				file.add(openRecent);
				file.add(save);
				file.add(saveAs);
				file.add(exportTo);
				file.add(printReport);
				file.add(exit);
			}
			EDICION: {
				edition.add(copy);
				edition.add(cut);
				edition.add(paste);
			}
			DATABASE: {
				dataBase.add(contactors);
				dataBase.add(guardaMotores);
				dataBase.add(circuitBreaker);
				dataBase.add(fuses);
				dataBase.add(safetySwitches);
			}
			CALCULATIONS: {
				List<Modulo> modulos = loadModules();
				if(modulos == null)
					return;
				for (final Modulo modulo : modulos) {
					JMenuItem item = new JMenuItem(modulo.getProductName());
					item.addActionListener(new ModuloActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							workSpacePanel.updateWorkSpace(getModulo()
									.getSerial());
						}
					});
					((ModuloActionListener) item.getActionListeners()[0])
							.setModulo(modulo);
					/*item.setIcon(new ImageIcon(getClass().getClassLoader()
							.getResource(modulo.getImageLocation())));*/
					this.calculations.add(item);
					workSpacePanel.add(getModule(modulo.getSerial()),
							String.valueOf(modulo.getSerial()));
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

	@SuppressWarnings("static-access")
	private Component getModule(final Long serial) {
		if (voltageDropView.getSerialversionuid() == serial) {
			return voltageDropView;
		}
		if (circuitProtectionsView.getSerialversionuid() == serial) {
			return circuitProtectionsView;
		}
		if (controlPanelView.getSerialversionuid() == serial) {
			return controlPanelView;
		}
		if (lenghtAccVoltageView.getSerialversionuid() == serial) {
			return lenghtAccVoltageView;
		}
		if (loadsScheduleView.getSerialversionuid() == serial) {
			return loadsScheduleView;
		}
		if (motorScheduleView.getSerialversionuid() == serial) {
			return motorScheduleView;
		}
		if (powerFeedingView.getSerialversionuid() == serial) {
			return powerFeedingView;
		}
		if (sizingConduitView.getSerialversionuid() == serial) {
			return sizingConduitView;
		}
		if (wireSizeView.getSerialversionuid() == serial) {
			return wireSizeView;
		}

		return null;
	}

	@Override
	public void print() {

	}

}
