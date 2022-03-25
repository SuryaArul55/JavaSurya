import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
  
	WebElement create =driver.findElement(By.linkText("Create New Account"));
	create.click();
	
	WebElement dropdown=driver.findElement(By.className("birthday_day"));
	Select d1=new Select(dropdown);
	d1.selectByValue("23");
	
	WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='Month']"));
	Select month = new Select(dropdown1);
	month.selectByVisibleText("january");
	
	WebElement dropdown2 =driver.findElement(By.id("year"));
	Select year=new Select(dropdown2);
	year.selectByVisibleText("1989");
	
}
}
