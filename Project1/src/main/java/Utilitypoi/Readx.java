package Utilitypoi;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readx {
public static void main(String[] args) throws IOException {
	String fileLocation="./testdata/adactin.xlsx";  //locator
	XSSFWorkbook wbook=new XSSFWorkbook(fileLocation);
	XSSFSheet sheet=wbook.getSheetAt(0);//return excess sheet
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(1);
	String value=cell.getStringCellValue();
	System.out.println(value);
	
}
}
