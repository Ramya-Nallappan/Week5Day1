package Week5Day1Assignment;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Attribute_TC3 {
 
	@Test(dependsOnMethods = {"Week5Day1Assignment.Attribute_TC8.TC008_Test"})
	public  void TC003_Test() {

System.out.println("This is TC008 TestCase- dependsOnMethods = TC008(ignored)");

	}

}
