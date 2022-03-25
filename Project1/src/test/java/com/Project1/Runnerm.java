package com.Project1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runnerm extends Baseclass {
		public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException, IOException {
				driver=browser_Configuration("chrome");
				geturl("http://adactin.com/HotelApp/index.php");
				driver.manage().window().maximize();
			//user name
				
				WebElement user=driver.findElement(By.xpath("//*[@id=\"username\"]"));
				inputonElement(user,"Jacksparrow22");
			//password	
			    WebElement pass=driver.findElement(By.xpath("//*[@id=\'password\']"));
			    inputonElement(pass, "Jack22");
			//login
				WebElement login=driver.findElement(By.xpath("//*[@id=\'login\']"));
				clickonElement(login);
			
				//location
				WebElement location=driver.findElement(By.xpath("//*[@id=\'location\']"));
				dropdown("Visibletext",location,"Melbourne");
				//hotel
			    WebElement hotel=driver.findElement(By.xpath("//*[@id=\'hotels\']")); 
			    dropdown("visibletext",hotel,"Hotel Sunshine");
			
			   //room type
			   WebElement roomtype=driver.findElement(By.xpath(" //*[@id=\'room_type\']")); 
	           dropdown("visibletext",roomtype,"Double");
//Room number   
			   WebElement roomnumber=driver.findElement(By.xpath(" //*[@id=\'room_nos\'] "));  
			   inputonElement(roomnumber,"1-One  ");
 //check in date
			   WebElement checkin=driver.findElement(By.xpath("//*[@id=\'datepick_in\']"));  
			   inputonElement(checkin,"11/03/2022");			   
//check out date
			   WebElement outdate=driver.findElement(By.xpath("//*[@id=\'datepick_out\']")); 
			   inputonElement(outdate,"12/03/2022");
		
			//adult per room number
			   WebElement adultperroom=driver.findElement(By.xpath(" //*[@id=\'adult_room\']  ")); 
			   inputonElement(adultperroom,"1- One") ;  
			    		   
			//child per room no
			   WebElement childroom=driver.findElement(By.xpath(" //*[@id=\'child_room\'] ")); 
			   inputonElement(childroom,"1- One") ;   
			   
			//search click
			   WebElement searchclick=driver.findElement(By.xpath(" //*[@id=\'Submit\'] ")); 
			    clickonElement(searchclick);
			sleep(3000);   
			//radiobutton
			WebElement radiobutton=driver.findElement(By.xpath(" //*[@id=\'radiobutton_0\'] ")); 
			   clickonElement(radiobutton);
			//BookedIltnerary
		    WebElement Bookedlit=driver.findElement(By.xpath(" //*[@id=\'radiobutton_0\'] "));  
		    clickonElement(Bookedlit);
		//continuebtn
		    WebElement continuebtn=driver.findElement(By.xpath("   //*[@id=\'continue\'] "));  
		    clickonElement(continuebtn);
		//firstname
		    WebElement firstname=driver.findElement(By.xpath(" //*[@id=\'first_name\'] ")); 
			inputonElement(firstname,"Jack") ;
		//lastname	
			WebElement lastname=driver.findElement(By.xpath("//*[@id=\'last_name\']  ")); 
			inputonElement(lastname,"Jack") ;
		//billing	
			WebElement billing=driver.findElement(By.xpath("//*[@id=\'address\']  ")); 
			inputonElement(billing," Pirates of the Caribbean") ;
		//ccno	
			WebElement ccno=driver.findElement(By.xpath("//*[@id=\'cc_num\'] ")); 
			inputonElement(ccno,"1234561234561234") ;
		//cctype
			 WebElement cctype=driver.findElement(By.xpath("//*[@id=\'cc_type\'] ")); 
	           inputonElement(cctype,"Mastercard");
	     //expirydate
	       	WebElement monthc=driver.findElement(By.xpath("//*[@id=\'cc_exp_month\'] ")); 
	       	inputonElement(monthc,"january") ;    
		//yearc
			WebElement yearc=driver.findElement(By.xpath("//*[@id=\'cc_exp_year\'] ")); 
			inputonElement(yearc,"2022") ;
		//cccno	
			WebElement cccno=driver.findElement(By.xpath("//*[@id=\'cc_cvv\'] ")); 
			inputonElement(cccno,"234") ;
		//buildlit	
			WebElement builtlit=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2] "));  
		    clickonElement(builtlit);
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File  source=ts.getScreenshotAs(OutputType.FILE);
		    File destination = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");

		    FileHandler.copy(source, destination);

		  			}
			
			}	
			
			



