

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();

			driver.get("http://ironspider.ca/forms/dropdowns.htm");
			WebElement w=driver.findElement(By.name("coffee"));
			Select s=new Select(w);
			List<WebElement>m=s.getAllSelectedOptions();
			//for(WebElement x:m) {
				
   			//System.out.println(x.getText());
   			//System.out.println(x.getAttribute("value"));
			s.deselectByValue("cream");
			s.selectByValue("regular");
			
			//for(WebElement webElement :m) {
			//System.out.println(webElement.getText());
			//System.out.println(webElement.getAttribute("value"));
			boolean b=s.isMultiple();
			System.out.println(b);
}
	}	
//}
