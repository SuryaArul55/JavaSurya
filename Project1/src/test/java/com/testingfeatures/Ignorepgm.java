package com.testingfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignorepgm {
	@Test(enabled = true)
	
	private void fb() {
		System.out.println("fb");
	}

	@Ignore
	private void password() {
		System.out.println("password");
	}
    
	@Test(enabled = false)
	private void insta() {
		System.out.println("insta");
	}
	@Test(priority = 1)
	private void homepage() {
	System.out.println("homepage");

}
	
}
