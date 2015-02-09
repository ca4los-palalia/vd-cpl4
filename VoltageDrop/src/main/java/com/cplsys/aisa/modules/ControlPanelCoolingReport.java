package com.cplsys.aisa.modules;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.ControlPanelCoolingReportVariables;

@Repository
public class ControlPanelCoolingReport extends ControlPanelCoolingReportVariables {
    
    private static final long serialVersionUID = 1362549576145814674L;
    
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
	contractorTitle = new JLabel("Contractor");
	contractorCombo = new JComboBox<Object>();
	customerLabel = new JLabel("Customer");
	customerCombo = new JComboBox<Object>(new Vector<Object>());
	jobNo = new JLabel("JOB No:");
	jobNoField = new JTextField();
	
	grossSheetMetalSurfaceLabel = new JLabel("1. Gross Sheet Metal Surface");
	gsmsHeight = new JLabel("HEIGHT(mm)");
	gsmsWidth = new JLabel("WIDTH(mm)");
	gsmsHeight2 = new JLabel("HEIGHT(mm)");
	gsmsaHeightField = new JTextField();
	gsmsaWidth = new JTextField();
	gsmsaHeightField2 = new JTextField();
	
	obstructedAreaTitle = new JLabel("2. % Obstructed Area");
	oaTopSurfaceField = new JTextField();
	oaBackSurfaceField = new JTextField();
	oaRigthSideField = new JTextField();
	oaLeftSideField = new JTextField();
	
	oaTopSurface = new JLabel("Top Surface");
	oaBackSurface = new JLabel("Back Surface");
	oaFrontSideSurface = new JLabel("Front Side Surface");
	oaRighSideSurface = new JLabel("Right Side Surface");
	oaLeftSideSurface = new JLabel("Left Side Surface");
	
	ambientTemperatureTitle = new JLabel("3. Ambient Temperature");
	atField = new JTextField();
	atDescription = new JTextArea();
	
	maximunControlPanelOperatingTemperaturLabel = new JLabel("4. Maximun Control Panel Operating Temperature");
	mcpotField = new JTextField();
	mcpotArea = new JTextArea();
	
	heatDissipationCapacityTitle = new JLabel("Heat Dissipation Capacity");
	hdcLabel = new JLabel("TOTAL HEAT DISSIPATION CAPACITY (WATTS)");
	hdcField = new JTextField();
	
	controlPanelHeatLoadTitle = new JLabel("6. Control Panel Heat Load");
	cphlMagneticHeatLoadLabel = new JLabel("Magnetic Heat Load (Watts)");
	cphlPLCHeatLoadWattsLabel = new JLabel("PLC Heat Load (Watts)");
	cphlTotalHeatLoadWattsLabel = new JLabel("Total Heat Load (Watts");
	cphlTotalHeatLoadWatts = new JTextField();
	cphlMagneticHeatLoadButton = new JButton("Add File");
	cphlPLCHeatLoadWattsButton = new JButton("Add File");
	
	heatDissipationDeficiencyTitle = new JLabel("7. Heat Dissipation Deficiency");
	hddField = new JTextField();
	
	resultTitle = new JLabel("8. Result");
	resultCombo = new JComboBox<>(new Vector<Object>());
	
    }
    
    @Override
    public void initProperties() {
	// TODO Auto-generated method stub
	
    }
    
    @Override
    public void initListeners() {
	// TODO Auto-generated method stub
	
    }
    
    @Override
    public void createUI() {
	JPanel panel = new JPanel();
	JPanel footer = new JPanel();
	
	footer.setLayout(new GridBagLayout());
	panel.setLayout(new GridBagLayout());
	
	GridBagConstraints panelConstraints = new GridBagConstraints();
	GridBagConstraints footerConstraints = new GridBagConstraints();
	
	panelConstraints.fill = GridBagConstraints.CENTER;
	panelConstraints.gridx = 0;
	panelConstraints.gridy = 0;
	panelConstraints.insets = new Insets(0, 0, 10, 0);
	panel.add(contractorTitle, panelConstraints);
	panelConstraints = new GridBagConstraints();
	
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
    
    @Override
    public void guardar() {
	
    }
    
    @Override
    public void exportar() {
	
    }
    
    @Override
    public void print() {
	
    }
    
    @Override
    public void salir() {
	
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
    
}
