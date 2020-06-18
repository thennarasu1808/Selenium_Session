package test1;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotExample {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img"));
		dropDownButton.click();
		System.out.println("Clicked the Alert Button");
		Thread.sleep(2000);
		
		//Accept Alert
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		
		//Take Screenshot using selenium File Handler
		//TakesScreenshot will not take screenshot of alerts and will throw 'UnhandledAlertException' 
		//FilHandler will not take the complete screenshot
		
		/*
		 * TakesScreenshot screenshot = (TakesScreenshot) driver; File
		 * sourceFile=screenshot.getScreenshotAs(OutputType.FILE); File
		 * destinationFile=new File
		 * ("C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Screenshots\\sample.jpg"
		 * ); FileHandler.copy(sourceFile, destinationFile);
		 */
		
		// Taking screenshot using Robot class
		
		Robot robot=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		
		File destination=new File("C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Screenshots\\robot.jpg");
		ImageIO.write(source, "jpg", destination);
		
			
		//Practice again
		
		Robot robot2=new Robot ();
		Dimension screensize2=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle2=new Rectangle(screensize2);
		BufferedImage source2=robot2.createScreenCapture(rectangle2);
		File desFile2=new File("C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Screenshots\\robot2.jpg");
		ImageIO.write(source2, "jpg", desFile2);
		
		
		
		
	}

}
