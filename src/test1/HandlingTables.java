package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement tableLink=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img"));
		tableLink.click();
		
		List<WebElement> 	tableColumn=driver.findElements(By.tagName("th"));
		int columnSize=tableColumn.size();
		System.out.println("No of columns: "+columnSize);
		
		
		List<WebElement> 	tableRows=driver.findElements(By.tagName("tr"));
		int rowSize=tableRows.size();
		System.out.println("No of columns: "+rowSize);
		
		
		
	}

}
