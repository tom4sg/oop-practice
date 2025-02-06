package gutierrez.DROIDS;

import gutierrez.ENUMS.DroidBattery;
import gutierrez.ENUMS.DroidSpecs;
import gutierrez.ENUMS.DroidType;
import gutierrez.INTERFACE.Alphable;

public class A_AlphaDroid extends AlphaDroid implements Alphable {
	
	private DroidBattery battery;

	public A_AlphaDroid(String serialNumber) {
		super(serialNumber);
		this.battery = DroidBattery.A;
	}

	public DroidBattery getBattery() {
		return battery;
	}

	public void setBattery(DroidBattery battery) {
		this.battery = battery;
	}
	

}
