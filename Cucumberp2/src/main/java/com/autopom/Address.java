package com.autopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {

	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")private WebElement addresspro;
	public Address(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		}
	public WebElement getAddresspro() {
		return addresspro;
	}
	}
