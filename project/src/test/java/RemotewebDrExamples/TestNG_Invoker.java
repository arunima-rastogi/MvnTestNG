package RemotewebDrExamples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;



public class TestNG_Invoker {

	public static void main(String[] args) {
		try
		{
			TestNG runner=new TestNG();
			 
			// Create a list of String 
			List<String> suitefiles=new ArrayList<String>();
			 
			// Add xml file which you have to execute
			suitefiles.add("testng.xml");
			 
			// now set xml file for execution
			runner.setTestSuites(suitefiles);
			 
			// finally execute the runner using run method
			runner.run();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}


	}

}
