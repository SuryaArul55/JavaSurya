package Restapi;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestApipgm {
@Test
private void data_validation() {
	RestAssured.baseURI=" https://adactinhotelapp.com//";
	RequestSpecification request=RestAssured.given();
	Response response = request.get(" api/users/2   ");
 String string = response.asString();
 System.out.println(string);
 int statusCode = response.getStatusCode();
 Assert.assertEquals(200, statusCode);
 System.out.println("Data validation");
 
 }
}
