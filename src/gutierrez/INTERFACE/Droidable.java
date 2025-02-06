package gutierrez.INTERFACE;

import java.io.*;
import java.util.*;

import gutierrez.DROIDS.AlphaDroid;
import gutierrez.DROIDS.A_AlphaDroid;

public interface Droidable {
	
	public static ArrayList<AlphaDroid> droidList = new ArrayList<AlphaDroid>() {{
		add(new A_AlphaDroid("A1"));
		add(new A_AlphaDroid("A2")); 
		add(new A_AlphaDroid("A2"));
		add(new A_AlphaDroid("A3"));
	}};
	
	public static void storeDroids(ArrayList<AlphaDroid> droids) throws IOException {
		FileOutputStream FS = new FileOutputStream(Alphable.dir + "droids");
		ObjectOutputStream OS = new ObjectOutputStream(FS);
		OS.writeObject(droids);
		OS.close();
		}
		
	public static void retrieveDisplayDroids(String filename) throws IOException, ClassNotFoundException {
		FileInputStream FS = new FileInputStream(Alphable.dir + filename);
		ObjectInputStream OS = new ObjectInputStream(FS);
		ArrayList<AlphaDroid> droidList = (ArrayList<AlphaDroid>) OS.readObject();
		OS.close();
		for(int i = 0;i < droidList.size();i++) {
			A_AlphaDroid A = (A_AlphaDroid) droidList.get(i);
			A.displayAlpha(A);
			
		}
		System.out.println("Deserialization Has been Completed");
	}
	
}

