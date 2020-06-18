package test1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPOI {
	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		FileInputStream excel = new FileInputStream("C:\\Users\\tkarunakaran\\Desktop\\Zone_Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheet("zonedata");
		int rowCount = sheet.getLastRowNum();
		System.out.println("No of Rows is : " + rowCount);

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row1 = sheet.getRow(i);

			try {
				XSSFCell Cell0 = row1.getCell(0);
				String zoneName = Cell0.getStringCellValue();
				System.out.println(zoneName);
				driver.findElement(By.name("")).sendKeys(zoneName);
			} catch (Exception e) {
				System.out.println(e);
			}

		try {
				XSSFCell Cell1 = row1.getCell(1);
				String managerName = Cell1.getStringCellValue();
				System.out.println(managerName);
				driver.findElement(By.name("q")).clear();
				driver.findElement(By.name("q")).sendKeys(managerName);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				XSSFCell Cell2 = row1.getCell(2);
				int telephoneNo = (int) Cell2.getNumericCellValue();
				System.out.println(telephoneNo);
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				XSSFCell Cell3 = row1.getCell(3);
				String addresLine1 = Cell3.getStringCellValue();
				System.out.println(addresLine1);
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				XSSFCell Cell4 = row1.getCell(4);
				String addresLine2 = Cell4.getStringCellValue();
				System.out.println(addresLine2);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				XSSFCell Cell5 = row1.getCell(5);
				String city = Cell5.getStringCellValue();
				System.out.println(city);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				XSSFCell Cell6 = row1.getCell(6);
				String state = Cell6.getStringCellValue();
				System.out.println(state);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				XSSFCell Cell7 = row1.getCell(7);
				String postalCode = Cell7.getStringCellValue();
				System.out.println(postalCode);
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				XSSFCell Cell8 = row1.getCell(8);
				String country = Cell8.getStringCellValue();
				System.out.println(country);
			} catch (Exception e) {
				System.out.println(e);
			} 
	
		}

	}

}
