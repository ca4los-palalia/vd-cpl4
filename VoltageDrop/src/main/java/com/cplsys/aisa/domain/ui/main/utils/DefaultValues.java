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
			modulo.setSerial(6576152466060289827L);
			moduloService.save(modulo);

			modulo = new Modulo();
			modulo.setImageLocation("acsource.png");
			modulo.setProductName("Lenght Acc. Voltage");
			modulo.setSerial(6576152466060289828L);
			moduloService.save(modulo);

			modulo = new Modulo();
			modulo.setImageLocation("wire.png");
			modulo.setProductName("Wire Size");
			modulo.setSerial(6576152466060289829L);
			moduloService.save(modulo);

			modulo = new Modulo();
			modulo.setProductName("Sizing Conduit");
			modulo.setSerial(6576152466060289830L);
			moduloService.save(modulo);

			modulo = new Modulo();
			modulo.setImageLocation("ground.png");
			modulo.setProductName("Circuit Protections");
			modulo.setSerial(6576152466060289831L);
			moduloService.save(modulo);
		}
	}
}
