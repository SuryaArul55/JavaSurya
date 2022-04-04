package com.testingfeatures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizedpgm {

	@Test
	@Parameters({"username","password"})
	private void cresdentials(@Optional("max")String username,String password) {
		System.out.println("username:"+username);
		System.out.println("password:"+password);
	}
	
}
