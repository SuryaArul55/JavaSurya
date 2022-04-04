package com.testingfeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationspgm {
              
	@BeforeTest
	private void browser() {
		System.out.println("Browser Launch");

	}
	
	@BeforeSuite
	private void setproperty() {
	System.out.println("setproperty");

	}
	
	
	
	@Test
    private void women() {
	System.out.println("women");
				}
   @BeforeMethod
   private void sigin() {
   System.out.println("signin");
   }
   @AfterMethod
   private void signout() {
   System.out.println("signout");

    }            
                 
	@Test
	   private void children() {
		System.out.println("children");
	}
	
	@AfterClass
	private void Verifyhomepage() {
		System.out.println("Assert");

	}
   @AfterTest
   private void close() {
   System.out.println("close");

}
   @AfterSuite
   private void deleteallcookies() {
   System.out.println("Delete all cookies");
}
	
}
