import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();//object 
	    driver.get("http://www.leafground.com/pages/Window.html");
	    driver.manage().window().maximize();

        String sw=driver.getWindowHandle();//store string/current window handel
          System.out.println("current window");
             WebElement w=driver.findElement(By.id("home"));
               w.click();
        Set<String> nw= driver.getWindowHandles();//set perform

        for(String nnw:nw) { //multiple window= access in for loop
	    	driver.switchTo().window(nnw);//switch
 }
        WebElement e =driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight'][1]"));//first window
        e.click();
        driver.close();
        driver.switchTo().window(sw);//old window
        WebElement w1= driver.findElement(By.xpath("//button[@onclick='openWindows()']"));//second window
        w1.click();

        int num=driver.getWindowHandles().size();//calculate how many open
        System.out.println("no of window open"+num);

}
}