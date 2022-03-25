package Week5Day1Assignment;

import org.testng.annotations.Test;

public class Attribute_TC1 {
	@Test(dependsOnMethods = {"Week5Day1Assignment.Attribute_TC10.TC010_Test"})                  
	public  void TC001_Test() {
System.out.println("This is TC001 TestCase - invocationCount & threadPoolSize");

	}

}
