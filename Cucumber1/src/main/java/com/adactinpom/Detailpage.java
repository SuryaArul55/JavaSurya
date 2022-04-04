package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detailpage {

	
	@FindBy(xpath="//*[@id=\"location\"]")private WebElement Location;
	@FindBy(xpath="//*[@id=\"hotels\"]")private WebElement Hotel;
	@FindBy(xpath="//*[@id=\"room_type\"]")private WebElement room;
	@FindBy(xpath="//*[@id=\"room_nos\"]")private WebElement roomno;
	@FindBy(xpath="//*[@id=\"datepick_in\"]")private WebElement checkin;
	@FindBy(xpath="//*[@id=\"datepick_out\"]")private WebElement checkout;
	@FindBy(xpath="//*[@id=\"adult_room\"]")private WebElement adult;
	@FindBy(xpath="//*[@id=\"child_room\"] ")private WebElement child;
	@FindBy(xpath="//*[@id=\"Submit\"] ")private WebElement submit;
	private WebDriver driver;
	
	public Detailpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
	
	