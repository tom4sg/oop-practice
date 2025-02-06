package gutierrez.INTERFACE;

import gutierrez.DROIDS.A_AlphaDroid;
import gutierrez.DROIDS.AlphaDroid;

public interface Alphable {

	public static String dir = "src/gutierrez/DATA/";
	public default void displayAlpha(AlphaDroid a) {
		A_AlphaDroid d = (A_AlphaDroid) a;
		System.out.println(d.getSerialNumber());
		System.out.println(d.getDroidType());
		System.out.println(d.getBattery().getBatteryType());
		System.out.println("*******");
	}
}
