package test1;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:\\Users\\tkarunakaran\\Desktop\\Test-Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet1 = workbook.createSheet("testdata1");
		// giving sheet name as 'testdata1
		XSSFSheet sheet2 = workbook.createSheet("testdata2");
		for (int i = 0; i <= 5; i++) {
			XSSFRow row1 = sheet1.createRow(i);
			XSSFRow row2 = sheet2.createRow(i);
			for (int j = 0; j <= 3; j++) {
				row1.createCell(j).setCellValue("Thenna");
				row2.createCell(j).setCellValue("Rithi");
			}
		}
		workbook.write(fos);
		fos.close();

	}

}
