package com.pomanager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Project1.Baseclass;
import com.configuration.helper.File_Reader_Manager;
import com.manager.Automanager;

public class PomAutom extends Baseclass {
	public static WebDriver driver= browser_Configuration("chrome");
	public static  Automanager pom=new Automanager(driver);
	public static Logger log=Logger.getLogger(PomAutom.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		String url=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_config_Url();
		geturl(url);
		log.info("Url lanuch");
		//geturl("http://automationpractice.com/index.php");
		implicitwait(3000,TimeUnit.SECONDS);
		clickonElement(pom.get_Instance_Login().getLog());
		pom.get_Instance_Login().getEmailid();
		String emailid =File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_config_Emailid();
		//inputonElement(pom.get_Instance_Login().getEmailid(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\testcase surya.xlsx",3,5));
		inputonElement(pom.get_Instance_Login().getEmailid(), emailid);
		
		//inputonElement(pom.get_Instance_Login().getPass(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\testcase surya.xlsx",5,5));
		pom.get_Instance_Login().getPass();
		String password =File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_config_password();
		inputonElement(pom.get_Instance_Login().getPass(),password);
		
		clickonElement(pom.get_Instance_Login().getLclick());
		log.info("logined in ");
		clickonElement(pom.get_Instance_acc().getTshirt());
		implicitwait(3000,TimeUnit.SECONDS);
		
		
		clickonElement(pom.get_Instance_adds().getMsize());
		clickonElement(pom.get_Instance_adds().getColour());
		clickonElement(pom.get_Instance_adds().getAddcart()); 
		log.info("filtered and added in cart");
		
		clickonElement(pom.get_Instance_summ().getAdd1());
		
		clickonElement(pom.get_Instance_summ().getProceedcart());
		
		clickonElement(pom.get_Instance_addres().getAddresspro());
		log.info("addcart proceeded");
		clickonElement(pom.get_Instance_ship().getShipagree());
		clickonElement(pom.get_Instance_ship().getShippro());
		clickonElement(pom.get_Instance_ship().getShipproacc());
		log.info("shipment proceeded ");
		clickonElement(pom.get_Instance_pay().getPaym());
		clickonElement(pom.get_Instance_pay().getPaypro());
		log.info("Payment finished");
		
		clickonElement(pom.get_Instance_wome().getBackto());
		clickonElement(pom.get_Instance_wome().getWom());
	     clickonElement(pom.get_Instance_wome().getBluose());
	     clickonElement(pom.get_Instance_wome().getProce()); 
	     clickonElement(pom.get_Instance_wome().getSummproceed());
	     clickonElement(pom.get_Instance_wome().getAddpro());
	     clickonElement(pom.get_Instance_wome().getShippingag());
	     clickonElement(pom.get_Instance_wome().getShippingpro());
	     clickonElement(pom.get_Instance_wome().getPaym());
	     clickonElement(pom.get_Instance_wome().getCon());
		log.info("Seond order placed");
		
		clickonElement(pom.get_Instance_third().getBacktoorder());
		clickonElement(pom.get_Instance_third().getDressess());
		clickonElement(pom.get_Instance_third().getAdddress());
		clickonElement(pom.get_Instance_third().getPc());
		clickonElement(pom.get_Instance_third().getSummproceed());
		clickonElement(pom.get_Instance_third().getAddproceed());
		clickonElement(pom.get_Instance_third().getShagg());
		clickonElement(pom.get_Instance_third().getShpro());
		clickonElement(pom.get_Instance_third().getPaym());
		clickonElement(pom.get_Instance_third().getIcorder());
		log.info("third order placed");
		
		takescreenshot("C:\\Users\\Admin\\eclipse-workspace\\Project1\\Driver\\screenshotm\\img.png");
		//close();
	}
	

	
}
