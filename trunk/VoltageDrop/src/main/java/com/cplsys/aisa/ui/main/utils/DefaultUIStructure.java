package com.cplsys.aisa.ui.main.utils;

import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JComponent;

public interface DefaultUIStructure extends Serializable {
    
    public void init();
    
    public void initObjects();
    
    public void initProperties();
    
    public void initListeners();
    
    public void createUI();
    
    public void nuevo();
    
    public void abrir();
    
    public void abrirReciente();
    
    public void guardar();
    
    public void exportar();
    
    public void print();
    
    public void salir();
    
    public boolean validateComponents(JComponent... components);
    
    public void resetUIValues(JComponent...components);
    
    public void registerPopUpExitListener(ActionListener actionListener);
    
    public void unregisterPopUpListener(ActionListener actionListener);
    
}
