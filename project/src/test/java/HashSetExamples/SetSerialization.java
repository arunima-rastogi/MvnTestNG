package HashSetExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class SetSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Serialization/Deserialization of HashSets in Java
		
		String filename = "savedHashSet.dat";

		// Create it
		Set<String> someStrings = new HashSet<String>();
		someStrings.add("hello");
		someStrings.add("world");

		// Serialize / save it
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
		oos.writeObject(someStrings);

		// Deserialize / load it
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
		Set<String> aNewSet = (HashSet<String>) ois.readObject();
		
		System.out.println(aNewSet);
		

	}

}
