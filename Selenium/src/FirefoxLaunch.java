import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
}
}
