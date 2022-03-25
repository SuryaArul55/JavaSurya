package com.autopom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingpro {
public WebDriver driver;
@FindBy(xpath="//*[@id=\\\"uniform-cgv\\\"]/span")private WebElement shipagree;
@FindBy(xpath="//*[@id=\\\"form\\\"]/p/button")private WebElement shippro;
public Shippingpro (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public WebElement getShipagree() {
	return shipagree;
}

public WebElement getShippro() {
	return shippro;
}

}              
