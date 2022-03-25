package com.project;

import java.util.List;



public class RunnerClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\com.project\\Driver1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");

	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	WebElement b=driver.findElement(By.id("Click"));
	b.click();
	
	String t=   driver.findElement(By.id("Click")).getText();
	System.out.println(t);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	WebElement b1=driver.findElement(By.id("Click1"));
	b1.click();
	String t1=driver.findElement(By.id("Click1")).getText();
	System.out.println(t1);
	driver.switchTo().defaultContent();
	List<WebElement> tNo=driver.findElements(By.tagName("iframe"));
			
	int s=tNo.size();
	System.out.println("Total Number of Iframe:"+s);
}
}
	
}
