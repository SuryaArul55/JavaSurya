package com.autopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thirdorder {
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/p/a")private WebElement backtoorder;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")private WebElement dressess ;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")private WebElement adddress ;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")private WebElement pc;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")private WebElement summproceed ;
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")private WebElement addproceed;
	@FindBy(xpath="//*[@id=\"cgv\"]")private WebElement  shagg ;
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")private WebElement shpro ;
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")private WebElement paym  ;
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")private WebElement  icorder  ;
	public WebDriver getDriver() {
		return driver;
	}
	public Thirdorder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getBacktoorder() {
		return backtoorder;
	}
	public WebElement getDressess() {
		return dressess;
	}
	
	public WebElement getAdddress() {
		return adddress;
	}
	
	public WebElement getPc() {
		return pc;
	}
	
	public WebElement getSummproceed() {
		return summproceed;
	}
	
	public WebElement getAddproceed() {
		return addproceed;
	}
	
	public WebElement getShagg() {
		return shagg;
	}
	
	public WebElement getShpro() {
		return shpro;
	}
	
	
	public WebElement getPaym() {
		return paym;
	}

	public WebElement getIcorder() {
		return icorder;
	}
	
	 
	 
	 
	
	 
	 
	
	
}
