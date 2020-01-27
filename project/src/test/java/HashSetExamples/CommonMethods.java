package HashSetExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import cucumber.api.java.ht.E;

public class CommonMethods {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		set.add("One");
		set.add("Two");
		set.add("Three");
		
		Object[] arr4mSet = set.toArray();
		System.out.println(Arrays.toString(arr4mSet));
		
		set.clear();

		if (set.isEmpty() && set.size() == 0) {
			System.out.println("Set contains One? " + set.contains("One"));
		}

		set = new HashSet<>(Arrays.asList("One", "Two", "Three"));

// Iterators for HashSet
		Iterator<String> itr = set.iterator(); // #1.
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

		System.out.println("");
		set.forEach(System.out::print); // #2.

		System.out.println("");
		for (String e : set)			// #3.
			System.out.print(e);

//Set operations in HashSet
		HashSet<String> set1 = new HashSet<>(Arrays.asList("1","2", "3", "4"));
		HashSet<String> set2 = new HashSet<>(Arrays.asList("2", "3"));		

		System.out.println("");
		set1.addAll(set2);		// UNION [1, 2, 3, 4]
		System.out.println(set1);
		
		set1.retainAll(set2);	// INTERSECTION [2, 3]
		System.out.println(set1);	
		
		set1 = new HashSet<>(Arrays.asList("1","2", "3", "4"));
		set2 = new HashSet<>(Arrays.asList("2", "3"));	
		
		set1.removeAll(set2);	// COMPLIMENT [1, 4]
		System.out.println(set1);		

		
// ParallelStream example
		set.clear();
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "10");
	    final HashSet<String> set3 = new HashSet<>(Arrays.asList("One1","Two2", "Three3", "Four4"));

	    ForkJoinPool forkJoinPool = new ForkJoinPool(10);

	    System.out.println("set print");
	    try {
	        forkJoinPool.submit(() ->
	            set3.parallelStream().forEach(System.out::print)
	        ).get();
	    } catch (Exception e) {
	        return;
	    }
	    


// RemoveIf(Predicate)
	HashSet<String> mySet = new HashSet<>(Arrays.asList("1","2", "3", "4"));
	mySet.removeIf((n)->n.equalsIgnoreCase("1"));
	
	System.out.println(mySet);
	
	}
}
