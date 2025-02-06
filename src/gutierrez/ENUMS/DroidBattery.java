package gutierrez.ENUMS;

public enum DroidBattery {
	
	A("Lithium",2000,175);
	private String batteryType;
	private int power;
	private int amps;
	
	private DroidBattery(String batteryType,
			int power, int amps) {
		this.batteryType = batteryType;
		this.power = power;
		this.amps = amps;
	}

	public String getBatteryType() {
		return batteryType;
	}

	public int getPower() {
		return power;
	}

	public int getAmps() {
		return amps;
	}


}
