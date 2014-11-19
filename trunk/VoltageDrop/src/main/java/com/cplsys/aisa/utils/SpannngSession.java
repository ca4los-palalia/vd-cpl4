package com.cplsys.aisa.utils;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class SpannngSession {

	public final static String CURRENT_MODULE = "CURRENT_MODULE";
	public final static String CLIENT = "CLIENT";

	private HashMap<String, Object> voltageDropSession = new HashMap<String, Object>();

	public void addVariableToSession(final String key, final Object value) {
		voltageDropSession.put(key, value);
	}

	public Object getValueFromSession(final String key) {
		return voltageDropSession.get(key);
	}

}
