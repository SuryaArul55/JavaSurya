package com.autopom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
           public WebDriver driver;
           @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") private WebElement log;
           @FindBy(xpath="//*[@id=\"email\"]")private WebElement emailid;
           @FindBy(xpath="//*[@id=\"passwd\"]")private WebElement pass;
           @FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")private WebElement lclick;
           @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a ")private WebElement loginout;
         
        
           
           
           
           
        public WebElement getLoginout() {
			return loginout;
		}

		public Loginpage(WebDriver driver) {
           this.driver=driver;
           PageFactory.initElements(driver, this);
           
         }
           
           public WebElement getLog() {
			return log;
		}
		
		public WebElement getEmailid() {
			return emailid;
		}
		public WebElement getPass() {
			return pass;
		}
	
		public WebElement getLclick() {
			return lclick;
		}
		
		}
