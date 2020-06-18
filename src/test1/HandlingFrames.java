package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img"));
		dropDownButton.click();
		System.out.println("Clicked the Frames Button");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		WebElement insideFrame=driver.findElement(By.id("Click"));
		insideFrame.click();
		System.out.println("Clicking on 'Click Me' button");
		
		String expectedText="Hurray! You Clicked Me.";
		String actualText=insideFrame.getText();
		
		if(expectedText.equalsIgnoreCase(actualText)){
			System.out.println("Text is matching and the test case is passed");
		}else {
			System.out.println("Text is not matching testcase failed");
		}
		
		//Coming back to default page
		driver.switchTo().defaultContent();
		
		//Working with nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedFrame= driver.findElement(By.id("Click1"));
		nestedFrame.click();
		System.out.println("Nested frame is clicked.");
		
		driver.switchTo().defaultContent();
		//Find total no of frames.
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		int size=totalFrames.size();
		System.out.println("Total no of frames: "+size);
		
	}

}
