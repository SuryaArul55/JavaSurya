package com.Project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alertm extends Baseclass  {
	public static WebDriver driver;
	
   public static void main(String[] args) {
	
	   driver=browser_Configuration("chrome");
	   geturl("http://www.leafground.com/pages/Alert.html");
	   driver.manage().window().maximize();
	    
	   WebElement x=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		clickonElement(x);

		WebElement x1=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		clickonElement(x1);

	    Alert a=driver.switchTo().alert();
	    sleep(5000);
	    a.accept();
	    
	    WebElement x2=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	    clickonElement(x2);
	    
	    Alert a1=driver.switchTo().alert();
	    sleep(3000);
	    a1.dismiss();
	    
	    WebElement x3=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	    x3.click();
	    
	    Alert a4=driver.switchTo().alert();
	    inputsendonElement (a4,"ar");
	    a4.accept();

	   
	   
}


	
}
