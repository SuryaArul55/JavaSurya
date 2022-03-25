import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPgm {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");

	driver.get("https://indianexpress.com/article/business/union-budget-2022-live-updates-nirmala-sitharaman-modi-govt-7748785/");
	driver.manage().window().maximize();

	TakesScreenshot ts=(TakesScreenshot)driver;
	File  source=ts.getScreenshotAs(OutputType.FILE);
	File destination = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");
	
	FileHandler.copy(source, destination);
	
	WebElement Paticularshot= driver.findElement(By.className("header-section"));
			File  pshot=Paticularshot.getScreenshotAs(OutputType.FILE);
	File shotdesti = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");
	FileHandler.copy(pshot, shotdesti);
	
	driver.quit();
	}
}