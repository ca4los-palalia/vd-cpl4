package com.cplsys.aisa.modules.variables;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.cplsys.aisa.ui.main.utils.DefaultUIStructure;

public abstract class ControlPanelCoolingReportVariables extends JPanel implements DefaultUIStructure {
    
    private static final long   serialVersionUID = 3678785672473851817L;
    protected JLabel            contractorTitle;
    protected JComboBox<Object> contractorCombo;
    protected JLabel            customerLabel;
    protected JComboBox<Object> customerCombo;
    protected JLabel            jobNo;
    protected JTextField        jobNoField;
    
    protected JLabel            grossSheetMetalSurfaceLabel;
    protected JLabel            gsmsHeight;
    protected JLabel            gsmsWidth;
    protected JLabel            gsmsHeight2;
    protected JTextField        gsmsaHeightField;
    protected JTextField        gsmsaWidth;
    protected JTextField        gsmsaHeightField2;
    
    protected JLabel            obstructedAreaTitle;
    protected JTextField        oaTopSurfaceField;
    protected JTextField        oaBackSurfaceField;
    protected JTextField        oaFrontSideField;
    protected JTextField        oaRigthSideField;
    protected JTextField        oaLeftSideField;
    protected JLabel            oaTopSurface;
    protected JLabel            oaBackSurface;
    protected JLabel            oaFrontSideSurface;
    protected JLabel            oaRighSideSurface;
    protected JLabel            oaLeftSideSurface;
    
    protected JLabel            ambientTemperatureTitle;
    protected JTextField        atField;
    protected JTextArea         atDescription;
    
    protected JLabel            maximunControlPanelOperatingTemperaturLabel;
    protected JTextField        mcpotField;
    protected JTextArea         mcpotArea;
    
    protected JLabel            heatDissipationCapacityTitle;
    protected JLabel            hdcLabel;
    protected JTextField        hdcField;
    
    protected JLabel            controlPanelHeatLoadTitle;
    protected JLabel            cphlMagneticHeatLoadLabel;
    protected JLabel            cphlPLCHeatLoadWattsLabel;
    protected JLabel            cphlTotalHeatLoadWattsLabel;
    protected JTextField        cphlTotalHeatLoadWatts;
    protected JButton           cphlMagneticHeatLoadButton;
    protected JButton           cphlPLCHeatLoadWattsButton;
    
    protected JLabel            heatDissipationDeficiencyTitle;
    protected JTextField        hddField;
    
    protected JLabel            resultTitle;
    protected JComboBox<Object> resultCombo;
    
    public void graphicInterfaceBuilder(JComponent component) {
	this.add(component);
    }
}
