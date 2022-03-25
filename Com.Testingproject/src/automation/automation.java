package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
driver.manage().window().maximize();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement login=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));
login.click();
Thread.sleep(3000);
WebElement email=driver.findElement(By.xpath("//*[@id='email_create']"));
email.sendKeys("umayalrr@gmail.com"); 
WebElement creatk=driver.findElement(By.xpath("//*[@id='SubmitCreate']/span"));
creatk.click();
Thread.sleep(3000);
WebElement mrclick=driver.findElement(By.cssSelector("input#id_gender1"));
mrclick.click();

//WebElement mrsclick=driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label/text()[1]"));
//mrsclick.click();



WebElement nameet=driver.findElement(By.xpath("//*[@id='customer_firstname']"));
nameet.sendKeys("umayal");

WebElement name2=driver.findElement(By.xpath("//*[@id='customer_lastname']"));
name2.sendKeys("arul");

//WebElement mail =driver.findElement(By.xpath("//*[@id=\"email\"]"));
//mail.sendKeys("");

WebElement password =driver.findElement(By.xpath("//*[@id='passwd']"));
password.sendKeys("umayalarul");

WebElement date =driver.findElement(By.xpath("//*[@id='days']"));
date.sendKeys("31");

WebElement month =driver.findElement(By.xpath("//*[@id='months']"));
month.click();
WebElement monthclick=driver.findElement(By.xpath("//*[@id='months']/option[13]"));
monthclick.click();

WebElement year=driver.findElement(By.xpath("//*[@id='uniform-years']"));
year.click();
WebElement year1=driver.findElement(By.xpath("//*[@id=\"years\"]/option[3]"));
year1.click();


WebElement fname1=driver.findElement(By.xpath("//*[@id='firstname']"));
fname1.sendKeys("umayal");
WebElement lname1=driver.findElement(By.xpath("//*[@id='lastname']"));
lname1.sendKeys("arul");

WebElement addre=driver.findElement(By.xpath("//*[@id='address1']"));
addre.sendKeys("amul nagar");
WebElement add1=driver.findElement(By.xpath("//*[@id='address2']"));
add1.sendKeys("kml");
      
WebElement city=driver.findElement(By.xpath("//*[@id='city']"));
city.sendKeys("dam");
WebElement state=driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
state.click();
WebElement state1=driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[16]"));
state1.click();

WebElement pin=driver.findElement(By.xpath("//*[@id='postcode']"));
pin.sendKeys("21002");

WebElement ctid=driver.findElement(By.xpath("//*[@id='id_country']"));
ctid.click();

WebElement ctid1=driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
ctid1.click();

WebElement addinfo=driver.findElement(By.xpath("//*[@id='other']"));
addinfo.sendKeys("Abcd");

WebElement ph1=driver.findElement(By.xpath("//*[@id='phone']"));
ph1.sendKeys("1234567890");
WebElement ph2=driver.findElement(By.xpath("//*[@id='phone_mobile']"));
ph2.sendKeys("1234567890");

WebElement ref=driver.findElement(By.xpath("//*[@id='alias']"));
ref.sendKeys("gjjhk");

WebElement reg=driver.findElement(By.xpath("//*[@id='submitAccount']/span"));
reg.click();


	}
}
