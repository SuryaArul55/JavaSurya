package com.pomanager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Project1.Baseclass;
import com.manager.Automanager;

public class PomAutom extends Baseclass {
	public static WebDriver driver= browser_Configuration("chrome");
	public static  Automanager pom=new Automanager(driver);
	public static void main(String[] args) throws IOException {
		geturl("http://automationpractice.com/index.php");
		implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(pom.get_Instance_Login().getLog());
		inputonElement(pom.get_Instance_Login().getEmailid(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\auto.xlsx",18,5));
		inputonElement(pom.get_Instance_Login().getPass(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\auto.xlsx",19,5));
		clickonElement(pom.get_Instance_Login().getLclick());
		
		clickonElement(pom.get_Instance_acc().getTshirt());
		implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(pom.get_Instance_addc().getTsize());
		clickonElement(pom.get_Instance_addc().getMsize());
		clickonElement(pom.get_Instance_addc().getColour());
		clickonElement(pom.get_Instance_addc().getAddcart()); 
		
		clickonElement(pom.get_Instance_summary().getAdd1());
		implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(pom.get_Instance_summary().getProceedcart());
		
		clickonElement(pom.get_Instance_adds().getAddresspro());
		
		clickonElement(pom.get_Instance_ship().getShipagree());
		clickonElement(pom.get_Instance_ship().getShippro());
		
		clickonElement(pom.get_Instance_paym().getPaym());
		clickonElement(pom.get_Instance_paym().getPaypro());
		close();
		
	}
}
