package singletonDesignPattern;

import org.testng.Assert;

public class Client {

	public static void main(String[] args) {
		SingleObject obj1 = SingleObject.getInstance();
		obj1.showMessage();
		
		SingleObject obj2 = SingleObject.getInstance();
		
		Assert.assertTrue(obj1!=obj2);

	}

}
