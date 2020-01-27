package MiscExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableClient {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.setName("Sheetal");

		storeUserSettings(obj);

		MyClass obj2 = loadSettings();
		System.out.println(obj2.getName());

	}

	private static MyClass loadSettings() {
		try {
			FileInputStream fis = new FileInputStream("object.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyClass settings = (MyClass) ois.readObject();
			ois.close();
			return settings;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void storeUserSettings(MyClass obj) {
		try {
			FileOutputStream fos = new FileOutputStream("object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
