package com.pomtest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.Project1.Baseclass;
import com.adactinpom.Booklitpage;
import com.adactinpom.Detailpage;
import com.adactinpom.DetailsConpage;
import com.adactinpom.Homepage;

public class PomRunner extends Baseclass  {

	public static WebDriver driver= browser_Configuration("chrome");
	public static Homepage home =new Homepage(driver);
    public static Detailpage detail=new Detailpage(driver);
    public static DetailsConpage detailscon=new DetailsConpage(driver);
	public static Booklitpage book=new Booklitpage(driver);
	public static Logger Log = Logger.getLogger(PomRunner.class);
	public static void main(String[] args) throws IOException {
		
		geturl("http://adactin.com/HotelApp/index.php");
		Log.info("Url Launch");
		implicitwait(3000,TimeUnit.SECONDS);
		inputonElement(home.getUserna(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\adactin new.xlsx",2,5));
		inputonElement(home.getPasswrd(),Particulardata("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\adactin new.xlsx",3,5));
		clickonElement(home.getLogin());
		implicitwait(3000,TimeUnit.SECONDS);
		 dropdown("Visibletext",detail.getLocation(),"Melbourne");
		 dropdown("visibletext",detail.getHotel(),"Hotel Sunshine");
		 dropdown("visibletext",detail.getRoom(),"Double");
		 inputonElement(detail.getRoomno(),"1-One  ");
		 inputonElement(detail.getCheckin(),"11/03/2022");
		 inputonElement(detail.getCheckout(),"12/03/2022");
		 inputonElement(detail.getAdult(),"1- One") ; 
		 inputonElement(detail.getChild(),"1- One") ;  
		 clickonElement(detail.getSubmit());
		 
		// clickonElement(detailscon.getRadiobtn());
		 clickonElement(detailscon.getRadiocli());
		 clickonElement(detailscon.getCon());
		 
		 inputonElement(book.getFirst(),"Jack") ;
		 inputonElement(book.getLast(),"Jack") ;
		 inputonElement(book.getAdd()," Pirates of the Caribbean") ;
		 inputonElement(book.getCcno(),"1234561234561234") ;
		 inputonElement(book.getctype(),"Mastercard");
		 inputonElement(book.getExpm(),"january") ;
		 inputonElement(book.getExpy(),"2022") ;
		 inputonElement(book.getCvno(),"234") ;
		 clickonElement(book.getBuildl());
	
	}
	
}
