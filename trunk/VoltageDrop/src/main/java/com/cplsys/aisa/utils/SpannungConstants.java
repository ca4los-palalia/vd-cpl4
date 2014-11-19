package com.cplsys.aisa.utils;

import java.util.HashMap;

public class SpannungConstants {
    
    public final static HashMap<Long, Class<?>> MODULE_MAP             = new HashMap<Long, Class<?>>();
    
    static {
	try {
	    MODULE_MAP.put(6576152466060289826L, ClassLoader.getSystemClassLoader().loadClass("com.cplsys.aisa.domain.ui.VoltageDropView"));
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }
    
    public static final String                  CONDUCTOR_TYPE_CU      = "Cu";
    public static final String                  CONDUCTOR_TYPE_AL      = "Al";
    public static final String                  CONDUIT_TYPE_ALUMINIUM = "Aluminium";
    public static final String                  CONDUIT_TYPE_PVC       = "PVC";
    public static final String                  CONDUIT_TYPE_STEEL     = "Steel";
    public static final Float                   CIRCUIT_R_CONSTANTE    = 2F;
    public static final String                  CIRCUIT_LENGHT_METERS  = "Meters";
    
}
