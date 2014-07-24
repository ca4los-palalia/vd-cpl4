package com.cplsys.aisa.utils;

import java.util.HashMap;

public class VoltageDropConstants {

	public final static HashMap<Long, Class<?>> MODULE_MAP = new HashMap<Long, Class<?>>();

	static {
		try {
			MODULE_MAP.put(
					6576152466060289826L,
					ClassLoader.getSystemClassLoader().loadClass(
							"com.cplsys.aisa.domain.ui.VoltageDropView"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
