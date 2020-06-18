package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();

		WebElement editLink = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editLink.click();
		Thread.sleep(3000);

		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("thennarasu@gmail.com");

		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys("My text");

		WebElement getDefaultTextBox = driver.findElement(By.name("username"));
		String value = getDefaultTextBox.getAttribute("value");
		System.out.println(value);

		WebElement cleartextBox = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		cleartextBox.clear();

		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean disabled =disabledBox.isEnabled();
		System.out.println(disabled);
	}

}
