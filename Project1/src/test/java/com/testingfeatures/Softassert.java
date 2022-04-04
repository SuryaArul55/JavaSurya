package com.testingfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	private void username() {
		String Exp_username="jack";
		String actual_username="jack235";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_username, Exp_username) ;
        System.out.println("Assert verification");
}
}