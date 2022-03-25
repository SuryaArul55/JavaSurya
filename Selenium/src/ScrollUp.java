
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	
	//scrolldown
	JavascriptExecutor js=(JavascriptExecutor) driver; //typecasting 
	//narrowing :memory consumption(small-big) ,seleinum changing into javascript//
/*
	js.executeScript("window.scroll(0,1000)");
	Thread.sleep(5000);
	//scrollup
  js.executeScript("window.scroll(0,-2500");
//bottom of page
  Thread.sleep(1000);
  js.executeScript("window.scroll(0,document.body.scrollHeight)");
  Thread.sleep(1000);
  js.executeScript("window.scroll(0,0)");
  Thread.sleep(5000);
	//specific element position
	 * 
	 */
	WebElement m=driver.findElement(By.xpath("//*[@class='selenium']"));
	js.executeScript("argument[0].scrollIntoview(true);",m);
		js.executeScript("window.scroll(0,0)");
	
	}
}