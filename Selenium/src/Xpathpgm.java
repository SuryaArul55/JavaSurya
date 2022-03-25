import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
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

WebElement forgotpassword=driver.findElement(By.linkText("ForgotPassword?"));
forgotpassword.click();

WebElement goback=driver.findElement(By.partialLinkText("Go back to Login page"));
goback.click();

}	
}
