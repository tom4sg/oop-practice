package gutierrez.DROIDS;

import gutierrez.ENUMS.DroidSpecs;
import gutierrez.ENUMS.DroidType;

public abstract class AlphaDroid extends Droid {
	
	private DroidType droidType;
	private DroidSpecs specifications;
	
	
	public AlphaDroid(String serialNumber) {
		super(serialNumber);
		this.droidType = DroidType.A;
		this.specifications = DroidSpecs.A;
	}


	public DroidType getDroidType() {
		return droidType;
	}


	public void setDroidType(DroidType droidType) {
		this.droidType = droidType;
	}


	public DroidSpecs getSpecifications() {
		return specifications;
	}


	public void setSpecifications(DroidSpecs specifications) {
		this.specifications = specifications;
	}
	
	
	

}
