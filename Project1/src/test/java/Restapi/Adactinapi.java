package Restapi;

import java.io.IOException;

import org.junit.runner.Request;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Project1.Baseclass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestSpecification;

public class Adactinapi extends Baseclass {
public static RequestSpecification request;
public static Response respones;	
public static String expectedresult;
int expected;
	
	@BeforeMethod
	private void Baseuri() throws Throwable   {
	String uri= Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\automationpostman.xlsx ", 0, 0);
	RestAssured.baseURI=uri;
    request = RestAssured.given();
	}
@Test(priority =-1)
private void searchhotel() {
	
	String parameter=Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\automationpostman.xlsx", 0, 0);
	 response = request.get(parameter);
	 expectedresult=Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\automationpostman.xlsx", 0, 0);
	expected= Interger
}

@AfterMethod
private void statuscode() {
	

}
}
