package com.excelpoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writex {


public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\Admin\\Desktop\\Writex.xlsx");//general location from property and add the location
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
wb.createSheet("user_max1").createRow(0).createCell(0).setCellValue("Email");
wb.getSheet("user_max1").getRow(0).createCell(1).setCellValue("password");
wb.getSheet("user_max1").createRow(1).createCell(0).setCellValue("jack");
wb.getSheet("user_max1").getRow(1).createCell(1).setCellValue("umayal10");
FileOutputStream fos=new FileOutputStream(f);//fos=flow of data into a stream( email,password)
wb.write(fos);
wb.close();
System.out.println("write successfully");

}
}
