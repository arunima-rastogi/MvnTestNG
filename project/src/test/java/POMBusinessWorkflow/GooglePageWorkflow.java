package POMBusinessWorkflow;

import java.util.HashMap;

public class GooglePageWorkflow {

	HashMap<Integer, String> localMap = new HashMap<>();

	public GooglePageWorkflow() {

	}

	public void function1(HashMap<Integer, String> map) {
		GoogleDomain obj = new GoogleDomain();
		GoogleDomain obj2 = obj.createGoogle(map);
		
		System.out.println(obj2.getName());
	}

}
