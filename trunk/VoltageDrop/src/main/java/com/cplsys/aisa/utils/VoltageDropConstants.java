package com.cplsys.aisa.utils;

import java.util.HashMap;

public class VoltageDropConstants {

	public final static HashMap<Long, Class<?>> componentMap = new HashMap<Long, Class<?>>();

	static {
		try {
			componentMap.put(
					6576152466060289826L,
					ClassLoader.getSystemClassLoader().loadClass(
							"com.cplsys.aisa.domain.ui.VoltageDropView"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
