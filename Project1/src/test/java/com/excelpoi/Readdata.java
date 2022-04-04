package com.excelpoi;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {
private static Workbook wb;
 public Readdata() throws Throwable {
	 File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\testdata\\demo.xlsx");
	 FileInputStream fl= new FileInputStream(f);
	     wb=new XSSFWorkbook(fl);
 }
public  void particular_Cell_Data() {
	Sheet s=wb.getSheetAt(0);
    Row r=s.getRow(2);
 Cell c=r.getCell(2);
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
}
public void all_data() {
 Sheet s= wb.getSheetAt(0);
 for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
	 Row r=s.getRow(i);//i represent row index
	 for(int j=0;j <r.getPhysicalNumberOfCells();j++);//j represent column index
	 {
		 Cell c=r.getCell(2);
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
		}         
	 }
 }

public static void main(String[] args) throws Throwable {
	Readdata data =new Readdata();
	data.particular_Cell_Data();
	data.all_data();
	wb.close();
	
}
}

