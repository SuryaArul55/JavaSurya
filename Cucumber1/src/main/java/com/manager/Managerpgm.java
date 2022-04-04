package com.manager;

import org.openqa.selenium.WebDriver;

import com.adactinpom.Booklitpage;
import com.adactinpom.Detailpage;
import com.adactinpom.DetailsConpage;
import com.adactinpom.Homepage;

public class Managerpgm {
public WebDriver driver;
 private Homepage home;
 private Detailpage detail;
 private DetailsConpage detailscon;
 private Booklitpage book;
 
 public Managerpgm (WebDriver driver1){
	 
	this.driver=driver1;
 }
 public Homepage get_Instansce_home() {
	 if (home==null) {
		 home=new Homepage(driver);
	 }
	return home;
 }
 
 public Detailpage get_instance_detail() {
	 if (detail==null) {
		 detail=new Detailpage(driver);
	 }
	return detail;
	 
 }
 public DetailsConpage get_instance_detailcon() {
	 if (detailscon==null) {
		 detailscon=new DetailsConpage(driver);
	 }
	return detailscon;
	 
 }

 public Booklitpage get_instance_Book() {
	 if (book==null) {
		 book=new Booklitpage(driver);
	 }
	return book;
	 
 }

}

