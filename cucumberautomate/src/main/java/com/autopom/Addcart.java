package com.autopom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
public WebDriver driver;
@FindBy(xpath="//*[@id=\\\"layered_id_attribute_group_2\\\"]")private WebElement Tsize;
@FindBy(xpath="//*[@id=\"layered_id_attribute_group_2\"]")private WebElement msize;
@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_3\"]/li[1]/label/a")private WebElement colour;
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span")private WebElement addcart;
public Addcart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public WebElement getTsize() {
	return Tsize;
}

public WebElement getMsize() {
	return msize;
}
public WebElement getColour() {
	return colour;
}

public WebElement getAddcart() {
	return addcart;
}
}