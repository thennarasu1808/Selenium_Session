package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
		dropDownButton.click();
		System.out.println("Clicked the DropDown Button");

		// Select by index
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(1);

		// Select by Text
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select selectTxt = new Select(dropDown2);
		selectTxt.selectByVisibleText("Appium");

		// Select by Value
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select selectvalue = new Select(dropDown3);
		selectvalue.selectByValue("3");
		
		//Get Options
		WebElement dropDown4 = driver.findElement(By.className("dropdown"));
		Select selectOption = new Select(dropDown4);
		List<WebElement> noOfOptions=selectOption.getOptions();
		int number=noOfOptions.size();
		System.out.println("No of options: "+number);
		
		Thread.sleep(3000);
		dropDown4.sendKeys("Loadrunner"+Keys.ENTER);
		
		WebElement dropDown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multipleSelectBox=new Select(dropDown5);
		multipleSelectBox.selectByIndex(2);
		multipleSelectBox.selectByVisibleText("Loadrunner");
	}
}
