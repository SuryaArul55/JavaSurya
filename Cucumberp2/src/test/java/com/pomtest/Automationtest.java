package com.pomtest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.Logs;

import com.Project1.Baseclass;
import com.autopom.Addcart;
import com.autopom.Address;
import com.autopom.Loginpage;
import com.autopom.Myaccount;
import com.autopom.Payment;
import com.autopom.Shippingpro;
import com.autopom.Summarypage;
import com.manager.Automanager;

public class Automationtest extends Baseclass{
	public static WebDriver driver= browser_Configuration("chrome");
	public static  Loginpage logs=new Loginpage(driver);
	public static Myaccount acc=new Myaccount(driver);
	public static  Addcart adds= new Addcart(driver);
	public static  Summarypage summ= new Summarypage(driver);
	public static  Address addres= new Address(driver);
	public static Shippingpro ship=new Shippingpro(driver);
	public static Payment pay=new Payment(driver);
public static Logger Log=Logger.getLogger(Automationtest.class);
	public static void main(String[] args) throws IOException {
		geturl("http://automationpractice.com/index.php");
		Log.info("url launch");
		implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(logs.getLog());
		inputonElement(logs.getEmailid(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\testcase surya.xlsx",3,5));
		inputonElement(logs.getPass(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\testcase surya.xlsx",5,5));
		clickonElement(logs.getLclick());
		
		clickonElement(acc.getTshirt());
		implicitwait(3000,TimeUnit.SECONDS);
		
		
		clickonElement(adds.getMsize());
		//implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(adds.getColour());
		clickonElement(adds.getAddcart()); 
		//implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(summ.getAdd1());
		//implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(summ.getProceedcart());
		
		clickonElement(addres.getAddresspro());
		
		clickonElement(ship.getShipagree());
		clickonElement(ship.getShippro());
		clickonElement(ship.getShipproacc());
		
		clickonElement(pay.getPaym());
		clickonElement(pay.getPaypro());
		close();
		
	}
	
	
}
