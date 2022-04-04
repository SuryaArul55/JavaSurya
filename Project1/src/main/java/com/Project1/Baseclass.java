package com.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Baseclass {
	public static WebDriver driver;
public static String value;
	public static WebDriver browser_Configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void clickonElement(WebElement element) {
		
		element.click();
	}

	private static void singin_btnclick() {
		// TODO Auto-generated method stub
		singin_btnclick();
	}

	public static void inputonElement(WebElement pass, String data) {
		pass.sendKeys(data);
	}
	public static void inputsendonElement(Alert a4, String data) {
		a4.sendKeys(data);
	}

	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void close() {
		driver.close();
	}

	public static void dropdown(String type, WebElement element, String value) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("VisibleText")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void scrollupanddown(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeAsyncScript("arguments[0].scrollintoview()", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void actionClass(String actionName, WebElement element) {

		Actions a = new Actions(driver);
		try {
			if (actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			} else if (actionName.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void implicitwait(int seconds, TimeUnit i) {
		driver.manage().timeouts().implicitlyWait(seconds, i);
	}

//	public static void sleep1(int seconds) throws Throwable {
	//	Thread.sleep(seconds);
	//}
	/*
	 * // public static void fluent_wait(int timeoutseconds,int
	 * pollingseconds,TimeUnit format) { Wait wait =new
	 * FluentWait(driver).withTimeout(30,seconds) .pollingEvery(10, format)
	 * .ignoring(Exception.class); } //
	 */

	public static void takescreenshot(String path) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	public static void endsession(String type) {
		if (type.equalsIgnoreCase("close")) {
			driver.close();
		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		}
	}

	public static void navigate(String type, String value) {
		if (type.equalsIgnoreCase("to")) {
			driver.navigate().to(value);
		}
	}
public static void alert(String type) {

	 Alert a2=driver.switchTo().alert();
	    a2.sendKeys("ar");
	    a2.accept();
}
public static String Particulardata(String path,int row_Index,int cell_Index) throws IOException  {
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	
	XSSFWorkbook w1=new XSSFWorkbook(fis);
	XSSFSheet SheetAt=w1.getSheetAt(0);
	XSSFRow row=SheetAt.getRow(row_Index);
	org.apache.poi.ss.usermodel.Cell cell=row.getCell(cell_Index);
    org.apache.poi.ss.usermodel.CellType type=cell.getCellType();
    		
    if(type.equals(org.apache.poi.ss.usermodel.CellType.STRING)){
    		value=cell.getStringCellValue();
}
else if(type.equals(org.apache.poi.ss.usermodel.CellType.NUMERIC)) {
	 double numericcellvalue=cell.getNumericCellValue();
	 int val=(int)numericcellvalue;
		value=String.valueOf(val);
} 
return value;
}
}


