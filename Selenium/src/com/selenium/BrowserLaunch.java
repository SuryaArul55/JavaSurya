package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();//object 
  driver.get("https://www.google.com");
driver.manage().window().maximize();

driver.navigate().to("https:/www.facebook.com/");
Thread.sleep(5000); //to delay breath time
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
  //driver.quit();
  driver.close();
    }
}
