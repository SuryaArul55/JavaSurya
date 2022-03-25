package automation;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Com.Testingproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://adactinhotelapp.com//");

WebElement userid=driver.findElement(By.xpath("//input[@id='username']"));
	userid.sendKeys("Jacksparrow22");
	
WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("Jack22");

WebElement click=driver.findElement(By.name("login"));
	click.click();

WebElement Location=driver.findElement(By.id("location"));
Location.click();

WebElement optioncountry=driver.findElement(By.xpath("//*[@id='location']/option[3]"));
optioncountry.click();

WebElement Selecthotel=driver.findElement(By.id("hotels"));
Selecthotel.click();

WebElement optionhotel=driver.findElement(By.xpath("//*[@id='hotels']/option[3]"));
optionhotel.click();

WebElement Selectrmtype=driver.findElement(By.id("room_type"));
Selectrmtype.click();

WebElement optionroomtype=driver.findElement(By.xpath("//*[@id='room_type']/option[4]"));
optionroomtype.click();

WebElement Selectroomnumber=driver.findElement(By.id("room_nos"));
Selectroomnumber.click();
WebElement optionrmno=driver.findElement(By.xpath("//*[@id='room_nos']/option[5]"));
optionrmno.click();
WebElement Optiondate=driver.findElement(By.id("datepick_in"));
Optiondate.sendKeys("22/03/2022");

WebElement outdate=driver.findElement(By.xpath("//*[@value='01/03/2022']"));
outdate.sendKeys("01/04/2022");
WebElement roomoptionadult=driver.findElement(By.id("adult_room"));
roomoptionadult.click();
WebElement optionadult=driver.findElement(By.xpath("//*[@id='adult_room']/option[3]"));
optionadult.click();
WebElement roomoptionkid=driver.findElement(By.id("child_room"));
roomoptionkid.click();
WebElement optionkid=driver.findElement(By.xpath("//*[@id='child_room']/option[2]"));
optionkid.click();

WebElement Clicksearch=driver.findElement(By.id("Submit"));
Clicksearch.click();



WebElement radiobutton1=driver.findElement(By.id("radiobutton_0"));
radiobutton1.click();
WebElement continuebutton=driver.findElement(By.xpath("//*[@id='continue']"));
continuebutton.click();
WebElement name=driver.findElement(By.id("first_name"));
name.sendKeys("first_name");
WebElement lastname=driver.findElement(By.xpath("//*[@id='last_name']"));
lastname.sendKeys("arul");
WebElement address=driver.findElement(By.xpath("//*[@id='address']"));
address.sendKeys("45 wsdfdsvvvv");
WebElement ccno=driver.findElement(By.xpath("//*[@id='cc_num']"));
ccno.sendKeys("1234567891011125");

WebElement cardtype=driver.findElement(By.xpath("//*[@id='cc_type']"));
cardtype.click();
WebElement cardtypemast=driver.findElement(By.xpath("//*[@id='cc_type']/option[4]"));
cardtypemast.click();  
WebElement cardexpire=driver.findElement(By.xpath("//*[@id='cc_exp_month']"));
cardexpire.click();
WebElement yearbox=driver.findElement(By.xpath("//*[@id='cc_exp_month']/option[10]"));
yearbox.click();
WebElement year1=driver.findElement(By.xpath("//*[@id='cc_exp_year']"));
year1.click();
WebElement yrclick=driver.findElement(By.xpath("//*[@id='cc_exp_year']/option[13]"));
yrclick.click();
WebElement ccv=driver.findElement(By.xpath("//*[@id='cc_cvv']"));
ccv.sendKeys("556");
WebElement continuebk=driver.findElement(By.xpath("//*[@id='book_now']"));
continuebk.click();
WebElement mylti1=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]"));
mylti1.click();
Thread.sleep(2000);
//driver.get("https://adactinhotelapp.com//BookedItinerary.php");
TakesScreenshot ts=(TakesScreenshot)driver;
File  source=ts.getScreenshotAs(OutputType.FILE);
File destination = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");

FileHandler.copy(source, destination);

WebElement Paticularshot= driver.findElement(By.className("header-section"));
		File  pshot=Paticularshot.getScreenshotAs(OutputType.FILE);
File shotdesti = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");
FileHandler.copy(pshot, shotdesti);



	}
	
}