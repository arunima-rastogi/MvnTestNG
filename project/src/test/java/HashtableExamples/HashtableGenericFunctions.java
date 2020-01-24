package HashtableExamples;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableGenericFunctions {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");

		Hashtable<Integer, String> htFromMap = new Hashtable<>(hm);

		// checks for Hashtable values
		System.out.println(htFromMap.contains("One"));		//true

		// checks for Hashtable values
		System.out.println(htFromMap.containsValue("Four"));		//true

		// checks for Hashtable key
		System.out.println(htFromMap.containsKey(1));		//true

		// get the value of given Key
		System.out.println(htFromMap.get(4));		//Four

		// get the value of given key (if Key not found default value is returned0
		System.out.println(htFromMap.getOrDefault(99, "defaultValue"));			//defaultValue

		// check if Hashtable is empty
		System.out.println(htFromMap.isEmpty());	//false

		// Add a K,V to Hashtable
		htFromMap.put(5, "Five");	// {5=Five, 4=Four, 3=Three, 2=Two, 1=One}

		// Add a K,V if not present in Hashtable
		htFromMap.putIfAbsent(6, "Six");	// {6=Six, 5=Five, 4=Four, 3=Three, 2=Two, 1=One}

		// Add a map to Hashtable
		HashMap<Integer, String> tMap = new HashMap<>();
		tMap.put(7, "Seven");
		htFromMap.putAll(tMap);			// {7=Seven, 6=Six, 5=Five, 4=Four, 3=Three, 2=Two, 1=One}

		// remove an entry in Hashtable
		htFromMap.remove(7); 			// {6=Six, 5=Five, 4=Four, 3=Three, 2=Two, 1=One}

		// remove if an exact K,V pair is matched in Hashtable
		htFromMap.remove(6, "Six");		// {5=Five, 4=Four, 3=Three, 2=Two, 1=One}

		// replaces K,V 
		htFromMap.replace(5, "fiver..");	// {5=fiver.., 4=Four, 3=Three, 2=Two, 1=One}

		// replaces KV with new value
		htFromMap.replace(5, "fiver..", "Five"); 	// {5=Five, 4=Four, 3=Three, 2=Two, 1=One}

	}

}
