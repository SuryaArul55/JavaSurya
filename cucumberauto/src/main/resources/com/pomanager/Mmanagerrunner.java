package com.pomanager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Project1.Baseclass;
import com.configuration.adactin.Reader_adactinmanager;
import com.configuration.helper.File_Reader_Manager;
import com.logger_demo.propertyconfiguration;
import com.manager.Managerpgm;

public class Mmanagerrunner extends Baseclass {

public static WebDriver driver= browser_Configuration("chrome");
public static Managerpgm pom=new Managerpgm(driver);
public static Logger Log = Logger.getLogger(Mmanagerrunner.class);
public static void main(String[] args) throws Throwable {
PropertyConfigurator.configure("log4j.properties");
String url=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Url();
geturl(url);
//geturl("http://adactin.com/HotelApp/index.php");
	Log.info("url successfully launched");
	implicitwait(3000,TimeUnit.SECONDS);
	
	pom.get_Instansce_home().getUserna();
	
	String username=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_username();
	inputonElement(pom.get_Instansce_home().getUserna(),username);
	//inputonElement(pom.get_Instansce_home().getUserna(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\adactin new.xlsx ", 2, 5));
	//inputonElement(pom.get_Instansce_home().getPasswrd(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\adactin new.xlsx", 3, 5));
	pom.get_Instansce_home().getPasswrd();
	String password=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_password();
	inputonElement(pom.get_Instansce_home().getPasswrd(),password);
	
	clickonElement(pom.get_Instansce_home().getLogin());
	Log.info("Login successfully");
	
	 dropdown("Visibletext",pom.get_instance_detail().getLocation(),"Melbourne");
	 dropdown("visibletext",pom.get_instance_detail().getHotel(),"Hotel Sunshine");
	 dropdown("visibletext",pom.get_instance_detail().getRoom(),"Double");
	 inputonElement(pom.get_instance_detail().getRoomno(),"1-One  ");
	pom.get_instance_detail().getCheckin();
	String Checkin=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Checkin();
	inputonElement(pom.get_instance_detail().getCheckin(),Checkin);
	// inputonElement(pom.get_instance_detail().getCheckin(),"11/03/2022");
	// inputonElement(pom.get_instance_detail().getCheckout(),"12/03/2022");
	 pom.get_instance_detail().getCheckout();
	 String Checkout=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Checkout();
	 inputonElement(pom.get_instance_detail().getCheckout(),Checkout);
	
	 inputonElement(pom.get_instance_detail().getAdult(),"1- One") ; 
	 inputonElement(pom.get_instance_detail().getChild(),"1- One") ;  
	 clickonElement(pom.get_instance_detail().getSubmit());
	 Log.info("Hotel details successfully Entered");
	
	 
	 // clickonElement(detailscon.getRadiobtn());
	 clickonElement(pom.get_instance_detailcon().getRadiocli());
	 clickonElement(pom.get_instance_detailcon().getCon());
	 pom.get_instance_Book().getFirst();
	 String Firstname=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Firstname();
	 inputonElement(pom.get_instance_Book().getFirst(),Firstname) ;
	 pom.get_instance_Book().getLast();
	 String Lastname=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Lastname();
	 inputonElement(pom.get_instance_Book().getLast(),Lastname) ;
	 pom.get_instance_Book().getAdd();
	 String Address=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Address();
	 inputonElement(pom.get_instance_Book().getAdd(),Address) ;
	 pom.get_instance_Book().getCcno();
	 String Cardno=Reader_adactinmanager.get_Instance_FRM().get_Instance_CR().get_config_Cardno();
	 inputonElement(pom.get_instance_Book().getCcno(),Cardno) ;//1234561234561234
	 
	 inputonElement(pom.get_instance_Book().getctype(),"Mastercard");
	 inputonElement(pom.get_instance_Book().getExpm(),"january") ;
	 inputonElement(pom.get_instance_Book().getExpy(),"2022") ;
	 inputonElement(pom.get_instance_Book().getCvno(),"234") ;
	 clickonElement(pom.get_instance_Book().getBuildl());
	 Log.info("Personal Details Entered successfully and booking confirmed");
	 takescreenshot("C:\\Users\\Admin\\eclipse-workspace\\Project1\\Driver\\screenshotm\\img.png");
	 close();
}
}
