package gutierrez.DROIDS;

import java.io.Serializable;

public abstract class Droid implements Serializable {
	private static final long serialVersionUID = 1L;
	private String serialNumber;
	
	public Droid(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
