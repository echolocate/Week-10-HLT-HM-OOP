package week_10_HLT;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapTuneUp {

	public static void main(String[] args) {
		
		// Create a HashMap called guitarTunings.
				// With String and Integer wrapper class.
				HashMap<String, Integer> tuningHM = new HashMap<String, Integer>();
				LinkedHashMap<String, Integer> tuningLHM = new LinkedHashMap<String, Integer>();
				
				// HashMap: Add keys and values (Note, Frequency).
				// (With octave values, distinguish low E from high E).
				tuningHM.put("E4", 330);
				tuningHM.put("B3", 247);
				tuningHM.put("G3", 196);
				tuningHM.put("D3", 147);
				tuningHM.put("A2", 110);
				tuningHM.put("E2", 82);

				// List is unordered, undesirable.
				System.out.println("HashMap" + tuningHM);

				for (String i : tuningHM.keySet()) {
					System.out.println("Note: " + i + " Frequency: " + tuningHM.get(i));
				}

				// LinkedHashMap: Maintains the order of which the key / value pairs are added. 
				// A bit more useful in this case.
				tuningLHM.put("E4", 330);
				tuningLHM.put("B3", 247);
				tuningLHM.put("G3", 196);
				tuningLHM.put("D3", 147);
				tuningLHM.put("A2", 110);
				tuningLHM.put("E2", 82);

				System.out.println("Linked HashMap" + tuningLHM);

				for (String j : tuningLHM.keySet()) {
					System.out.println("Note: " + j + " Frequency: " + tuningLHM.get(j));
				}
	}
}