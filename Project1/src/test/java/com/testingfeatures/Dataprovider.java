package com.testingfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider ="testdata")
	private void crendentials(String username,int password) {
		System.out.println("username:"+username);
		System.out.println("password:"+password);
	
	}
	@DataProvider
private Object[][] testdata() {
	
return new Object[] [] {
	{"max",555},
	{"jack",225},
	{"newton",222}
	
};
}
	@Test(dataProvider ="testdata")
	private void automation(String username,int password) {
		System.out.println("username in auto:"+username);
		System.out.println("password in auto:"+password);
	
	}

}
