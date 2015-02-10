package com.cplsys.aisa.ui.main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.modules.CircuitProtectionsView;
import com.cplsys.aisa.modules.ControlPanelCoolingReport;
import com.cplsys.aisa.modules.ControlPanelView;
import com.cplsys.aisa.modules.LenghtAccVoltageView;
import com.cplsys.aisa.modules.LoadsScheduleView;
import com.cplsys.aisa.modules.MotorScheduleView;
import com.cplsys.aisa.modules.PowerFeedingView;
import com.cplsys.aisa.modules.SizingConduitView;
import com.cplsys.aisa.modules.WireSizeView;
import com.cplsys.aisa.modules.configuration.ContactorConfig;
import com.cplsys.aisa.modules.configuration.ControlTransformer;
import com.cplsys.aisa.modules.configuration.MotorProtectorConfig;
import com.cplsys.aisa.modules.configuration.OtherLoadsConfig;
import com.cplsys.aisa.modules.configuration.OverLoadRelayConfig;
import com.cplsys.aisa.modules.configuration.PLCDeviceConfig;
import com.cplsys.aisa.modules.configuration.PilotLampConfig;
import com.cplsys.aisa.modules.configuration.PowerSupplyConfig;
import com.cplsys.aisa.ui.VoltageDropView;
import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;
import com.cplsys.aisa.ui.main.utils.MainFrameVariables;
import com.cplsys.aisa.utils.ModuloActionListener;
import com.cplsys.aisa.utils.SpannngSession;
import com.cplsys.aisa.utils.SpannungConstants;

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
	private SpannngSession voltageDropSession;
	@Autowired
	private ContactorConfig contactorConfig;
	@Autowired
	private MotorProtectorConfig motorProtectorConfig;
	@Autowired
	private OverLoadRelayConfig overloadRelayConfig;
	@Autowired
	private PowerSupplyConfig powerSupplyConfig;
	@Autowired
	private PLCDeviceConfig plcDeviceConfig;
	@Autowired
	private PilotLampConfig pilotLampConfig;
	@Autowired
	private ControlTransformer controlTransformer;
	@Autowired
	private OtherLoadsConfig otherLoadsConfig;
	@Autowired
	private ControlPanelCoolingReport controlPanelCoolingReport;
	
	private ActionListener popUpExitListener; 

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
			lenghtAccVoltage = new JMenuItem("Lenght Acc. Voltaje");
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
		CONTROL_PANEL: {
			controlPanelDialog = new JDialog();
		}
	}

	@Override
	public void initListeners() {
		ARCHIVO: {
			newFile.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultUIStructure iFace = getPanelEnEjecucion();
					if (iFace != null) {
						iFace.nuevo();
					} else {
						saveNewFile();
					}						
				}
			});
			open.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					DefaultUIStructure iFace = getPanelEnEjecucion();
					if (iFace != null) {
						iFace.abrir();
					} else {
						openFileChooser();
					}
				}
			});
			save.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultUIStructure iFace = getPanelEnEjecucion();
					if (iFace != null) {
						iFace.guardar();	
					} else {
						
					}
				}
			});
			saveAs.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Guardar todo");
				}
			});

			exportTo.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultUIStructure iFace = getPanelEnEjecucion();
					if (iFace != null) {
						iFace.exportar();
					} else {
						
					}
				}
			});

			printReport.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultUIStructure iFace = getPanelEnEjecucion();
					if (iFace != null) {
						iFace.print();
					}
				}
			});

			exit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultUIStructure iFace = getPanelEnEjecucion();
					if (iFace != null) {
						iFace.salir();
					}
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
	
		popUpExitListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlPanelDialog.dispose();
			}
		};

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

		CONTROL_PANEL: {
			controlPanelDialog.setAlwaysOnTop(true);
			controlPanelDialog.setSize(300, 280);
			controlPanelDialog.setLocationRelativeTo(null);
			controlPanelDialog.setResizable(false);
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
				if (modulos == null)
					return;
				for (final Modulo modulo : modulos) {
					JMenuItem item = new JMenuItem(modulo.getProductName());

					if (modulo.getIsParent() != null && modulo.getIsParent()) {
						List<Modulo> children = getChildrenFromModulo(modulo);
						JMenu controlPanel = new JMenu(modulo.getProductName());
						for (Modulo child : children) {
							JMenuItem childItem = new JMenuItem(
									child.getProductName());
							childItem
									.addActionListener(new ModuloActionListener() {

										@Override
										public void actionPerformed(
												ActionEvent e) {
											fireControlPanel(getModulo()
													.getSerial());
										}
									});
							((ModuloActionListener) childItem
									.getActionListeners()[0]).setModulo(child);
							controlPanel.add(childItem);
						}
						this.calculations.add(controlPanel);
					}
					// item.setIcon(new
					// ImageIcon(getClass().getClassLoader().getResource(modulo.getImageLocation())));
					if (modulo.getModulo() == null
							&& modulo.getIsParent() == null) {
						item.addActionListener(new ModuloActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								workSpacePanel.updateWorkSpace(getModulo()
										.getSerial());
							}
						});
						((ModuloActionListener) item.getActionListeners()[0])
								.setModulo(modulo);
						workSpacePanel.add(getModule(modulo.getSerial()),
								String.valueOf(modulo.getSerial()));
						this.calculations.add(item);
					}
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

	private List<Modulo> getChildrenFromModulo(final Modulo modulo) {
		return servicesLayer.getModuloService().getChildren(modulo);
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

		if (contactorConfig.getSerialversionuid() == serial) {
			return contactorConfig;
		}
		if (motorProtectorConfig.getSerialversionuid() == serial) {
			return motorProtectorConfig;
		}
		if (overloadRelayConfig.getSerialversionuid() == serial) {
			return overloadRelayConfig;
		}
		if (plcDeviceConfig.getSerialversionuid() == serial) {
			return plcDeviceConfig;
		}
		if (powerSupplyConfig.getSerialversionuid() == serial) {
			return powerSupplyConfig;
		}
		if (pilotLampConfig.getSerialversionuid() == serial) {
			return pilotLampConfig;
		}
		if (controlTransformer.getSerialversionuid() == serial) {
			return controlTransformer;
		}
		if (otherLoadsConfig.getSerialversionuid() == serial) {
			return otherLoadsConfig;
		}

		return null;
	}

	@Override
	public void print() {

	}

	@Override
	public void nuevo() {

	}

	@Override
	public void abrir() {

	}

	@Override
	public void abrirReciente() {

	}

	private void fireControlPanel(Long serialModule) {
		Component component = getModule(serialModule);
		if (component instanceof DefaultUIStructure) {
			DefaultUIStructure defaultUIStructure = (DefaultUIStructure)component;
			defaultUIStructure.registerPopUpExitListener(popUpExitListener);
		}
		if (component != null) {
			controlPanelDialog.getContentPane().removeAll();
			controlPanelDialog.getContentPane().add(component);
			controlPanelDialog.getContentPane().validate();
			controlPanelDialog.getContentPane().repaint();
			controlPanelDialog.setVisible(true);
		}
	}

	@Override
	public void guardar() {

	}

	@Override
	public void exportar() {

	}

	@Override
	public void salir() {

	}

	private DefaultUIStructure getPanelEnEjecucion() {
		DefaultUIStructure iFace = null;
		Long numeroSerie = (Long) voltageDropSession
				.getValueFromSession(SpannngSession.CURRENT_MODULE);
		Class<?> classToLoad = SpannungConstants.MODULE_MAP.get(numeroSerie);
		try {
			Object modulo = Class.forName(classToLoad.getName()).newInstance();
			if (modulo instanceof DefaultUIStructure)
				iFace = (DefaultUIStructure) modulo;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return iFace;
	}

	@Override
	public boolean validateComponents(JComponent... component) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetUIValues(JComponent... components) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerPopUpExitListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterPopUpListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
	
	private void openFileChooser() {
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(this);
	}
	
	private void saveNewFile() {
	    String sb = "TEST CONTENT";
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("Electric Files", "xvd", "xpf", "xla", "xws", "xsc", "xcp", "xmc", "xlsc");
        
        
	    JFileChooser chooser = new JFileChooser();
	    chooser.addChoosableFileFilter(filter);
	    chooser.setCurrentDirectory(new File("/home/me/Documents"));
	    int retrival = chooser.showSaveDialog(null);
	    if (retrival == JFileChooser.APPROVE_OPTION) {
	        try {
	            FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt");
	            fw.write(sb.toString());
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
}
