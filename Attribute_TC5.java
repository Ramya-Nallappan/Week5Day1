package Week5Day1Assignment;

import org.testng.annotations.Test;

public class Attribute_TC5 {
   
	@Test(priority =1)
	public  void TC005a_Test() {

System.out.println("This is TC005a TestCase");

	}
    
    @Test(priority =2)
	public  void TC005b_Test() {

System.out.println("This is TC005b TestCase");

	}
    
    @Test(priority =-1)
	public  void TC005c_Test() {

System.out.println("This is TC005c TestCase ");

	}

}
