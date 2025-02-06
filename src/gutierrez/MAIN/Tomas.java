package gutierrez.MAIN;

import java.io.IOException;

import gutierrez.INTERFACE.Droidable;

public class Tomas {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Droidable.storeDroids(Droidable.droidList);
		Droidable.retrieveDisplayDroids("droids");

	}
}
