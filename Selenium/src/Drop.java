import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	driver.manage().window().maximize();
	
	WebElement w= driver.findElement(By.name("coffee"));
	
	Select s=new Select(w);
	s.selectByValue("regular");
	s.selectByIndex(3);
	s.selectByVisibleText("With cream & sugar");
}
}
