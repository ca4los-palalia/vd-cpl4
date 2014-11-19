package com.cplsys.aisa.ui.main.utils;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.Coil;
import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.services.CircuitLenghtService;
import com.cplsys.aisa.services.CoilService;
import com.cplsys.aisa.services.ConductorSizeService;
import com.cplsys.aisa.services.ConductorTypeService;
import com.cplsys.aisa.services.ConduitTypeService;
import com.cplsys.aisa.services.ModuloService;
import com.cplsys.aisa.services.SystemTypeService;

@Component
public class DefaultValues {
    
    @Autowired
    private ModuloService        moduloService;
    
    @Autowired
    private CircuitLenghtService circuitLenghtService;
    
    @Autowired
    private ConductorSizeService conductorSizeService;
    
    @Autowired
    private ConductorTypeService conductorTypeService;
    
    @Autowired
    private ConduitTypeService   conduitTypeService;
    
    @Autowired
    private SystemTypeService    systemTypeService;
    
    @Autowired
    private CoilService          coilService;
    
    @PostConstruct
    public void init() {
	populateModules();
	insercionesParaCatalogosDropVoltage();
	populateCoilValues();
	
    }
    
    private void populateModules() {
	List<Modulo> modulos = moduloService.getAll();
	if (modulos == null) {
	    Modulo modulo = new Modulo();
	    
	    modulo.setImageLocation("voltageDrop.png");
	    modulo.setProductName("Voltage Drop");
	    modulo.setSerial(6576152466060289826L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setImageLocation("powerFeeding.png");
	    modulo.setProductName("Power Feeding");
	    modulo.setSerial(3775741598821605876L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setImageLocation("acsource.png");
	    modulo.setProductName("Lenght Acc. Voltage");
	    modulo.setSerial(7509728603831286824L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setImageLocation("wire.png");
	    modulo.setProductName("Wire Size");
	    modulo.setSerial(-1650032819745231443L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setProductName("Sizing Conduit");
	    modulo.setSerial(-6478073798353657954L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setImageLocation("ground.png");
	    modulo.setProductName("Circuit Protections");
	    modulo.setSerial(-8731607393812645120L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setImageLocation("motor.png");
	    modulo.setProductName("Motor Schedue Panel");
	    modulo.setSerial(-1758049454375352918L);
	    moduloService.save(modulo);
	    
	    Modulo controlPanel = new Modulo();
	    controlPanel.setProductName("Control Panel ");
	    controlPanel.setIsParent(true);
	    controlPanel.setSerial(-2644859945680670748L);
	    moduloService.save(controlPanel);
	    
	    modulo = new Modulo();
	    modulo.setProductName("Load Schedule");
	    modulo.setSerial(-3142283501643462972L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Contactor");
	    modulo.setSerial(-3073823385587179424L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Overload Relay");
	    modulo.setSerial(3117492300673511308L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Motor Protector");
	    modulo.setSerial(-210399773174332828L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("PLC's Device");
	    modulo.setSerial(3098382023218932519L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Power Supply");
	    modulo.setSerial(3357047582374837829L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Control Transformer");
	    modulo.setSerial(-3064932842249392725L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Pilot Lamp");
	    modulo.setSerial(3828170234067366470L);
	    moduloService.save(modulo);
	    
	    modulo = new Modulo();
	    modulo.setModulo(controlPanel);
	    modulo.setProductName("Other Loads");
	    modulo.setSerial(8204122911914966685L);
	    moduloService.save(modulo);
	}
    }
    
    private void insercionesParaCatalogosDropVoltage() {
	List<CircuitLenght> lista = circuitLenghtService.getAll();
	if (lista == null) {
	    CircuitLenght circuitLenght = new CircuitLenght();
	    circuitLenght.setNombre("Feet");
	    circuitLenghtService.save(circuitLenght);
	    
	    circuitLenght = new CircuitLenght();
	    circuitLenght.setNombre("Meters");
	}
	/*
	 * servicesLayer.getConductorSizeService().getAll();
	 * servicesLayer.getConductorTypeService().getAll();
	 * servicesLayer.getConduitTypeService().getAll();
	 * servicesLayer.getSystemTypeService().getAll();
	 */
    }
    
    private void populateCoilValues() {
	List<Coil> coilValues = coilService.getAll();
	if (coilValues.isEmpty()) {
	    Coil coil = new Coil();
	    coil.setRange("24 VDC");
	    coilService.save(coil);
	    
	    coil = new Coil();
	    coil.setRange("24 VAC");
	    coilService.save(coil);
	    
	    coil = new Coil();
	    coil.setRange("110-127 VAC");
	    coilService.save(coil);
	    
	    coil = new Coil();
	    coil.setRange("220-240 VAC");
	    coilService.save(coil);
	    
	    coil = new Coil();
	    coil.setRange("440VAC");
	    coilService.save(coil);
	}
    }
    
}
