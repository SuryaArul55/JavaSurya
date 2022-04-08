package com.testingfeatures;

import org.testng.ITestResult;

public class Retry_class extends IretryAnalyzer {
int start= 1;
int end =3;
//override the method
private boolean retry(ITestResult result) {
	if(start <= end) {
		start++;
		
	
	
	return true;//execute
	
}
return false;//stop the execution
}
}