package com.Project1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Automation_class extends Baseclass {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = browser_Configuration("chrome");
		
		geturl("http://automationpractice.com/index.php");
			

		WebElement login = driver.findElement(By.xpath("//*[@class='login']"));
		clickonElement(login);
		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		inputonElement(email,"umayalrr@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@name='passwd']"));
		inputonElement(password,"umayalarul");
		WebElement loginclick = driver.findElement(By.id("SubmitLogin"));
		clickonElement(loginclick);
		
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		clickonElement(tshirt);
		
		WebElement size = driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_2\"]"));
		clickonElement(size);
		WebElement msize = driver.findElement(By.xpath("\r\n" + "//*[@id=\"uniform-layered_id_attribute_group_2\"]/span "));
		clickonElement(msize);
		WebElement colour = driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_13\"]"));
		clickonElement(colour);
		WebElement addcart1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span"));
		clickonElement(addcart1);
		   
		WebElement addcart1close=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));//
		clickonElement(addcart1close);
		implicitwait(3000,TimeUnit.SECONDS);
		WebElement proceedcart=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		clickonElement(proceedcart);

		WebElement proceedsummary=driver.findElement(By.xpath(" //*[@id=\"center_column\"]/p[2]/a[1]"));
		clickonElement(proceedsummary); 
		
		WebElement addressproceed=driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		clickonElement(addressproceed); 
		
		WebElement agreeshiping=driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]/span"));
		clickonElement(agreeshiping);
		
		WebElement spro = driver.findElement(By.xpath(" //*[@id=\"form\"]/p/button"));
		clickonElement(spro);
	
		WebElement pay= driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		clickonElement(pay);
		
		WebElement payproceed = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button "));
		clickonElement(payproceed);
			
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");
		FileHandler.copy(source, destination);

		
	}
}
