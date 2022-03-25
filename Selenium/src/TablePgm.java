import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePgm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
String innerText=driver.findElement(("//table/tbody/tr[2]/td[6]"));
	
	}
}