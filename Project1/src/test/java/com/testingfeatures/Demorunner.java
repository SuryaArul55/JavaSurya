package com.testingfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demorunner {

	@Test(retryAnalyzer=Retry_class.class)
	private void username() {
		String Exp_username="jack";
		String actual_username="jacksparrow";
		Assert.assertNotEquals(actual_username, Exp_username);
       
}
	@Test
	private void password() {
		String Exp_password="jack123";
		String actual_password="jack235";
		Assert.assertNotEquals(actual_password, Exp_password);//xml convert
       
}
}