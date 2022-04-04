package com.testingfeatures;

import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut = 6000)
private void browserExecution() throws Throwable {
	Thread.sleep(1000);//bl 2s
	System.out.println("Browser launch");
	Thread.sleep(1000);
	System.out.println("url");
	Thread.sleep(2000);//data entered in field
	System.out.println("credentials entered");
	Thread.sleep(1000);//real static wait (not a execution time)
	System.out.println("next page");
}
}
