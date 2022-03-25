package com.pomanager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Project1.Baseclass;
import com.manager.Managerpgm;

public class Mmanagerrunner extends Baseclass {

public static WebDriver driver= browser_Configuration("chrome");
public static Managerpgm pom=new Managerpgm(driver);
public static void main(String[] args) throws IOException {
	geturl("http://adactin.com/HotelApp/index.php");
	implicitwait(3000,TimeUnit.SECONDS);
	inputonElement(pom.get_Instansce_home().getUserna(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\adactin.xlsxl", 16, 5));
	inputonElement(pom.get_Instansce_home().getPasswrd(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\adactin.xlsxl", 17, 5));
	clickonElement(pom.get_Instansce_home().getLogin());

	 dropdown("Visibletext",pom.get_instance_detail().getLocation(),"Melbourne");
	 dropdown("visibletext",pom.get_instance_detail().getHotel(),"Hotel Sunshine");
	 dropdown("visibletext",pom.get_instance_detail().getRoom(),"Double");
	 inputonElement(pom.get_instance_detail().getRoomno(),"1-One  ");
	 inputonElement(pom.get_instance_detail().getCheckin(),"11/03/2022");
	 inputonElement(pom.get_instance_detail().getCheckout(),"12/03/2022");
	 inputonElement(pom.get_instance_detail().getAdult(),"1- One") ; 
	 inputonElement(pom.get_instance_detail().getChild(),"1- One") ;  
	 clickonElement(pom.get_instance_detail().getSubmit());
	 
	// clickonElement(detailscon.getRadiobtn());
	 clickonElement(pom.get_instance_detailcon().getRadiocli());
	 clickonElement(pom.get_instance_detailcon().getCon());
	 
	 inputonElement(pom.get_instance_Book().getFirst(),"Jack") ;
	 inputonElement(pom.get_instance_Book().getLast(),"Jack") ;
	 inputonElement(pom.get_instance_Book().getAdd()," Pirates of the Caribbean") ;
	 inputonElement(pom.get_instance_Book().getCcno(),"1234561234561234") ;
	 inputonElement(pom.get_instance_Book().getctype(),"Mastercard");
	 inputonElement(pom.get_instance_Book().getExpm(),"january") ;
	 inputonElement(pom.get_instance_Book().getExpy(),"2022") ;
	 inputonElement(pom.get_instance_Book().getCvno(),"234") ;
	 clickonElement(pom.get_instance_Book().getBuildl());
	
	}
}
