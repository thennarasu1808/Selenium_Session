package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement waitToAppear=driver.findElement(By.xpath("//li[22]//a[1]"));
		waitToAppear.click();
		
		//WebElement voilaButton=driver.findElement(By.xpath("//b[contains(text(),\'Voila! I'm here Guys\')]"));
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		String  voilaTest=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn']"))).getText();
		//String voilaTest=voilaButton.getText();
		System.out.println(voilaTest);
	}

}
