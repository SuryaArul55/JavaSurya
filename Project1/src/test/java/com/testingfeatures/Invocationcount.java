package com.testingfeatures;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(priority=-1)
	private void browserlanuch() {
	System.out.println("browserlanuch");
	}
	@Test
	private void lanuchurl() {
System.out.println("lanuchurl");
	}
	@Test(priority=0,invocationCount=3)
	private void refresh() {
	System.out.println("Refresh"); 
	
	}
	
	@Test(priority= 1)
	private void credentials() {
System.out.println("credential");
	}

}
