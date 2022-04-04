package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booklitpage {

	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"first_name\"] ")private WebElement first;
	public WebElement getFirst() {
	return first;
}
@FindBy(xpath="//*[@id=\"last_name\"]")private WebElement last;
 
	public WebElement getLast() {
	return last;
}

@FindBy(xpath="//*[@id=\"address\"]")private WebElement add;

	public WebElement getAdd() {
	return add;
}

	@FindBy(xpath="//*[@id=\"cc_num\"] ")private WebElement cnum;
	
	public WebElement getCcno() {
		return cnum;
	}
@FindBy(xpath="//*[@id=\"cc_type\"]")private WebElement ctype;

	public WebElement getctype() {
	return ctype;
}
@FindBy(xpath="//*[@id=\"cc_exp_month\"] ")private WebElement expm;

	public WebElement getExpm() {
	return expm;
}

@FindBy(xpath="//*[@id=\"cc_exp_year\"] ")private WebElement expy; 


	public WebElement getExpy() {
	return expy;
}
@FindBy(xpath="//*[@id=\"cc_cvv\"] ")private WebElement cvno ;

	public WebElement getCvno() {
	return cvno;
}
@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")private WebElement buildl;

public WebElement getBuildl() {
	return buildl;
}

public Booklitpage(WebDriver driver4) {
		this.driver=driver4;	
		PageFactory.initElements(driver, this);
	}
}
