package gutierrez.ENUMS;

public enum DroidSpecs {
	
	A("A-Class Droid",70,35,200);
	private String droidClass;
	private int height;
	private int width;
	private int weight;
	
	private DroidSpecs(String droidClass,
			int height, int width, int weight) {
		this.droidClass = droidClass;
		this.height = height;
		this.width = width;
		this.weight = weight;
		
	}

	public String getDroidClass() {
		return droidClass;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getWeight() {
		return weight;
	}

}
