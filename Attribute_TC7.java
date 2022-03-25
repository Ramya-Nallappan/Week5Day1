package Week5Day1Assignment;

import org.testng.annotations.Test;

public class Attribute_TC7 {
	@Test(dependsOnMethods = {"Week5Day1Assignment.Attribute_TC10.TC010_Test","Week5Day1Assignment.Attribute_TC11.TC011_Test"} )
	public  void TC007_Test() {

System.out.println("This is TC007 TestCase -invocationCount & threadPoolSize ");

	}

}
