package com.testingfeatures;

import org.testng.annotations.Test;

public class Expectedexception {
	@Test(expectedExceptions = ArithmeticException.class)//NullPointerException,class
	private void calculator() {
		int a =10;
		System.out.println(a/0);
	System.out.println("Display the output");
	}
	
}
