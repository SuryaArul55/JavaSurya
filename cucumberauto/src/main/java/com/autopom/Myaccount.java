package com.autopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount {

	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")private WebElement tshirt;
	
	public Myaccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getTshirt() {
		return tshirt;
	}
	
	
}
