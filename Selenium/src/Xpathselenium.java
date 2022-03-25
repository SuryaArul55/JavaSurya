import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathselenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://adactinhotelapp.com//");
    driver.manage().window().maximize();
    
    WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
    username.sendKeys("umayalarul");
    System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
    username.clear();
    username.sendKeys("umayalarul");
    
    WebElement click=driver.findElement(By.name("login"));
	click.click();
  
	
    
    //System.out.println(driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value"));
    //WebElement forgetpass=driver.findElement(By.linkText("Forgot Password?"));
    //forgetpass.click();
    
    
   // driver.navigate().back();
    //WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
    //password.sendKeys("Ammu17");
    
    //System.out.println("password:"+driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value"));
    //WebElement login=driver.findElement(By.id("login"));
    
   //*
    //System.out.println(driver.findElement(By.xpath("//td[@class='welcome_menu']")).getText());
    //System.out.println(driver.findElement(By.xpath("")).getText());
    //System.out.println(driver.findElement(By.xpath("")).getText());
   // driver.close();
}
}
