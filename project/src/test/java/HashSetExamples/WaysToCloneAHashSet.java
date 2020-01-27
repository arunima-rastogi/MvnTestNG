package HashSetExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WaysToCloneAHashSet {

	public static void main(String[] args) throws CloneNotSupportedException {
		HashSet<String> original = new HashSet<>(Arrays.asList("A", "B", "C", "D"));

		HashSet<String> clone = (HashSet<String>) clone(original);
		
		System.out.println(clone);
	}

//Clone method 1	
	public static<T> Set<T> clone(Set<T> original) throws CloneNotSupportedException {
		Set<T> copy = new HashSet<T>();
		for (T Obj : original)
			copy.add(Obj);

		return copy;
	}

//Clone method 2
	public static<T> Set<T> clone2(Set<T> original){
		Set<T> copy = new HashSet<>(original);
		return copy;
	}

//Clone method 3	
	public static<T> Set<T> clone3(Set<T> original){
		Set<T> copy = new HashSet<>();
		copy.addAll(original);
		return copy;
	}	

//Clone method 4	
		public static<T> Set<T> clone4(Set<T> original){
			Set<T> copy = original.stream().collect(Collectors.toSet());
			return copy;
		}
		
}
