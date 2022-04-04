package com.excelpoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Xread {
public  static void Paticularcell() throws IOException {
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\demo.xlsx");
    FileInputStream fl= new FileInputStream(f);
    XSSFWorkbook wb=new XSSFWorkbook(fl);
  
    XSSFSheet s=wb.getSheetAt(0);
            XSSFRow r=s.getRow(2);
         XSSFCell c=r.getCell(2);
         CellType type=c.getCellType();
         if(type.equals(CellType.STRING)){
        	 String Cv =c.getStringCellValue();
        	 
        	 System.out.println(Cv);
         }
         else if(type.equals(CellType.NUMERIC)) {
        	 double cellvalue=c.getNumericCellValue();
        	 int value=(int)cellvalue;
        	 System.out.println(value);
        }
wb.close();
}
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\demo.xlsx");
    FileInputStream fl= new FileInputStream(f);
    XSSFWorkbook wb=new XSSFWorkbook(fl);
   XSSFSheet s=wb.getSheetAt(0);
	
	
   
   
   
	Paticularcell();
}
        	 
}