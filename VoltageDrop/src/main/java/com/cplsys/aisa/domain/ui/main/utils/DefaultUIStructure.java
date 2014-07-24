package com.cplsys.aisa.domain.ui.main.utils;

import java.io.Serializable;

public interface DefaultUIStructure extends Serializable {

	public void init();

	public void initObjects();

	public void initProperties();

	public void initListeners();

	public void createUI();

	public void print();

}
