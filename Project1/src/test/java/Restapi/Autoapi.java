package Restapi;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Project1.Baseclass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Autoapi extends Baseclass {
	@Test
	private void Data_validation() throws IOException {
		String uri=Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\automationpostman.xlsx", 1, 5);
		RestAssured.baseURI=uri;
		RequestSpecification request=RestAssured.given();
	 String parallel=Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\automationpostman.xlsx", 2,5);
	 Response response = request.get(parallel);
	 String string = response.asString();
	 System.out.println(string);
	 int expected = response.getStatusCode();
	 
	 String status=Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\automationpostman.xlsx",1,2);
	 Assert.assertEquals(expected, status);

	 
	 }
	 }
	
	
	
	

