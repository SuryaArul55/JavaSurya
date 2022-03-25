import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com//");
    String title=driver.getTitle();
    System.out.println("Title:"+title);
    String url=driver.getCurrentUrl();
    System.out.println("URL:"+url);

    WebElement userid=driver.findElement(By.id("username"));
    	userid.sendKeys("suryaayrus");
    	
    WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Jack2011");

    WebElement click=driver.findElement(By.name("login"));
    	click.click();
 
}
}
