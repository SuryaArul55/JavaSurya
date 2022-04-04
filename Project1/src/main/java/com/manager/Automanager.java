package com.manager;

import org.openqa.selenium.WebDriver;

import com.autopom.Addcart;
import com.autopom.Address;
import com.autopom.Loginpage;
import com.autopom.Myaccount;
import com.autopom.Payment;
import com.autopom.Shippingpro;
import com.autopom.Summarypage;
import com.autopom.Thirdorder;
import com.autopom.Womendress;



public class Automanager {
	public WebDriver driver;
	 private Loginpage Login  ;
	 private Myaccount acc;
	 private Addcart adds;
	 private Summarypage summ;
	 private Address addres;
	 private Shippingpro ship;
	 private Payment pay;
	 private Womendress wome;
	private Thirdorder third;
			 public Automanager (WebDriver driver1){
		 
		this.driver=driver1;
	 	 }
public Loginpage get_Instance_Login() {
if(Login==null) {
Login=new Loginpage(driver);
}
return Login;
}
public Myaccount get_Instance_acc() {
if(acc==null) {
acc=new Myaccount(driver);
}
return acc;
}
public Addcart get_Instance_adds() {
if(adds==null) {
adds=new Addcart(driver);
}
return adds;
}
public Summarypage get_Instance_summ() {
if(summ==null) {
summ=new Summarypage(driver);
}
return summ;
}
public Address get_Instance_addres() {
if(addres==null) {
addres=new Address(driver);
}
return addres;
}
public Shippingpro get_Instance_ship() {
if(ship==null) {
ship=new Shippingpro(driver);
}
return ship;  
}
public Payment get_Instance_pay() {
if(pay==null) {
pay=new Payment(driver);
}
return pay;
}

public Womendress get_Instance_wome() {
	if(wome==null) {
	   wome=new Womendress(driver);
	}
return wome;
}
public Thirdorder get_Instance_third() {
	if(third==null) {
	   third=new Thirdorder(driver);
	}
return third;
}

}
