package Week5Day1Assignment;

import org.testng.annotations.Test;

public class Attribute_TC4 {


	
	@Test(dependsOnMethods = "Week5Day1Assignment.Attribute_TC9.TC009_Test", alwaysRun=true)
	public  void TC004_Test() {

System.out.println("This is TC004 TestCase- dependsOnMethods =TC009_Test()");

	}

}
