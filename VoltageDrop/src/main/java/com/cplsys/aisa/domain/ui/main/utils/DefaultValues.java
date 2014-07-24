package com.cplsys.aisa.domain.ui.main.utils;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cplsys.aisa.domain.Modulo;
import com.cplsys.aisa.services.ModuloService;

@Repository
public class DefaultValues {
	@Autowired
	private ModuloService moduloService;

	@PostConstruct
	public void init() {
		populateModules();
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
}
