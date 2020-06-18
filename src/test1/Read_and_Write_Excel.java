package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_and_Write_Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\tkarunakaran\\Desktop\\Compare Age data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		System.out.println("Row count :" +rowCount);
		
		int colCount=sheet.getRow(1).getLastCellNum();
		System.out.println("Column count :" +colCount);
		
/*		
		  String cell0 =sheet.getRow(2).getCell(0).getStringCellValue();
		  System.out.println("cel0 value: "+cell0); int cell1
		  =(int)sheet.getRow(2).getCell(1).getNumericCellValue();
		  System.out.println("cel1 value: "+cell1);*/
		 
		
		
		for(int i = 1; i<=rowCount; i++)
		  {
			 XSSFCell cell = sheet.getRow(i).getCell(1);
			 String celltext="";
			 
			 //Get celltype values
			 if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			 {
				 celltext=cell.getStringCellValue();
			 }
			 else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			 {
				  celltext=String.valueOf(cell.getNumericCellValue());
			 }
			 else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
			 {
				 celltext="";
			 }
			System.out.println(celltext);
			  if(Double.parseDouble(celltext)>=18) {
				  sheet.getRow(i).getCell(2).setCellValue("Major");
			  }else if(Double.parseDouble(celltext)<=18) {
				  sheet.getRow(i).getCell(2).setCellValue("Minor");
			  }
		  }
		
		fis.close();
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\tkarunakaran\\Desktop\\Compare Age data.xlsx");
		workbook.write(fos);
		fos.close();
			 
		  }
			 		
	}


