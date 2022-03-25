 import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
	WebElement x=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
	x.click();

	WebElement x1=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
	x1.click();

    Alert a=driver.switchTo().alert();
    Thread.sleep(5000);
    a.accept();
    
    WebElement x2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
    x2.click();
    
    Alert a1=driver.switchTo().alert();
    Thread.sleep(3000);
    a1.dismiss();
    
    WebElement x3=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
    x3.click();
    Alert a2=driver.switchTo().alert();
    a2.sendKeys("ar");
    a2.accept();

}
}
