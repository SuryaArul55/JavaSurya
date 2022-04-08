import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.get("https://adactinhotelapp.com/");

WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
username.sendKeys("umayalarul");

WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("Ammu17");

WebElement login=driver.findElement(By.xpath("//input[@id='login']"));
login.click();
driver.navigate().back();


}
}
