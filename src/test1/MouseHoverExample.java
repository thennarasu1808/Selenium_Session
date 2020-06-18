package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement windowsBtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[25]/a"));
		windowsBtn.click();
		System.out.println("Clicked the Mouse hover Button");
		Thread.sleep(2000);
		
		WebElement testLeafButton=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(testLeafButton).build().perform();
		WebElement selenium=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[1]/a"));
		selenium.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
