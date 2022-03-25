import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
Driver.get("https://www.facebook.com");
Driver.manage().window().maximize();

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();

System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
WebDriver driver1=new EdgeDriver();
driver1.get("https://www.google.com/");
driver1.manage().window().maximize();

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver drive2=new ChromeDriver();//object 
drive2.get("https://www.google.com");
drive2.manage().window().maximize();


}
}
