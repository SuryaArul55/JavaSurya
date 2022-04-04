package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsConpage {
	public WebDriver driver;
	//@FindBy(xpath="//*[@id=\"check_all\"]")private WebElement radiobtn;
       @FindBy(xpath="//*[@id=\"radiobutton_0\"]")private WebElement bookc;
        @FindBy(xpath="//*[@id=\"continue\"]")private WebElement con;
	


public DetailsConpage(WebDriver driver3) {
	this.driver=driver3;
	PageFactory.initElements(driver, this);	// TODO Auto-generated constructor stub
}

//public WebElement getRadiobtn() {
//	return radiobtn;
//}

public WebElement getRadiocli() {
	return bookc;
}
public WebElement getCon() {
	return con;
}
}