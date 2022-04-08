import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Microsoft {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
}
}
