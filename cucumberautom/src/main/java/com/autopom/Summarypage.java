package com.autopom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summarypage {
public WebDriver driver;
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")private WebElement add1;	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")private WebElement proceedcart; 
	public Summarypage (WebDriver driver ) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public WebElement getAdd1() {
		return add1;
	}
	public WebElement getProceedcart() {
		return proceedcart;
	}
	

}
