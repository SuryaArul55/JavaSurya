package com.manager;

import org.openqa.selenium.WebDriver;

import com.autopom.Addcart;
import com.autopom.Address;
import com.autopom.Loginpage;
import com.autopom.Myaccount;
import com.autopom.Payment;
import com.autopom.Shippingpro;
import com.autopom.Summarypage;



public class Automanager {
	public WebDriver driver;
	 private Loginpage Login  ;
	 private Myaccount acc;
	 private Addcart addc;
	 private Summarypage summary;
	 private Address adds;
	 private Shippingpro ship;
	 private Payment paym;
	 
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
public Addcart get_Instance_addc() {
if(addc==null) {
addc=new Addcart(driver);
}
return addc;
}
public Summarypage get_Instance_summary() {
if(summary==null) {
summary=new Summarypage(driver);
}
return summary;
}
public Address get_Instance_adds() {
if(adds==null) {
adds=new Address(driver);
}
return adds;
}
public Shippingpro get_Instance_ship() {
if(ship==null) {
ship=new Shippingpro(driver);
}
return ship;  
}
public Payment get_Instance_paym() {
if(paym==null) {
paym=new Payment(driver);
}
return paym;
}

}
