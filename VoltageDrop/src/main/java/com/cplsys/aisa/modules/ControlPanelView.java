package com.cplsys.aisa.modules;

import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.JComponent;

import org.springframework.stereotype.Repository;

import com.cplsys.aisa.modules.variables.ControlPanelVariables;

@Repository
public class ControlPanelView extends ControlPanelVariables {
    
    private static final long serialVersionUID = -2644859945680670748L;
    
    @PostConstruct
    @Override
    public void init() {
	System.out.println("ControlPanelView.init()");
    }
    
    @Override
    public void initListeners() {
	
    }
    
    @Override
    public void initProperties() {
	
    }
    
    @Override
    public void initObjects() {
	
    }
    
    @Override
    public void createUI() {
	
    }
    
    public static long getSerialversionuid() {
	return serialVersionUID;
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
