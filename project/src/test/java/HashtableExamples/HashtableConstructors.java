package HashtableExamples;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableConstructors {

	public static void main(String[] args) {
		//Creates an empty Hashtable
		Hashtable<Integer,String> htEmptyConstructor = new Hashtable<>();

		//Creates an Hashtable with an initial capacity of 10 and default load factor (0.75).
		Hashtable<String,String> htWithInitialCapacity = new Hashtable<>(10);
		
		//Creates an Hashtable with the specified initial capacity and the specified load factor.
		Hashtable<Integer,Integer> htWithInitialCapNLoadFactor = new Hashtable<Integer,Integer>(10, (float) 0.75);
		
		
		//Creates and Hashtable from Map
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		
		Hashtable<Integer,String> htFromMap = new Hashtable<>(hm);
		
		htEmptyConstructor.put(1, "One");
		htWithInitialCapacity.put("1", "One");
		htWithInitialCapNLoadFactor.put(1,1);
		
		System.out.println(htEmptyConstructor);
		System.out.println(htWithInitialCapacity);
		System.out.println(htWithInitialCapNLoadFactor);
		System.out.println(htFromMap);	
		
		/* Output:
		 * 	{1=One}
		 *	{1=One}
		 *	{1=1}
		 *	{4=Four, 3=Three, 2=Two, 1=One}
		 */
	}

}
