package POMBusinessWorkflow;

import java.util.HashMap;

public class GoogleDomain {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public GoogleDomain createGoogle(HashMap<Integer, String> m){
		GoogleDomain obj = new GoogleDomain();
		obj.setName(m.get(2));
		
		return obj;
	}

}
