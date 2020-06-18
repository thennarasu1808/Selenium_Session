package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img"));
		dropDownButton.click();
		System.out.println("Clicked the Alert Button");
		Thread.sleep(2000);
		
		//Accept Alert
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		// Confirm the alert
		WebElement confirmButton =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmButton.click();
		Alert confirmAlert= driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();
		
		//Prompt an alert before accept
		WebElement promtBox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promtBox.click();
		Alert promtAlert= driver.switchTo().alert();
		Thread.sleep(2000);
		promtAlert.sendKeys("selenium");
		Thread.sleep(2000);
		promtAlert.accept();
	}

}
