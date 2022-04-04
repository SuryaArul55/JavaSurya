package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
		@FindBy(xpath="//*[@id=\"username\"]")private WebElement userna;
		@FindBy(xpath="//*[@id=\"password\"]")private WebElement passwrd;
		@FindBy(xpath="//*[@id=\"login\"]")private WebElement login;
		

			
public Homepage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getUserna() {
	return userna;
}

public WebElement getPasswrd() {
	return passwrd;
}

public WebElement getLogin() {
	return login;
}

}