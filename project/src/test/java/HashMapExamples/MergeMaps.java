package HashMapExamples;

import java.util.HashMap;

public class MergeMaps {

	public static void main(String[] args) {
		
		// Merges two HashMaps (Duplicate keys are added only once)
		
		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(5, "E");

		// map 2
		HashMap<Integer, String> map2 = new HashMap<>();

		map2.put(1, "G"); // It will replace the value 'A'
		map2.put(2, "B");
		map2.put(3, "C");
		map2.put(4, "D"); // A new pair to be added

		// Merge maps
		map2.putAll(map1);	// map2 = {1=A, 2=B, 3=C, 4=D, 5=E}
		
		// Map.merge(K,V, BiFunction<? super String, ? super String, ? extends String> 
		map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2));

	}

}
