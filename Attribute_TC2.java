package Week5Day1Assignment;

import org.testng.annotations.Test;

public class Attribute_TC2 {
	@Test(invocationCount=10 , timeOut=1000)
	public  void TC002_Test() throws InterruptedException {

System.out.println("This is TC002 TestCase -invocationCount & Timeout");

	}

}


/*
public class Attribute_TC2 {
	@Test(invocationCount=10 , invocationTimeOut=1000)
	
	public  void TC002_Test() throws InterruptedException {
Thread.sleep(1500);
System.out.println("This is TC002 TestCase");

	}

}
*/