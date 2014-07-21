package com.cplsys.aisa.domain.ui.main.utils;

import java.io.Serializable;

public interface DefaultUIStructure extends Serializable {

	public void createUI();

	public void init();

	public void initListeners();

	public void initProperties();

	public void initObjects();

}
