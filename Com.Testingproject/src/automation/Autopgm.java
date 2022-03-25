package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Autopgm {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();		
driver.manage().window().maximize();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
//login page
WebElement login=driver.findElement(By.xpath("//*[@class='login']"));
login.click();
WebElement email=driver.findElement(By.xpath("//*[@name='email']"));
email.sendKeys("umayalrr@gmail.com");
WebElement password=driver.findElement(By.xpath("//*[@name='passwd']"));
password.sendKeys("umayalarul");
WebElement loginclick=driver.findElement(By.id("SubmitLogin"));
loginclick.click();
WebElement tshirt=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
tshirt.click();
WebElement size=driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_2\"]"));
size.click();
WebElement msize=driver.findElement(By.xpath("\r\n" + 
		"//*[@id=\"uniform-layered_id_attribute_group_2\"]/span "));
msize.click();
WebElement colour=driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_13\"]"));
colour.click();
Thread.sleep(2000);
WebElement addcart1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"));
addcart1.click();
WebElement imageproceed=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
imageproceed.click();
WebElement addcart1close=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));//
addcart1close.click();
Thread.sleep(3000);
WebElement continue1=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
continue1.click();
Thread.sleep(3000);
WebElement cart=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
cart.click(); 
//WebElement cartproceed=driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"));
//cartproceed.click();
WebElement cartproceed=driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium"));
cartproceed.click(); 
Thread.sleep(3000);
WebElement sign=driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/a"));
sign.click();
Thread.sleep(3000);
WebElement add=driver.findElement(By.xpath("//*[@name='processAddress']"));
add.click();
Thread.sleep(3000);
WebElement agreeproceed=driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]/span"));
agreeproceed.click();
Thread.sleep(3000);
WebElement agproceed=driver.findElement(By.xpath("//*[@id=\"form\"]/p/button "));
agproceed.click();
WebElement aproceed=driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
aproceed.click();
Thread.sleep(2000);
WebElement paymentproceed=driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
paymentproceed.click();

Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor) driver; 
js.executeScript("window.scroll(0,300)");
Thread.sleep(3000);
TakesScreenshot ts=(TakesScreenshot)driver;
File  source=ts.getScreenshotAs(OutputType.FILE);
File destination = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");

FileHandler.copy(source, destination);

WebElement Paticularshot= driver.findElement(By.className("header-section"));
		File  pshot=Paticularshot.getScreenshotAs(OutputType.FILE);
File shotdesti = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\screenshot\\img.png");
FileHandler.copy(pshot, shotdesti);



}
}
