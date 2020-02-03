package POMBusinessWorkflow;

import java.util.HashMap;

public class Steps {
	
	public void callStep1() {
		String env = "INT";
		
		HashMap<Integer, String> data = new HashMap<>();
		data.put(1, "One");
		data.put(2, "Two");
		
		GooglePageWorkflow obj = new GooglePageWorkflow();
		obj.function1(data);
	}

}
