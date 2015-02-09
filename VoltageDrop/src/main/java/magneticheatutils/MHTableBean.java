package magneticheatutils;

import java.io.Serializable;

import com.cplsys.aisa.domain.DeviceType;

public class MHTableBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer quatity;
	private DeviceType deviceType;
	private Integer partNumber;
	private Integer manufacturer;
	private Integer watts;
	private Double totalWatts;
	
}
