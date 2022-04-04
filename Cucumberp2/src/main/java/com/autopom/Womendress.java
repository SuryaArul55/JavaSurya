package com.autopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womendress {
	public WebDriver driver;
	 @FindBy(xpath="//*[@id=\"center_column\"]/p/a")private WebElement backto;
	 @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")private WebElement wom;
	 @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")private WebElement bluose;
	 @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")private WebElement proce;
	 @FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")private WebElement summproceed ;
	 @FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")private WebElement addpro;
	 @FindBy(xpath="//*[@id=\"cgv\"]")private WebElement shippingag;
	 @FindBy(xpath="//*[@id=\"form\"]/p/button")private WebElement shippingpro;
	 @FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")private WebElement paym;
	 @FindBy(xpath="//*[@id=\"cart_navigation\"]/button")private WebElement con;
	 
	public Womendress(WebDriver driver) {
        this.driver=driver;
     PageFactory.initElements(driver, this);

	}
	public WebElement getBackto() {
		return backto;
	}
	
	public WebElement getWom() {
		return wom;
	}
	
	public WebElement getBluose() {
		return bluose;
	}
	
	public WebElement getProce() {
		return proce;
	}
	
	public WebElement getSummproceed() {
		return summproceed;
	}
	
	public WebElement getAddpro() {
		return addpro;
	}
	public WebElement getShippingag() {
		return shippingag;
	}
	public WebElement getShippingpro() {
		return shippingpro;
	}
	
	public WebElement getPaym() {
		return paym;
	}
	
	public WebElement getCon() {
		return con;
	}
	
	
	
}
