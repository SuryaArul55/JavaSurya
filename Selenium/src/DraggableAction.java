import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableAction {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");

	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();

	WebElement from=driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement  To = driver.findElement(By.xpath("//*[@id='droppable']"));
	Actions a= new Actions(driver);
	//a.clickAndHold(from).moveToElement(To).release(To).build().perform();
	a.dragAndDrop(from,To).build().perform();
}
}