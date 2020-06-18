package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Pojo {

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {

		// Create an object of File class to opene xls/xlsx file

		File file = new File(filePath + "\\" + fileName);

		// Create an object for FileInputStream class to read excel file

		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name

		String FileExtension = fileName.substring(fileName.indexOf("."));

		// check the condition if file is xlsx

		if (FileExtension.equals(".xlsx")) {
			workbook = new XSSFWorkbook(fis);

		} else if (FileExtension.equals(".xls")) {

			workbook = new HSSFWorkbook(fis);
		}
		
		// Read excel row count
		
		Sheet sheet=workbook.getSheet("sheetName");
		int rowCount=sheet.getLastRowNum();
		
		// Read excel column count
		
	
		//Create a loop over all the rows of excel file to read it
		
		for(int i=0;i<=rowCount;i++) {
			Row row=sheet.getRow(i);
			
			//Create a loop to print cell values in a row
			
			for(int j=0;j<=row.getLastCellNum();j++) {
				
				//    //Print Excel data in console
				
		System.out.println(row.getCell(j).getStringCellValue()+"||");
			}
		}

	}

}
