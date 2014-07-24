package com.cplsys.aisa.domain.ui.main.utils;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.services.CircuitLenghtService;
import com.cplsys.aisa.services.ConductorSizeService;
import com.cplsys.aisa.services.ConductorTypeService;
import com.cplsys.aisa.services.ConduitTypeService;
import com.cplsys.aisa.services.ModuloService;
import com.cplsys.aisa.services.SystemTypeService;
import com.cplsys.aisa.utils.ServicesLayer;

@Component
public class DefaultValues {
	@Autowired
	private ModuloService moduloService;

	@Autowired
	private CircuitLenghtService circuitLenghtService;
	
	@Autowired
	private ConductorSizeService conductorSizeService;
	
	@Autowired
	private ConductorTypeService conductorTypeService;
	
	@Autowired
	private ConduitTypeService conduitTypeService;
	
	@Autowired
	private SystemTypeService systemTypeService;
	
	@PostConstruct
	public void init() {
		populateModules();
		insercionesParaCatalogosDropVoltage();
		
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

			modulo = new Modulo();
			modulo.setProductName("Control Panel ");
			modulo.setSerial(-2644859945680670748L);
			moduloService.save(modulo);

			modulo = new Modulo();
			modulo.setProductName("Load Schedule");
			modulo.setSerial(-3142283501643462972L);
			moduloService.save(modulo);

		}
	}
	
	private void insercionesParaCatalogosDropVoltage(){
		List<CircuitLenght> lista = circuitLenghtService.getAll();
		if(lista == null){
			CircuitLenght circuitLenght = new CircuitLenght();
			circuitLenght.setNombre("Feet");
			circuitLenghtService.save(circuitLenght);
			
			circuitLenght = new CircuitLenght();
			circuitLenght.setNombre("Meters");
		}
		/*servicesLayer.getConductorSizeService().getAll();
		servicesLayer.getConductorTypeService().getAll();
		servicesLayer.getConduitTypeService().getAll();
		servicesLayer.getSystemTypeService().getAll();*/
	}
}
